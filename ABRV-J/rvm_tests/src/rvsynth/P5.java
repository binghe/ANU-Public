package rvsynth;

public class P5 {
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

    return P5_start(input);
  }

  private int P5_start(long input)
  {
    int output;
    switch (current_loc) {
    case 3:
      output = 0; /* unknown */
      if (0L == input) /* !p */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* p */ {
        output = 1; /* true */
        current_loc = 2;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 2:
      output = 1; /* true */
      break;
    case 1:
      output = 0; /* unknown */
      if (0L == input) /* !p */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* p */ {
        output = 1; /* true */
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

} /* class P5 */
