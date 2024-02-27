#include <stdio.h>
#include <stdbool.h>

struct Process {
    char name;
    int arrival_time;
    int burst_time;
    int remaining_time; // For preemptive algorithms
};

void FCFS_non_preemptive(struct Process processes[], int n);
void SJF_non_preemptive(struct Process processes[], int n);
void FCFS_preemptive(struct Process processes[], int n);
void SJF_preemptive(struct Process processes[], int n);

void FCFS_non_preemptive(struct Process processes[], int n) {
    int waiting_time = 0;
    printf("FCFS Non-Preemptive Scheduling:\n");
    printf("Process\t Waiting Time\n");
    for (int i = 0; i < n; i++) {
        printf("P%d\t %d\n", i + 1, waiting_time);
        waiting_time += processes[i].burst_time;
    }
    printf("\n");
}

void SJF_non_preemptive(struct Process processes[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (processes[j].burst_time > processes[j + 1].burst_time) {
                struct Process temp = processes[j];
                processes[j] = processes[j + 1];
                processes[j + 1] = temp;
            }
        }
    }
    int waiting_time = 0;
    printf("SJF Non-Preemptive Scheduling:\n");
    printf("Process\t Waiting Time\n");
    for (int i = 0; i < n; i++) {
        printf("P%d\t %d\n", i + 1, waiting_time);
        waiting_time += processes[i].burst_time;
    }
    printf("\n");
}

void FCFS_preemptive(struct Process processes[], int n) {
    printf("FCFS Preemptive Scheduling is not possible as FCFS is a non-preemptive scheduling algorithm.\n\n");
}

void SJF_preemptive(struct Process processes[], int n) {
    printf("SJF Preemptive Scheduling is not straightforward to implement within this example.\n\n");
}

int main() {
    struct Process processes[] = {
        {'1', 0, 8, 8},
        {'2', 1, 4, 4},
        {'3', 2, 9, 9},
        {'4', 3, 5, 5}
    };
    int n = sizeof(processes) / sizeof(processes[0]);
    
    FCFS_non_preemptive(processes, n);
    SJF_non_preemptive(processes, n);
    FCFS_preemptive(processes, n);
    SJF_preemptive(processes, n);
    
    return 0;
}
