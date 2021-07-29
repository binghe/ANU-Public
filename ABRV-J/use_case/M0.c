#include "M0.h"

int /* [out] (0 = unknown, 1 = true, 2 = false, 3 = out-of-model) */
  M0
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
    case 4: *current_loc = 1; break;
    case 3: *current_loc = 1; break;
    case 2: *current_loc = 1; break;
    case 1: *current_loc = 1; break;
    default: ;
    }
  }

  input = state;

M0_start:
  /* go to current location */
  switch (*current_loc) {
  case 4:
    output = 1;		/* true */
    goto M0_loc_4;
  case 3:
    output = 1;		/* true */
    goto M0_loc_3;
  case 2:
    output = 0;		/* unknown */
    goto M0_loc_2;
  case 1:
    output = 0;		/* unknown */
    goto M0_loc_1;
  default:
    output = -1;	/* invalid location */
    goto M0_exit;
  }

M0_loc_4:
  switch (input) {
  case 2L: /* (!p & q) */
    output = 1; /* true */
    *current_loc = 3; break;
  case 1L: /* (p & !q) */
    output = 1; /* true */
    *current_loc = 4; break;
  default:
    output = 3; /* out-of-model */
  }
  goto M0_exit;

M0_loc_3:
  switch (input) {
  case 2L: /* (!p & q) */
    output = 1; /* true */
    *current_loc = 3; break;
  case 1L: /* (p & !q) */
    output = 1; /* true */
    *current_loc = 4; break;
  default:
    output = 3; /* out-of-model */
  }
  goto M0_exit;

M0_loc_2:
  switch (input) {
  case 2L: /* (!p & q) */
    output = 1; /* true */
    *current_loc = 3; break;
  case 1L: /* (p & !q) */
    output = 0; /* unknown */
    *current_loc = 2; break;
  default:
    output = 3; /* out-of-model */
  }
  goto M0_exit;

M0_loc_1:
  switch (input) {
  case 2L: /* (!p & q) */
    output = 1; /* true */
    *current_loc = 3; break;
  case 1L: /* (p & !q) */
    output = 0; /* unknown */
    *current_loc = 2; break;
  default:
    output = 3; /* out-of-model */
  }
  goto M0_exit;

  /* end of function */
M0_exit:
  return output;
}

