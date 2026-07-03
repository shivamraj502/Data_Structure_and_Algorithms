// package HRDRoadmap.HRDvtp7.day5;
public class LC268 {
    public static int missingNumber(int[] nums) {   // also solve it using hashmap,math,bit manipulation, brute force technique.
        int miss = 0;

        if(nums.length > 1){ 
        for(int i=0;i<=nums.length;i++){
            boolean bool=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==miss){miss++;bool = true;break;}
            }
            if(bool == false){
                return miss;
            }
        }return miss;
        }else{
            if(nums[0]==0) return 1;
            else return 0;
        }
    }
    public static int missingNumber2(int[] nums) {
        int temp =0;
        
        int sum = nums.length*(nums.length+1)/2;
        for(int i=0;i<nums.length;i++){
            temp += nums[i];
        }return sum-temp;
    }
    public static void main(String[] args) {
        // int [] nums = {3,0,1};
        // int [] nums = {0,1};
        int [] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber2(nums));
    }
}

/*
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation:
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation:
n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8 */