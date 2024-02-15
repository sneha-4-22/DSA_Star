// 11.	Write a program to accept a list of 10 integers in an array, pass the starting address of array in sum function, calculate the sum of the array elements in the function and return the sum calculated in the main function.
//#include <stdio.h>

// int sum(int arr[]) {
//     int total = 0;
//     for (int i = 0; i < 10; i++) {
//         total += arr[i];
//     }
//     return total;
// }

// int main() {
//     int arr[] = {23, 67, 89, 90, 12, 23, 14, 56, 2, 3};
//     int result = sum(arr);
//     printf("Sum of array elements: %d\n", result); 
//     return 0;
// }
#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[]) {
    if (argc != 3) {
        printf("Usage: %s <number1> <number2>\n", argv[0]);
        return 1;
    }
    int num1 = atoi(argv[1]);
    int num2 = atoi(argv[2]);
    int sum = num1 + num2;
    printf("The sum of %d and %d is: %d\n", num1, num2, sum);
    return 0;
}
