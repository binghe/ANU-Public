/* The offline monitor for LTL patterns */

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>

/* pattern monitors (p0 - p49) */
#include "monitor.h"

/* length of each trace */
#define ROW	50

/* number of variables */
#define COL	6

/* number of traces */
#define TRACE	500

/* number of monitors */
#define MONS	49

// Note: This function returns a pointer to a substring of the original string.
// If the given string was allocated dynamically, the caller must not overwrite
// that pointer with the returned value, since the original pointer must be
// deallocated using the same allocator with which it was allocated.  The return
// value must NOT be deallocated using free() etc. [1]
char *trimwhitespace0 (char *str)
{
  char *end;

  // Trim leading space
  while(isspace((unsigned char)*str)) str++;

  if(*str == 0)  // All spaces?
    return str;

  // Trim trailing space
  end = str + strlen(str) - 1;
  while(end > str && isspace((unsigned char)*end)) end--;

  // Write new null terminator character
  end[1] = '\0';

  return str;
}

// Stores the trimmed input string into the given output buffer, which must be
// large enough to store the result.  If it is too small, the output is
// truncated. [1]
size_t trimwhitespace (char *out, size_t len, const char *str)
{
  const char *end;
  size_t out_size;

  if (len == 0) return 0;

  // Trim leading space
  while (isspace((unsigned char)*str)) str++;

  if (*str == 0) {  // All spaces?
    *out = 0;
    return 1;
  }

  // Trim trailing space
  end = str + strlen(str) - 1;
  while (end > str && isspace((unsigned char)*end)) end--;
  end++;

  // Set output size to minimum of trimmed string length and buffer size minus 1
  out_size = (end - str) < len-1 ? (end - str) : len-1;

  // Copy trimmed string and add null terminator
  memcpy(out, str, out_size);
  out[out_size] = 0;

  return out_size;
}

/* modified from [2] */
void read_csv (int row, char *filename, int **data, int skip_first)
{
  FILE *file = fopen(filename, "r");
  char line[4098];
  int i = 0;

  if (!file) {
    fprintf(stderr, "no such file: %s\n", filename);
    exit(1);
  }

  while (fgets(line, 4098, file) && (i < row)) {
    char* tmp = strdup(line);
    int j = 0;
    const char* tok;

    for (tok = strtok(line, ","); tok && *tok; j++, tok = strtok(NULL, ",\n")) {
      char token[4098];
      trimwhitespace(token, 100, tok);
      // skip the first line
      if (skip_first && 0 == i) continue;

      // the first column is time (integer)
      if (j == 0) {
	data[i][j] = 0; /* atoi(token) */
      } else if (strcmp(token, "true") == 0) {
	data[i][j] = 1;
      } else if (strcmp(token, "false") == 0) {
	data[i][j] = 2;
      } else if (strcmp(token, "error") == 0) {
	data[i][j] = -1;
      } else { /* "unknown" */
	data[i][j] = 0;
      }
#if DEBUG
      printf("(%d,%d) = %d ", i, j, data[i][j]);
#endif
    }
#if DEBUG
    printf("\n");
#endif
    free(tmp);
    i++;
  }

  fclose(file);
}

typedef int (*monitor_ptr) (long, int, int*);

static monitor_ptr monitors[] = {
  p0, p1, p2, p3, p4, p5, p6, p7, p8, p9,
  p10, p11, p12, p13, p14, p15, p16, p17, p18, p19,
  p20, p21, p22, p23, p24, p25, p26, p27, p28, p29,
  p30, p31, p32, p33, p34, p35, p36, p37, p38, p39,
  p40, p41, p42, p43, p44, p45, p46, p47, p48,
  /* p49, p50, p51, p52, p53, p54 (out of VM memory) */
};

/* The offline monitor check only one trace on one monitor and
   print the results in oracle format to stdout. */
void offline_monitor (int argc, char **argv)
{
  int row = ROW + 1; /* title + 50 */
  int col = COL + 1; /*  time + 5  */
  int i, id;
  char ifname[256];
  long p, q, r, s, t, z;
  long *states; /* encoded input */
  int **data;
  int current_loc;
  monitor_ptr monitor;
  char ora_name[256];
  int ora_row = ROW, ora_col = 2;
  int **ora_data = NULL;

  /* which monitor to test? */
  id = atoi(argv[1]);
  strcpy(ifname, argv[2]);

  /* read just one trace file */
  data = (int **) malloc(row * sizeof(int *));
  for (i = 0; i < row; ++i) {
    data[i] = (int *) malloc(col * sizeof(int));
  }

  // read CSV-based trace file, skipping the first line
  read_csv(row, ifname, data, 1 /* skip first line */);

  // encode the trace
  states = (long *) malloc(ROW * sizeof(long));

  for (i = 1; i < row; i++) {
    p = data[i][1]; q = data[i][2]; r = data[i][3];
    s = data[i][4]; t = data[i][5];
    z = data[i][6];

    states[i - 1] = p + 3 * q + 9 * r +
      27 * s + 81 * t + 243 * z;
  }

  /* run the monitor */
  current_loc = 1;
  monitor = monitors[id];

  if (argc > 3) {
    ora_data = (int **)malloc(ora_row * sizeof(int *));
    for (i = 0; i < ora_row; ++i) {
      ora_data[i] = (int *)malloc(ora_col * sizeof(int));
    }

    strcpy(ora_name, argv[3]);
    read_csv(ora_row, ora_name, ora_data, 0 /* no skip fist line */);
  }

  for (i = 0; i < ROW; i++) {
    long state = states[i];
    int out = monitor(state, 0, &current_loc);

    if (argc > 3) {
      if (out != ora_data[i][1]) {
	fprintf(stderr, "error! {monitor: %d, trace: %d, state: %d}\n",
		id, -1, i + 1);
	exit(1);
      }
    }
    else {
      printf("%d, ", i + 1);
      switch (out) {
      case 1:
	printf("true\n"); break;
      case 0:
	printf("unknown\n"); break;
      case 2:
	printf("false\n"); break;
      default:
	printf("error\n");
      }
    }
  }

  /* free all dynamically allocated spaces */
  for (i = 0; i < row; i++) free(data[i]);
  free(data);
  free(states);

  if (ora_data) {
    for (i = 0; i < ora_row; i++) free(ora_data[i]);
    free(ora_data);
  }
}

