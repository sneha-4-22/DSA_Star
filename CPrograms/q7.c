#include<stdio.h>
int fibo(int n){
    if(n==0) return 0;
    if(n==1) return 1;
    return fibo(n-1)+fibo(n-2);
}
int main(){
   int n;
   printf("Enter the number of terms to which you want the fibonacchi series: ");
   scanf("%d",&n);
   int a=0;
   int b=1;
   printf("Fibonacci Series: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", fibo(i));
    }
}
