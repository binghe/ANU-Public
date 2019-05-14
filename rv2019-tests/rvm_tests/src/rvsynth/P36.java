package rvsynth;

public class P36 {
  int current_loc = 1;

  public int /* output (0 = unknown, 1 = true, 2 = false, 3 = error) */
    run (long state,
         int reset) /* in (0 = none, 1 = hard, 2 = soft) */
  {
    /* local variables */
    long input = 0L, base = 1L;

    /* handle hard resets */
    if (1 == reset) current_loc = 1;

    base = 29L; 
    input = state & base;

    return P36_start(input);
  }

  private int P36_start(long input)
  {
    int output;
    switch (current_loc) {
    case 13:
      output = 2; /* false */
      break;
    case 12:
      output = 0; /* unknown */
      if (4L == input) /* (!p & (r & (!s & !t))) */ {
        output = 2; /* false */
        current_loc = 13;
      }
      else if (16L == input) /* (!p & (!r & (!s & t))) */ {
        output = 0; /* unknown */
        current_loc = 9;
      }
      else if (8L == input) /* (!p & (!r & (s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 12;
      }
      else if (0L == input) /* (!p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 11;
      }
      else if (1L == input) /* (p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 10;
      }
      else {
        output = 3; /* error */
      }
      break;
    case 11:
      output = 0; /* unknown */
      if (4L == input) /* (!p & (r & (!s & !t))) */ {
        output = 2; /* false */
        current_loc = 13;
      }
      else if (16L == input) /* (!p & (!r & (!s & t))) */ {
        output = 0; /* unknown */
        current_loc = 9;
      }
      else if (8L == input) /* (!p & (!r & (s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 12;
      }
      else if (0L == input) /* (!p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 11;
      }
      else if (1L == input) /* (p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 10;
      }
      else {
        output = 3; /* error */
      }
      break;
    case 10:
      output = 0; /* unknown */
      if (4L == input) /* (!p & (r & (!s & !t))) */ {
        output = 2; /* false */
        current_loc = 13;
      }
      else if (16L == input) /* (!p & (!r & (!s & t))) */ {
        output = 0; /* unknown */
        current_loc = 9;
      }
      else if (8L == input) /* (!p & (!r & (s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 12;
      }
      else if (0L == input) /* (!p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 11;
      }
      else if (1L == input) /* (p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 10;
      }
      else {
        output = 3; /* error */
      }
      break;
    case 9:
      output = 0; /* unknown */
      if (4L == input) /* (!p & (r & (!s & !t))) */ {
        output = 2; /* false */
        current_loc = 13;
      }
      else if (16L == input) /* (!p & (!r & (!s & t))) */ {
        output = 0; /* unknown */
        current_loc = 9;
      }
      else if (8L == input) /* (!p & (!r & (s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 12;
      }
      else if (0L == input) /* (!p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 11;
      }
      else if (1L == input) /* (p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 10;
      }
      else {
        output = 3; /* error */
      }
      break;
    case 8:
      output = 0; /* unknown */
      if (16L == input) /* (!p & (!r & (!s & t))) */ {
        output = 0; /* unknown */
        current_loc = 9;
      }
      else if (8L == input) /* (!p & (!r & (s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 5;
      }
      else if (4L == input) /* (!p & (r & (!s & !t))) */ {
        output = 1; /* true */
        current_loc = 4;
      }
      else if (0L == input) /* (!p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 8;
      }
      else if (1L == input) /* (p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 7;
      }
      else {
        output = 3; /* error */
      }
      break;
    case 7:
      output = 0; /* unknown */
      if (16L == input) /* (!p & (!r & (!s & t))) */ {
        output = 0; /* unknown */
        current_loc = 9;
      }
      else if (8L == input) /* (!p & (!r & (s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 5;
      }
      else if (4L == input) /* (!p & (r & (!s & !t))) */ {
        output = 1; /* true */
        current_loc = 4;
      }
      else if (0L == input) /* (!p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 8;
      }
      else if (1L == input) /* (p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 7;
      }
      else {
        output = 3; /* error */
      }
      break;
    case 6:
      output = 0; /* unknown */
      if (16L == input) /* (!p & (!r & (!s & t))) */ {
        output = 0; /* unknown */
        current_loc = 6;
      }
      else if (8L == input) /* (!p & (!r & (s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 5;
      }
      else if (4L == input) /* (!p & (r & (!s & !t))) */ {
        output = 1; /* true */
        current_loc = 4;
      }
      else if (0L == input) /* (!p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* (p & (!r & (!s & !t))) */ {
        output = 1; /* true */
        current_loc = 2;
      }
      else {
        output = 3; /* error */
      }
      break;
    case 5:
      output = 0; /* unknown */
      if (16L == input) /* (!p & (!r & (!s & t))) */ {
        output = 0; /* unknown */
        current_loc = 9;
      }
      else if (8L == input) /* (!p & (!r & (s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 5;
      }
      else if (4L == input) /* (!p & (r & (!s & !t))) */ {
        output = 1; /* true */
        current_loc = 4;
      }
      else if (0L == input) /* (!p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 8;
      }
      else if (1L == input) /* (p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 7;
      }
      else {
        output = 3; /* error */
      }
      break;
    case 4:
      output = 1; /* true */
      break;
    case 3:
      output = 0; /* unknown */
      if (16L == input) /* (!p & (!r & (!s & t))) */ {
        output = 0; /* unknown */
        current_loc = 6;
      }
      else if (8L == input) /* (!p & (!r & (s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 5;
      }
      else if (4L == input) /* (!p & (r & (!s & !t))) */ {
        output = 1; /* true */
        current_loc = 4;
      }
      else if (0L == input) /* (!p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* (p & (!r & (!s & !t))) */ {
        output = 1; /* true */
        current_loc = 2;
      }
      else {
        output = 3; /* error */
      }
      break;
    case 2:
      output = 1; /* true */
      break;
    case 1:
      output = 0; /* unknown */
      if (16L == input) /* (!p & (!r & (!s & t))) */ {
        output = 0; /* unknown */
        current_loc = 6;
      }
      else if (8L == input) /* (!p & (!r & (s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 5;
      }
      else if (4L == input) /* (!p & (r & (!s & !t))) */ {
        output = 1; /* true */
        current_loc = 4;
      }
      else if (0L == input) /* (!p & (!r & (!s & !t))) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* (p & (!r & (!s & !t))) */ {
        output = 1; /* true */
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

} /* class P36 */
