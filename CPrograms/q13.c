#include<stdio.h>
typedef struct {
    int pid; 
    int arrival_time; 
    int burst_time; 
} Process;

void sjf_scheduling(Process processes[], int n) {
    int total_time = 0; 
    int completion_time[n]; 
    
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (processes[j].burst_time > processes[j + 1].burst_time) {
                // Swap processes
                Process temp = processes[j];
                processes[j] = processes[j + 1];
                processes[j + 1] = temp;
            }
        }
    }

    
    for (int i = 0; i < n; i++) {
        total_time += processes[i].burst_time;
        completion_time[i] = total_time;
    }
    printf("SJF Schedule:\n");
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
        {4, 3, 5},
    };
    int n = sizeof(processes) / sizeof(processes[0]);
    sjf_scheduling(processes, n);
    return 0;
}
