package rvsynth;

public class P43 {
  int current_loc = 1;

  public int /* out (0 = unknown, 1 = true, 2 = false, 3 = out-of-model) */
    run (long state,
         int reset) /* in (0 = none, 1 = hard, 2 = soft) */
  {
    /* local variables */
    long input = 0L, base = 1L;

    /* handle hard resets */
    if (1 == reset) current_loc = 1;

    base = 31L; 
    input = state & base;

    return P43_start(input);
  }

  private int P43_start(long input)
  {
    int output;
    switch (current_loc) {
    case 30:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 30;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 27;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 26;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 17;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 29;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 12;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 29:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 30;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 27;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 26;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 17;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 29;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 12;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 28:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 28;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 27;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 26;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 17;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 22;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 8;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 27:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 28;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 27;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 26;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 17;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 22;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 8;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 26:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 30;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 27;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 26;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 17;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 29;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 12;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 25:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 25;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 24;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 23;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 17;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 22;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 2;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 24:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 25;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 24;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 23;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 17;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 22;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 2;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 23:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 25;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 24;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 23;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 17;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 22;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 2;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 22:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 28;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 27;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 26;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 17;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 22;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 8;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 21:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 21;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 14;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 18;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 17;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 20;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 12;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 20:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 21;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 14;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 18;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 17;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 20;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 12;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 19:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 19;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 14;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 18;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 17;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 16;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 8;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 18:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 21;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 14;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 18;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 17;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 20;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 12;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 17:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 25;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 24;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 23;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 17;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 22;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 2;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 16:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 19;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 14;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 18;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 17;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 16;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 8;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 15:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 15;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 14;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 9;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 13;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 12;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 14:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 19;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 14;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 18;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 17;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 16;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 8;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 13:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 15;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 14;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 9;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 13;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 12;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 12:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 15;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 14;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 9;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 13;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 12;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 11:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 11;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 10;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 9;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 8;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 10:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 11;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 10;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 9;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 8;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 9:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 15;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 14;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 9;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 13;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 12;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 8:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 11;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 10;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 9;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 8;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 7:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 7;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 6;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 5;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 2;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 6:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 7;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 6;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 5;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 2;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 5:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 7;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 6;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 5;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 2;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 4:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 7;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 6;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 5;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 2;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 3:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 11;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 10;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 9;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 8;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 2:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 7;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 6;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 5;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 2;
      }
      else {
        output = 3; /* out-of-model */
      }
      break;
    case 1:
      output = 0; /* unknown */
      if (0L == input) /* (!p & (!q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 7;
      }
      else if (16L == input) /* (!p & (!q & (!r & (!s & t)))) */ {
        output = 0; /* unknown */
        current_loc = 6;
      }
      else if (8L == input) /* (!p & (!q & (!r & (s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 5;
      }
      else if (4L == input) /* (!p & (!q & (r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 4;
      }
      else if (2L == input) /* (!p & (q & (!r & (!s & !t)))) */ {
        output = 0; /* unknown */
        current_loc = 3;
      }
      else if (1L == input) /* (p & (!q & (!r & (!s & !t)))) */ {
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

} /* class P43 */
