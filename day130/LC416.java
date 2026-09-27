/**Day 130 – Partition Equal Subset Sum
Concept: Use subset sum to partition array equally.
Problem: Partition Equal Subset Sum – LeetCode 416
Goal: Apply subset-sum variation. */

public class LC416 {
    public static boolean canPartition(int[] nums) {

        int total = 0;
        for(int num : nums) {total += num;}

        // Odd total cannot be divided equally
        if(total % 2 != 0) {return false;}

        int target = total / 2;
        boolean[][] dp = new boolean[nums.length + 1][target + 1];

        // Sum 0 is always possible
        for(int i = 0; i <= nums.length; i++) {dp[i][0] = true;}

        for(int i = 1; i <= nums.length; i++) {
            for(int sum = 1; sum <= target; sum++) {

                // Don't take current number
                dp[i][sum] = dp[i - 1][sum];

                // Take current number if possible
                if(nums[i - 1] <= sum) { dp[i][sum] =dp[i][sum] || dp[i - 1][sum - nums[i - 1]]; }
            }
        }return dp[nums.length][target];
    }
    public static void main(String [] args){
        int [] nums = {1,5,11,5};
        // int [] nums = {1,2,3,5};
        // int [] nums = {1,1,1,1};
        // int [] nums = {2,2,3,5};
        // int [] nums = {3,3,3,4,5};
        System.out.println(canPartition(nums));
    }
}

/**
[1,5,11,5]       → true
[1,2,3,5]        → false
[1,1,1,1]        → true
[2,2,3,5]        → false
[3,3,3,4,5]      → true
 */