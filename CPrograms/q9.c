// 9.	In a class there are 10 students. Each student is supposed to appear in three tests. Write a program using 2D array to print 
// (a)	The marks obtained by each student in different subjects.
// (b)	Sort the average obtained by each student.
#include <stdio.h>
#define std 10
#define test 3
void inputMarks(int marks[][test]) {
    printf("Enter marks for each student in each test:\n");
    for (int i = 0; i < std; i++) {
        printf("Student %d: ", i + 1);
        for (int j = 0; j < test; j++) {
            scanf("%d", &marks[i][j]);
        }
    }
}
void printMarks(int marks[][std]) {
    printf("Marks obtained by each student in different subjects:\n");

    for (int i = 0; i < std; i++) {
        printf("Student %d: ", i + 1);
        for (int j = 0; j < test; j++) {
            printf("%d ", marks[i][j]);
        }
        printf("\n");
    }
}
void calculateAverage(int marks[][test], float averages[]) {
    for (int i = 0; i < std; i++) {
        int sum = 0;
        for (int j = 0; j < test; j++) {
            sum += marks[i][j];
        }
        averages[i] = (float)sum / test;
    }
}
void sortAverages(float averages[]) {
    for (int i = 0; i < std - 1; i++) {
        for (int j = 0; j < std - i - 1; j++) {
            if (averages[j] > averages[j + 1]) {
                float temp = averages[j];
                averages[j] = averages[j + 1];
                averages[j + 1] = temp;
            }
        }
    }
}
int main() {
    int marks[std][test];
    float averages[std];
    inputMarks(marks);
    printMarks(marks);
    calculateAverage(marks, averages);
    sortAverages(averages);
    printf("\nSorted averages:\n");
    for (int i = 0; i < std; i++) {
        printf("Student %d: %.2f\n", i + 1, averages[i]);
    }
    return 0;
}