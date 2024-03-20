#include <stdio.h>
void sort(int p[],int at[],int bt[],int n){
    for(int i=0;i<n;i++){

    }
}
void caltime(int p[], int at[], int bt[], int n) {
  int ct[n], wt[n], tat[n];
  ct[0] = at[0] + bt[0]; 
  for (int i = 1; i < n; i++) {
    ct[i] = ct[i - 1] + bt[i];
  }

  for (int i = 0; i < n; i++) {
    tat[i] = ct[i] - at[i];
  }

  for (int i = 0; i < n; i++) {
    wt[i] = tat[i] - bt[i];
  }


  printf("Process\tArrival Time\tBurst Time\tCompletion Time\tTurnaround Time\tWaiting Time\n");
  for (int i = 0; i < n; i++) {
    printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", p[i], at[i], bt[i], ct[i], tat[i], wt[i]);
  }
}

int main() {
  int n = 3; 
  int p[] = {1, 2, 3};
  int at[] = {0,4,7};
  int bt[] = {3, 4, 5}; 
  caltime(p, at, bt, n);

  return 0;
}
