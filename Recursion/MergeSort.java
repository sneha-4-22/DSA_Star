package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={3, 5,4,3,2,1};
        arr=sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] sort(int[] arr){
        if(arr.length==1) return arr;
        int mid= arr.length/2;
        int[] l=sort(Arrays.copyOfRange(arr, 0, mid));
        int[] r=sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(l,r);
    }
    static int[] merge(int[] first,int[] sec){
        int[] mix=new int[first.length+sec.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length&&j<sec.length){
            if(first[i]<sec[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=sec[j];
                j++;
            }
            k++;
        } while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }while(j<sec.length){
            mix[k]=sec[j];
            j++;
            k++;
        }
        return mix;
         
    }
    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = (s + e) / 2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);
        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }

}
