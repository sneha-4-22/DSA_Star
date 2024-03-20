package ARRAYS;

import java.util.ArrayList;
import java.util.HashSet;

public class insertion2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])){
                ans.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int [] arr = new int[ans.size()];

        for(int i=0; i<ans.size(); i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}
