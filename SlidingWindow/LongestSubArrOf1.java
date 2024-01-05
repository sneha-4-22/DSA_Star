package SlidingWindow;

public class LongestSubArrOf1 {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int ans = 0;
        int zeroCount = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
         while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            } ans = Math.max(ans, right - left + 1);
        }return ans - 1;
    }
}
