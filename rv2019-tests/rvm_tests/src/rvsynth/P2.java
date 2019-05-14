package rvsynth;

public class P2 {
  int current_loc = 1;

  public int /* output (0 = unknown, 1 = true, 2 = false, 3 = error) */
    run (long state,
         int reset) /* in (0 = none, 1 = hard, 2 = soft) */
  {
    /* local variables */
    long input = 0L, base = 1L;

    /* handle hard resets */
    if (1 == reset) current_loc = 1;

    base = 3L; 
    input = state & base;

    return P2_start(input);
  }

  private int P2_start(long input)
  {
    int output;
    switch (current_loc) {
    case 6:
      output = 2; /* false */
      break;
    case 5:
      output = 0; /* unknown */
      if (1L == input) /* (p & !q) */ {
        output = 2; /* false */
        current_loc = 6;
      }
      else if (0L == input) /* (!p & !q) */ {
        output = 0; /* unknown */
        current_loc = 5;
      }
      else if (2L == input) /* (!p & q) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else {
        output = 3; /* error */
      }
      break;
    case 4:
      output = 0; /* unknown */
      if (0L == input) /* (!p & !q) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & q) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* (p & !q) */ {
        output = 0; /* unknown */
        current_loc = 2;
      }
      else {
        output = 3; /* error */
      }
      break;
    case 3:
      output = 0; /* unknown */
      if (1L == input) /* (p & !q) */ {
        output = 2; /* false */
        current_loc = 6;
      }
      else if (0L == input) /* (!p & !q) */ {
        output = 0; /* unknown */
        current_loc = 5;
      }
      else if (2L == input) /* (!p & q) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else {
        output = 3; /* error */
      }
      break;
    case 2:
      output = 0; /* unknown */
      if (0L == input) /* (!p & !q) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & q) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* (p & !q) */ {
        output = 0; /* unknown */
        current_loc = 2;
      }
      else {
        output = 3; /* error */
      }
      break;
    case 1:
      output = 0; /* unknown */
      if (0L == input) /* (!p & !q) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & q) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* (p & !q) */ {
        output = 0; /* unknown */
        current_loc = 2;
      }
      else {
        output = 3; /* error */
      }
      break;
    default:
      output = -1; /* invalid location */
    }

    return output;
  }

} /* class P2 */
