package Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int arr[]={78,65,23,12,90,54};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int current=arr[i];//78
            int j=i-1;
            while(j>=0&&current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
