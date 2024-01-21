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
}
