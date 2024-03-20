package ARRAYS;
import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        Map<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.getOrDefault(nums[i],0)==0){
                h.put(nums[i],1);
            }else{
                l1.add(nums[i]);
            }
        }
        return l1;
    }
}
