#include <stdio.h>
int main() {
    float quantity, rate, discount, tax, total;
    printf("Enter quantity: ");
    scanf("%f", &quantity);
    printf("Enter rate: ");
    scanf("%f", &rate);
    printf("Enter discount percentage: ");
    scanf("%f", &discount);
    printf("Enter tax percentage: ");
    scanf("%f", &tax);
    total = quantity * rate;
    total = total - (total * discount / 100);
    total = total + (total * tax / 100);
    printf("Total Bill Amount: %.2f\n", total);
    return 0;
}