/* The oracle test function does the following:
   1. Load all 500 traces into memory and encode them into 500 long arrays
   2. For each monitor, load all 500 oracles;
   3. Run the monitor on each oracle files;
   4. Reclaim loaded oracles and go back to step (2).
 */
void oracle_tests (int argc, char **argv)
{
  /* 1. trace memory, each element is the data table (to be read from csv) */
  int row = ROW + 1;
  int col = COL + 1;
  char ifname[256];
  long p, q, r, s, t, z;
  int ***data = NULL;
  long traces[TRACE][ROW]; /* each element is the encoded trace */

  /* 2. oracle memory */
  char ora_name[256];
  int ora_row = ROW, ora_col = 2;
  int **ora_data = NULL;

  /* loop variables */
  int i, j, k;

  /* read all trace data */
  data = (int ***) malloc(TRACE * sizeof(int **));
  for (i = 0; i < TRACE; i++) {
    data[i] = (int **) malloc(row * sizeof(int *));
    for (j = 0; j < row; j++) {
      data[i][j] = (int *) malloc(col * sizeof(int));
    }

    snprintf(ifname, 256, "%s/trace-%d.csv", argv[2], i + 1);
#ifdef DEBUG
    printf("reading trace from %s ...\n", ifname);
#endif
    read_csv(row, ifname, data[i], 1);

    /* encode traces */
    for (j = 1; j < row; j++) {
      p = data[i][j][1]; q = data[i][j][2]; r = data[i][j][3];
      s = data[i][j][4]; t = data[i][j][5];
      z = data[i][j][6];

      traces[i][j - 1] = p + (3) * q + (9) * r +
	(27) * s + (81) * t + (243) * z;
    }
  }

  ora_data = (int **)malloc(ora_row * sizeof(int *));
  for (i = 0; i < ora_row; ++i) {
      ora_data[i] = (int *)malloc(ora_col * sizeof(int));
  }

  /* main loop: for each monitor/property ... */
  for (k = 0; k < MONS; k++) {
    monitor_ptr monitor = monitors[k];
    printf("%d\n", k);

    /* 1. read all 500 oracles of current monitor */
    for (i = 0; i < TRACE; i++) {
      int current_loc = 1;
      snprintf(ora_name, 256, "%s/%d/oracle-%d.csv", argv[3], k, i + 1);
#ifdef DEBUG
      printf("reading oracle from %s ...\n", ora_name);
#endif
      read_csv(ora_row, ora_name, ora_data, 0 /* no skip fist line */);

      for (j = 0; j < ROW; j++) {
	long state = traces[i][j];
	int out = monitor(state, 0, &current_loc);

	if (out != ora_data[j][1]) {
	  fprintf(stderr, "error! {monitor: %d, trace: %d, state: %d, out: %d, oracle: %d}\n",
		  k, i, j + 1, out, ora_data[j][1]);
	  exit(1);
	}
      }
    }
  }

  /* reclaim allocatd memory */
  for (i = 0; i < ora_row; ++i) free(ora_data[i]);
  free(ora_data);
  for (i = 0; i < TRACE; i++) {
    for (j = 0; j < row; j++) free(data[i][j]);
    free(data[i]);
  }
  free(data);
}

int main (int argc, char **argv)
{
  int id;

  if (argc < 3) {
    printf("Usage: %s monitor_id trace_file [oracle_file]\n", argv[0]);
    return 1;
  }

  id = atoi(argv[1]);

  if (id >= 0 && id < MONS) {
    offline_monitor(argc, argv);
  }
  else {
    oracle_tests(argc, argv);
  }

  return 0;
}

/* References:
[1] https://stackoverflow.com/questions/122616/how-do-i-trim-leading-trailing-whitespace-in-a-standard-way
[2] https://gist.github.com/amirmasoudabdol/f1efda29760b97f16e0e
*/
