#include<stdio.h>
struct Process{
    int pid;
    int burst_time;
    int priority;
};
void schedulingAlgo(struct Process processes[], int n){
    int tt = 0;
    int wt = 0;
    int tat = 0;
    printf("Process\tBurst Time\tPriority\tWaiting Time\tTurnaround Time\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\n", processes[i].pid, processes[i].burst_time,
               processes[i].priority, wt, tat);
        wt += tt;
        tt += processes[i].burst_time;
        tat += tt;
    }
    float awt = (float)wt / n;
    float atat = (float)tat / n;
    printf("\nAverage Waiting Time: %.2f\n", awt);
    printf("Average Turnaround Time: %.2f\n", atat);  
}
int main() {
    struct Process processes[] = {
        {1, 5, 2},
        {2, 7, 1},
        {3, 6, 3}
    };
    int n = sizeof(processes) / sizeof(processes[0]);
    schedulingAlgo(processes, n);
    return 0;
}