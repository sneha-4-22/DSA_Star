#include<stdio.h>
typedef struct {
    int pid; 
    int arrival_time; 
    int burst_time; 
} Process;
void round_robin_scheduling(Process processes[], int n, int quantum) {
    int remaining_time[n]; 
    int completion_time[n]; 
    int current_time = 0; 
    int time_quantum = quantum; 
    int index = 0; 
    for (int i = 0; i < n; i++) {
        remaining_time[i] = processes[i].burst_time;
        completion_time[i] = 0;
    }
    while (1) {
        int done = 1;
        for (int i = 0; i < n; i++) {
            if (remaining_time[i] > 0) {
                done = 0; 
                if (remaining_time[i] > time_quantum) {
                    current_time += time_quantum;
                    remaining_time[i] -= time_quantum;
                } else {
                    current_time += remaining_time[i];
                    remaining_time[i] = 0;
                    completion_time[i] = current_time;
                }
            }
        }
        if (done == 1)
            break;
    }
    printf("Round Robin Schedule:\n");
    printf("PID\tArrival Time\tBurst Time\tCompletion Time\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t%d\t\t%d\t\t%d\n", processes[i].pid, processes[i].arrival_time,
               processes[i].burst_time, completion_time[i]);
    }
}
int main() {
    Process processes[] = {
        {1, 0, 8},
        {2, 1, 4},
        {3, 2, 9},
        {4, 4, 5},
    };
    int n = sizeof(processes) / sizeof(processes[0]);
    int quantum = 3; 
    round_robin_scheduling(processes, n, quantum);
    return 0;
}
