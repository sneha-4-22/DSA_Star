package Recursion;

import java.util.ArrayList;

public class Sorted {
    public static void main(String[] args) {
        int arr[]={12,56,89,100,90,90,90,89,78};
        System.out.println(isSorted(arr, 0));
        ArrayList<Integer> ans=findAllIndex(arr, 90, 0, new ArrayList<>());
        System.out.println(ans);
    }
    static boolean isSorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && isSorted(arr, index+1);
    }
    static int findIndex(int arr[],int target,int idx){
        if(arr[idx]==arr.length) return -1;
        if(arr[idx]==target) return idx;
        else return findIndex(arr, target, idx+1);
    }
    static ArrayList<Integer> findAllIndex(int[] arr,int target, int idx,ArrayList<Integer> list){
       if(idx==arr.length){
        return list;
       }
       if(arr[idx]==target) list.add(idx);
       return findAllIndex(arr, target, idx+1, list);
    }
}
