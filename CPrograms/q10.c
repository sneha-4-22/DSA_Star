// 10.	Accept any two strings from the user. Display whether both the strings are equal or not. (do not use standard functions).
#include <stdio.h>
#define NUM_STUDENTS 10
#define NUM_TESTS 3
void inputMarks(int marks[][NUM_TESTS]) {
    printf("Enter marks for each student in each test:\n");

    for (int i = 0; i < NUM_STUDENTS; i++) {
        printf("Student %d: ", i + 1);
        for (int j = 0; j < NUM_TESTS; j++) {
            scanf("%d", &marks[i][j]);
        }
    }
}
void printMarks(int marks[][NUM_TESTS]) {
    printf("Marks obtained by each student in different subjects:\n");
    for (int i = 0; i < NUM_STUDENTS; i++) {
        printf("Student %d: ", i + 1);
        for (int j = 0; j < NUM_TESTS; j++) {
            printf("%d ", marks[i][j]);
        }
        printf("\n");
    }
}
void calculateAverage(int marks[][NUM_TESTS], float averages[]) {
    for (int i = 0; i < NUM_STUDENTS; i++) {
        int sum = 0;
        for (int j = 0; j < NUM_TESTS; j++) {
            sum += marks[i][j];
        }
        averages[i] = (float)sum / NUM_TESTS;
    }
}

void sortAverages(float averages[]) {
    for (int i = 0; i < NUM_STUDENTS - 1; i++) {
        for (int j = 0; j < NUM_STUDENTS - i - 1; j++) {
            if (averages[j] > averages[j + 1]) {
                float temp = averages[j];
                averages[j] = averages[j + 1];
                averages[j + 1] = temp;
            }
        }
    }
}

int main() {
    int marks[NUM_STUDENTS][NUM_TESTS];
    float averages[NUM_STUDENTS];
    inputMarks(marks);
    printMarks(marks);
    calculateAverage(marks, averages);
    sortAverages(averages);
    printf("\nSorted averages:\n");
    for (int i = 0; i < NUM_STUDENTS; i++) {
        printf("Student %d: %.2f\n", i + 1, averages[i]);
    }

    return 0;
}
