// package HRDRoadmap.HRDvtp7.day8;
public class LC560 {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int sum = nums[i];
            for(int j=i;j<nums.length;j++){
                if(i != j){sum += nums[j];}
                if(sum == k){count++;}
            }
        }return count;
    }
    
    public static void main(String[] args) {
        // int [] nums = {1,1,1};
        // int k = 2;
        int [] nums = {1,2,3};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }
}

/**
Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 */