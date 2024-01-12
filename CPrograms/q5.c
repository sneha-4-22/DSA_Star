#include <stdio.h>

int main() {
    int choice;
    float num1, num2, num3, total, average;
    printf("1. Read three numbers\n");
    printf("2. Calculate total\n");
    printf("3. Calculate average\n");
    printf("4. Display smallest and largest\n");
    printf("5. Exit\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    switch (choice) {
        case 1:
            printf("Enter three numbers: ");
            scanf("%f %f %f", &num1, &num2, &num3);
            break;
        case 2:
            total = num1 + num2 + num3;
            printf("Total: %.2f\n", total);
            break;
        case 3:
            average = total / 3;
            printf("Average: %.2f\n", average);
            break;
        case 4:
            if(num1>=num2&&num1>=num3) printf("Largest is %d",&num1);
            else if(num2>=num3&&num2>=num3) printf("LARGEST is %d",&num2);
            else printf("Largest is %d",&num3);
            break;
        case 5:
            printf("Exiting...\n");
            break;
        default:
            printf("Invalid choice\n");
    }

    return 0;
}
