package Recursion;

import java.util.Arrays;

public class Star {
    public static void main(String[] args) {
        int[] arr={23,1,2,4,5,67,12,90,1,2,3};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void yo1(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            yo1(r, c+1);
            System.out.print("*");
        }else{
            yo1(r-1, 0);
            System.out.println();
        }
    }
    static void yo(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            yo(r, c+1);
        }else{
            System.out.println();
            yo(r-1, 0);
        }
    }
    static void bubble(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr,r, c+1);
        }else{
            
            bubble(arr, r-1, 0);
        }
    }
}
