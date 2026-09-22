/**Day 126 – Longest Increasing Subsequence (LIS)
Concept: DP with nested loops and memoization.
Problem: LIS – LeetCode 300
Goal: Practice multi-state DP. */

public class LC300 {
    public static int longest(int [] nums){
        int c = 0;
        int p1 = nums[0];
        int p2 = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]> p1 && p2 < nums[i]){
                c++;
                p1 = nums[i];
            }else if(nums[i]>p1 && p2 > nums[i]){
                c++;
                p2 = p1;
                p1= nums[i];
            }else if(nums[i]<p2){ 
                c++;
                p2 = nums[i];
            }
        }return c;
    }
    
    public static int longest2(int [] nums){
        int c = 0;
        int p1 = nums[0];
        int p2 = nums[0];

        for(int i=0;i<nums.length;i++){
            int temp=0;p1=nums[i];
            for(int j=i;j<nums.length;j++){
                if(nums[j]>p1 && nums[j]>p2){
                    p1=nums[j];
                    temp++;
                }else{
                    p2 = p1;
                    p1 = nums[i];
                }
            }if(temp>c) c=temp;
        }return c+1;
    }
    
    public static int longest3(int [] nums){
        if(nums.length <1) return 0;

        int max=0;
        int[] dp = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i], dp[j]+1);
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            max = Math.max(max, dp[i]);
        }return max;
    }
    public static void main(String[] args) {
        int [] nums = {10,9,2,5,3,7,101,18};         //4    
        // int [] nums = {0,1,0,3,2,3};              //4    
        // int [] nums = {7,7,7,7,7,7,7};            //1    
        System.out.println(longest(nums));
        System.out.println(longest2(nums));
        System.out.println(longest3(nums));
    }
}
/**Example 1:
Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.

Example 2:
Input: nums = [0,1,0,3,2,3]
Output: 4

Example 3:
Input: nums = [7,7,7,7,7,7,7]
Output: 1 */