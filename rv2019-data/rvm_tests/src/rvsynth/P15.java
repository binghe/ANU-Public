package rvsynth;

public class P15 {
  int current_loc = 1;

  public int /* out (0 = unknown, 1 = true, 2 = false, 3 = out-of-model) */
    run (long state,
         int reset) /* in (0 = none, 1 = hard, 2 = soft) */
  {
    /* local variables */
    long input = 0L, base = 1L;

    /* handle hard resets */
    if (1 == reset) current_loc = 1;

    base = 1L; 
    input = state & base;

    return P15_start(input);
  }

  private int P15_start(long input)
  {
    int output;
    switch (current_loc) {
    case 3:
      output = 2; /* false */
      break;
    case 2:
      output = 0; /* unknown */
      if (0L == input) /* !p */ {
        output = 2; /* false */
        current_loc = 3;
      }
      else if (1L == input) /* p */ {
        output = 0; /* unknown */
        current_loc = 2;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 1:
      output = 0; /* unknown */
      if (0L == input) /* !p */ {
        output = 2; /* false */
        current_loc = 3;
      }
      else if (1L == input) /* p */ {
        output = 0; /* unknown */
        current_loc = 2;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    default:
      output = -1; /* invalid location */
    }

    return output;
  }

} /* class P15 */
