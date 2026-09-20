/**Day 125 – Maximum Subarray (Kadane’s Algorithm)
Concept: Dynamic local/global max tracking.
Problem: Maximum Subarray – LeetCode 53
Goal: Learn bottom-up DP without extra array. */

public class LC_53 {
    public static int maxSubArr(int [] nums){
        int max = nums[0];

        for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int j=i;j<nums.length;j++){
                temp+=nums[j];
                if(temp > max) max = temp;
            }
        }return max;
    }
    
    public static int maxSubArr2(int [] nums){
        int max = nums[0];
        int temp = nums[0];

        for(int i=0;i<nums.length;i++){
            temp = Math.max(nums[i], temp+nums[i]);
            max = Math.max(max, temp);
        }return max;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};   // 6
        // int[] nums = {1};                    // 1  
        // int[] nums = {5,4,-1,7,8};           // 23
        System.out.println(maxSubArr(nums));
        System.out.println(maxSubArr2(nums));
    }
}

/**Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23. */