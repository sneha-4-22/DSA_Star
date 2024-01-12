#include<stdio.h>
int main(){
    int arr[7];
    printf("out of 7 locations where do you wanna insert");
    int loc;
    scanf("%d",&loc);
    printf("Enter the number: ");
    int num;
    scanf("%d",&num);
    arr[loc]=num;
    printf("%d",arr[loc]);
    return 0;
}