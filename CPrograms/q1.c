#include <stdio.h>
int main() {
  int a=90;
  int b=89;
  int temp=a;
  a=b;
  b=temp;
  printf("Value of a after swapping %d\n", a);
  printf("Value of b after swapping: %d", b);
  
}