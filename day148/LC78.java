/**Day 148 – Subsets Using Bitmask
- Problem: Subsets – LeetCode 78
- Goal: Practice combinatorial generation using bits. */

import java.util.*;
public class LC78 {
    public static List<List<Integer>> subsets(int [] nums){
        int ind =0;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        helper(nums,ind,curr,res);
        return res;
    }
    public static void helper(int[] nums,int i,List<Integer> curr,List<List<Integer>> res){
        if(i==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        helper(nums, i+1, curr, res);
        curr.add(nums[i]);
        helper(nums, i+1, curr, res);

        curr.remove(curr.size()-1);
    }
    
    public static List<List<Integer>> subsets2(int [] nums){
        List<List<Integer>> res = new ArrayList<>();
        int total = 1 << (nums.length);

        for(int i=0;i<total;i++){
            List<Integer> curr = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i & (1 << j)) != 0){
                    curr.add(nums[j]);
                }
            }res.add(curr);
        }return res;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(subsets(nums));
        System.out.println();
        System.out.println(subsets2(nums));
    }
}

/*
Test Case 1: nums = [1, 2, 3] → Output: [[], [1], [2], [1,2], [3], [1,3], [2,3], [1,2,3]]
Test Case 2: nums = [0] → Output: [[], [0]]
Test Case 3: nums = [1, 2] → Output: [[], [1], [2], [1,2]]
Test Case 4: nums = [1, 2, 3, 4] → Output: [[], [1], [2], [1,2], [3], [1,3], [2,3], [1,2,3], [4], [1,4], [2,4], [1,2,4], [3,4], [1,3,4], [2,3,4], [1,2,3,4]]
Test Case 5: nums = [5, 10, 15] → Output: [[], [5], [10], [5,10], [15], [5,15], [10,15], [5,10,15]]
*/