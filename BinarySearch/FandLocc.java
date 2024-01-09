package BinarySearch;

public class FandLocc {
    public int[] searchRange(int[] nums, int target) {
        int f=-1,s=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(f==-1) f=i;
                s=i;
            }
        }return new int[]{f,s};
    }
}
