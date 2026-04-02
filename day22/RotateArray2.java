/**
 * WEEK-4: Strengthen Arrays + Strings
Day 22 — Array Rotation
Concept: Rotate array left/right by k.
Problem: Rotate Array – LeetCode 189 
Topic name: Array Rotation (Two-Pointer / Reversal Technique) */

public class RotateArray2 {
    public static void rotate(int[] nums, int k) {
        if(nums.length<k){
            for(int l= 0;l<nums.length/2;l++){
            int temp = nums[l];
            nums[l] = nums[nums.length-l-1];
            nums[nums.length-l-1] = temp;
        }
        }else{ 
        for(int l= 0;l<nums.length/2;l++){
            int temp = nums[l];
            nums[l] = nums[nums.length-l-1];
            nums[nums.length-l-1] = temp;
        }
        
        for(int l= 0;l<k/2;l++){
            int temp = nums[l];
            nums[l] = nums[k-l-1];
            nums[k-l-1] = temp;
        }
        
        for(int l= k, m=0;l<(k+(nums.length-k)/2);l++,m++){
            int temp = nums[l];                       // 1 2 3 4 5 
            nums[l] = nums[nums.length-m-1];           // 0 1 2 3 4 
            nums[nums.length-m-1] = temp;             // k=2
        }       
        
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
      }

    }
    public static void main(String[] args) {
        int []nums={1,2,3};
        int k=72;
        rotate(nums, k);
    }
    
}
