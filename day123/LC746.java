/**Day 123 – Min Cost Climbing Stairs
Concept: DP with array cost tracking.
Problem: Min Cost Climbing Stairs – LeetCode 746
Goal: Learn cost optimization using DP array. */

public class LC746 {
    public static int climb(int []nums){
        int[]dp= new int[nums.length];
        return Math.min(helper(nums,nums.length-1,dp),helper(nums,nums.length-2,dp));
    }
    public static int helper(int[] cost,int n,int[] dp){
        if(n==0) return cost[0];
        if(n==1) return cost[1];
        if(dp[n] != 0) return dp[n];

        dp[n] = cost[n]+Math.min(helper(cost,n-1,dp), helper(cost, n-2, dp));
        return dp[n];
    }

    public static int climb2(int []nums){
        int[]dp= new int[nums.length];
        dp[0]=nums[0];dp[1]=nums[1];

        for(int i=2;i<nums.length;i++){
            dp[i]=nums[i]+Math.min(dp[i-1], dp[i-2]);
        }return Math.min(dp[nums.length-1], dp[nums.length-2]);
    }

    public static int climb3(int []cost){
        int n = cost.length;
        int prev2 = cost[0];
        int prev1 = cost[1];

        for(int i = 2; i < n; i++) {
            int current = cost[i] + Math.min(prev1, prev2);

            prev2 = prev1;
            prev1 = current;
        }return Math.min(prev1, prev2);
    }
    public static void main(String[] args) {
        int []nums ={10,15,20};
        System.out.println(climb(nums));
        System.out.println(climb2(nums));
        System.out.println(climb3(nums));
    }
}
/**
Example 1:
Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.

Example 2:
Input: cost = [1,100,1,1,1,100,1,1,100,1]
               0  1  2 3 4  5  6 7  8  9
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.
 */