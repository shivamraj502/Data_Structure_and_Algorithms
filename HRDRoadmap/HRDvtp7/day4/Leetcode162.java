// package HRDRoadmap.HRDvtp7.day4;
public class Leetcode162 {
    public static int findPeakElement(int[] nums) {
        int res = -1;

        if(nums.length>1){
        for(int i=0;i<nums.length;i++){
            if(i == 0 || i == nums.length-1){
                if(nums[0]>nums[1]){return 0;}
                if(nums[nums.length-1]>nums[nums.length-2]){return (nums.length-1);}
            }else{
                if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){return i;}
            }
        }return -1;
        }else return 0;
    }
    public static void main(String[] args) {
        // int [] nums = {1,2,3,1};
        int [] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
}
