package Recursion;

public class Fibo {
        public int tribonacci(int n) {
            int arr[] = new int[3+n];
            arr[0]=0;
            arr[1]=1;
            arr[2]=1;
            for(int i=3;i<=n;i++){
                arr[i]=arr[i-3]+arr[i-2]+arr[i-1];
            }
            return arr[n];
        }
    }

