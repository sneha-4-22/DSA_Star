// 11.	Write a program to accept a list of 10 integers in an array, pass the starting address of array in sum function, calculate the sum of the array elements in the function and return the sum calculated in the main function.
#include <stdio.h>

int sum(int arr[]) {
    int total = 0;
    for (int i = 0; i < 10; i++) {
        total += arr[i];
    }
    return total;
}

int main() {
    int arr[] = {23, 67, 89, 90, 12, 23, 14, 56, 2, 3};
    int result = sum(arr);
    printf("Sum of array elements: %d\n", result); 
    return 0;
}
