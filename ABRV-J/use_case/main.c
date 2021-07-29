#include <stdio.h>
#include "M0.h"

int main(int argc, char **argv)
{
  int monitor_loc, out;

  out = M0 (0b01 /* p & !q */, 1 /* hard */, &monitor_loc);
  printf("%d == 0 (unknown)\n", out);

  out = M0 (0b10 /* !p & q */, 0 /* none */, &monitor_loc);
  printf("%d == 1 (true)\n", out);

  return 0;
}
