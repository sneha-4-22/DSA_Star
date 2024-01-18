package Recursion;

public class Stairs {
        public int minCostClimbingStairs(int[] cost) {
            int stairs = cost.length;
            int dp[] = new int[stairs];     
            dp[0] = cost[0]; dp[1] = cost[1];   
            for(int i = 2; i < stairs; i++)     
                dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);   
            return dp[stairs-1] <= dp[stairs-2] ? dp[stairs-1] : dp[stairs-2];  
        }
    }

