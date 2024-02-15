#include <stdio.h>
struct Process {
    char name;
    int arrival_time;
    int burst_time;
};
void FCFS(struct Process processes[], int n);
void SJF(struct Process processes[], int n);
void FCFS(struct Process processes[], int n) {
    int waiting_time = 0;
    printf("FCFS Scheduling:\n");
    printf("Process\t Waiting Time\n");
    for (int i = 0; i < n; i++) {
        printf("P%d\t %d\n", i + 1, waiting_time);
        waiting_time += processes[i].burst_time;
    }
    printf("\n");
}
void SJF(struct Process processes[], int n) {
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
    printf("SJF Scheduling:\n");
    printf("Process\t Waiting Time\n");
    for (int i = 0; i < n; i++) {
        printf("P%d\t %d\n", i + 1, waiting_time);
        waiting_time += processes[i].burst_time;
    }
    printf("\n");
}
int main() {
    struct Process processes[] = {
        {'1', 0, 8},
        {'2', 1, 4},
        {'3', 2, 9},
        {'4', 3, 5}
    };
    int n = sizeof(processes) / sizeof(processes[0]);
    FCFS(processes, n);
    SJF(processes, n);
    return 0;
}
