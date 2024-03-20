#include<stdio.h>
#include<limits.h>
typedef struct {
    int pid; 
    int arrival_time;
    int burst_time; 
} Process;
void srtf_scheduling(Process processes[], int n) {
    int total_time = 0;
    int remaining_time[n]; 
    int completion_time[n];
    int shortest_index;
    for (int i = 0; i < n; i++) {
        remaining_time[i] = processes[i].burst_time;
        completion_time[i] = 0;
    }
    while (1) {
        int min_remaining = INT_MAX;
        for (int i = 0; i < n; i++) {
            if (processes[i].arrival_time <= total_time && remaining_time[i] < min_remaining && remaining_time[i] > 0) {
                min_remaining = remaining_time[i];
                shortest_index = i;
            }
        }
        if (min_remaining == INT_MAX)
            break;
        remaining_time[shortest_index]--;
        total_time++;
        if (remaining_time[shortest_index] == 0)
            completion_time[shortest_index] = total_time;
    }
    printf("SRTF Schedule:\n");
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
    srtf_scheduling(processes, n);
    return 0;
}
