//new

/**Day 133 – Target Sum
Concept: Transform into subset-sum variant with signs.
Problem: Target Sum – LeetCode 494
Goal: Handle DP with negative indexing logic. */

public class LC494 {
    public static int find(int [] nums,int t){
        int total = 0;

        for(int num: nums){ total += num;}

        if(Math.abs(t)>total){ return 0;}

        int offset = total;

        int [] [] dp = new int [nums.length+1][2*total+1];

        dp[0][offset] = 1;

        for(int i=1;i<=nums.length;i++){
            int num = nums[i-1];
            for(int sum = -total;sum <= total;sum++){
                int index = sum +offset;

                if(dp[i-1][index] != 0){
                    dp[i][sum+num+offset]+= dp[i-1][index]; //add
                    dp[i][sum-num+offset]+= dp[i-1][index]; //subtract
                }
            }
        }

        return dp[nums.length][t+offset];
    }
    
    public static void printWays(int[] nums, int target) {
    int[] signs = new int[nums.length];
    print(nums, target, 0, 0, signs);
    }

    public static void print(int[] nums, int target,int index, int sum, int[] signs) {

    // All numbers have been used
    if(index == nums.length) {
        if(sum == target) {
            for(int i = 0; i < nums.length; i++) {

                if(signs[i] == 1) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }System.out.print(nums[i] + " ");
            }System.out.println("= " + target);
        }return;
    }

    // Choose +
    signs[index] = 1;
    print(nums, target, index + 1,sum + nums[index], signs);

    // Choose -
    signs[index] = -1;
    print(nums, target, index + 1,sum - nums[index], signs);
    }

    public static void main(String[] args) {
        int [] nums = { 1,1,1,1,1};int target = 3;
        // int [] nums = { 1};int target = 1;
        System.out.println(find(nums,target));

        // test
        System.out.println("All valid ways:");
        printWays(nums, target);
    }
}

/**Example 1:
Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3

Example 2:
Input: nums = [1], target = 1
Output: 1 */

