#include<stdio.h>
void fwt(int p[], int n,  int bt[], int wt[]) 
{ 
    wt[0] = 0; 
    for (int  i = 1; i < n ; i++ ) 
        wt[i] =  bt[i-1] + wt[i-1] ; 
} 
void ftat( int p[], int n,  int bt[], int wt[], int tat[]) 
{      
        for (int  i = 0; i < n ; i++) 
        tat[i] = bt[i] + wt[i]; 
} 
  // at bt ct tat(ct-at) wt (tat-bt)
 void findavgTime( int p[], int n, int bt[]) { 
    int wt[n], tat[n], total_wt = 0, total_tat = 0; 
    fwt(p, n, bt, wt); 
    ftat(p, n, bt, wt, tat); 
    printf("Processes   Burst time   Waiting time   Turn around time\n");
    
void main(){
    int p={1,2,3};
    int n=3;
    int bt={10,5,8};
}