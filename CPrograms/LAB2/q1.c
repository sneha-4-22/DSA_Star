#include <stdio.h>
#include <unistd.h>
int main() {
    pid_t pid = fork(); 

    if (pid == 0) {
        printf("Child process is running with PID: %d\n", getpid());
    } else if (pid > 0) {
        printf("Parent process is running with PID: %d\n", getpid());
    } else {
        fprintf(stderr, "Failed to create child process\n");
        return 1;
    }

    return 0;
}
