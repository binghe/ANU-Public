#include <stdio.h>
#include "M0.h"

int main(int argc, char **argv)
{
  int location;

  printf("%d == 0 (unknown)\n", M0(1 /* p */, 1 /* hard */, &location));
  printf("%d == 1 (true)\n",    M0(2 /* q */, 0 /* none */, &location));

  return 0;
}
