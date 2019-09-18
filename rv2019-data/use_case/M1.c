#include "M1.h"

int /* [out] (0 = unknown, 1 = true, 2 = false, 3 = out-of-model) */
  M1
    (long state,       /* [in] */
     int  reset,       /* [in] (0 = none, 1 = hard, 2 = soft) */
     int *current_loc) /* [in/out] */
{
  /* local variables */
  long input = 0L, base = 1L;
  int  output;

  /* check input pointer */
  if (!current_loc) return -1;	/* invalid arguments */

  /* handle hard resets */
  if (1 == reset) *current_loc = 1; /* initial location */
  else if (2 == reset) {
    switch (*current_loc) {
    case 10: *current_loc = 1; break;
    case 9: *current_loc = 6; break;
    case 8: *current_loc = 6; break;
    case 7: *current_loc = 1; break;
    case 6: *current_loc = 6; break;
    case 5: *current_loc = 1; break;
    case 4: *current_loc = 6; break;
    case 3: *current_loc = 6; break;
    case 2: *current_loc = 1; break;
    case 1: *current_loc = 1; break;
    default: ;
    }
  }

  input = state;

M1_start:
  /* go to current location */
  switch (*current_loc) {
  case 10:
    output = 1;		/* true */
    goto M1_loc_10;
  case 9:
    output = 1;		/* true */
    goto M1_loc_9;
  case 8:
    output = 1;		/* true */
    goto M1_loc_8;
  case 7:
    output = 2;		/* false */
    goto M1_loc_7;
  case 6:
    output = 1;		/* true */
    goto M1_loc_6;
  case 5:
    output = 2;		/* false */
    goto M1_loc_5;
  case 4:
    output = 2;		/* false */
    goto M1_loc_4;
  case 3:
    output = 2;		/* false */
    goto M1_loc_3;
  case 2:
    output = 1;		/* true */
    goto M1_loc_2;
  case 1:
    output = 0;		/* unknown */
    goto M1_loc_1;
  default:
    output = -1;	/* invalid location */
    goto M1_exit;
  }

M1_loc_10:
  switch (input) {
  case 2L: /* (!p & q) */
    output = 1; /* true */
    *current_loc = 2; break;
  case 1L: /* (p & !q) */
    output = 1; /* true */
    *current_loc = 8; break;
  default:
    output = 3; /* out-of-model */
  }
  goto M1_exit;

M1_loc_9:
  switch (input) {
  case 2L: /* (!p & q) */
    output = 1; /* true */
    *current_loc = 10; break;
  case 1L: /* (p & !q) */
    output = 1; /* true */
    *current_loc = 9; break;
  default:
    output = 3; /* out-of-model */
  }
  goto M1_exit;

M1_loc_8:
  switch (input) {
  case 2L: /* (!p & q) */
    output = 1; /* true */
    *current_loc = 10; break;
  case 1L: /* (p & !q) */
    output = 1; /* true */
    *current_loc = 9; break;
  default:
    output = 3; /* out-of-model */
  }
  goto M1_exit;

M1_loc_7:
  switch (input) {
  case 2L: /* (!p & q) */
    output = 2; /* false */
    *current_loc = 7; break;
  case 1L: /* (p & !q) */
    output = 2; /* false */
    *current_loc = 3; break;
  default:
    output = 3; /* out-of-model */
  }
  goto M1_exit;

M1_loc_6:
  switch (input) {
  case 2L: /* (!p & q) */
    output = 1; /* true */
    *current_loc = 10; break;
  case 1L: /* (p & !q) */
    output = 1; /* true */
    *current_loc = 9; break;
  default:
    output = 3; /* out-of-model */
  }
  goto M1_exit;

M1_loc_5:
  switch (input) {
  case 2L: /* (!p & q) */
    output = 2; /* false */
    *current_loc = 7; break;
  case 1L: /* (p & !q) */
    output = 2; /* false */
    *current_loc = 3; break;
  default:
    output = 3; /* out-of-model */
  }
  goto M1_exit;

M1_loc_4:
  switch (input) {
  case 2L: /* (!p & q) */
    output = 2; /* false */
    *current_loc = 5; break;
  case 1L: /* (p & !q) */
    output = 2; /* false */
    *current_loc = 4; break;
  default:
    output = 3; /* out-of-model */
  }
  goto M1_exit;

M1_loc_3:
  switch (input) {
  case 2L: /* (!p & q) */
    output = 2; /* false */
    *current_loc = 5; break;
  case 1L: /* (p & !q) */
    output = 2; /* false */
    *current_loc = 4; break;
  default:
    output = 3; /* out-of-model */
  }
  goto M1_exit;

M1_loc_2:
  switch (input) {
  case 2L: /* (!p & q) */
    output = 1; /* true */
    *current_loc = 2; break;
  case 1L: /* (p & !q) */
    output = 1; /* true */
    *current_loc = 8; break;
  default:
    output = 3; /* out-of-model */
  }
  goto M1_exit;

M1_loc_1:
  switch (input) {
  case 1L: /* (p & !q) */
    output = 2; /* false */
    *current_loc = 3; break;
  case 2L: /* (!p & q) */
    output = 1; /* true */
    *current_loc = 2; break;
  default:
    output = 3; /* out-of-model */
  }
  goto M1_exit;

  /* end of function */
M1_exit:
  return output;
}

