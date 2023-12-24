package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int arr[]={78,65,23,12,90,54};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int small=i;
            for(int j=i+1;j<n;j++){
                if(arr[small]>arr[j]) small=j;
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
