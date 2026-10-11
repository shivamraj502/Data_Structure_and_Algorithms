// Day 73 – Backtracking Optimization
// Concept: Pruning unnecessary recursive calls.
// Problem: Combination Sum II – LeetCode 40
// Goal: Write more efficient recursive code.   // avoid repetion

// package day73;
import java.util.*;
public class LeetCode40 {
    public static List<List<Integer>> isSum(int [] nums, int t){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        helper(nums,t,0,new ArrayList<>(),res);
        return res;
    }
    public static void helper(int [] nums,int rem,int start, List<Integer> curr, List<List<Integer>> res){
        if(rem == 0){
            res.add(new ArrayList<>(curr));
            return;
        }

        if(rem < 0){ return; }

        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i] == nums[i-1]) continue;

            curr.add(nums[i]);
            helper(nums,rem-nums[i],i+1,curr,res);
            curr.remove(curr.size()-1);
        }
    }

    public static List<List<Integer>> isSum2(int[] nums, int t) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper2(nums, t, 0, new ArrayList<>(), res);
        return res;
    }
    public static void helper2(int[] nums, int rem, int start, List<Integer> curr, List<List<Integer>> res) {
        if (rem == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        if (rem < 0)
            return;

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1])
                continue; // skip duplicates at same level
            curr.add(nums[i]);
            helper2(nums, rem - nums[i], i + 1, curr, res); // i+1: no reuse of same index
            curr.remove(curr.size() - 1);
        }
    }

    public static List<List<Integer>> isSum3(int[] nums, int t){
        List<List<Integer>> res = new ArrayList<>();
        // Arrays.sort(nums);
        helper3(nums, t, res, new ArrayList<>(), 0);
        return res;
    }
    public static void helper3(int[] nums,int rem,List<List<Integer>> res,List<Integer> curr,int i){
        if(rem == 0){ res.add(new ArrayList<>(curr));return;}
        if(i==nums.length || rem < 0) return;

        curr.add(nums[i]);
        helper3(nums, rem-nums[i], res, curr, i+1);
        curr.remove(curr.size()-1);
        helper3(nums, rem, res, curr, i+1);
    }
    
    public static List<List<Integer>> isSum4(int[] nums, int t){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper4(nums, t, res, new ArrayList<>(), 0);
        return res;
    }
    public static void helper4(int[] nums,int rem,List<List<Integer>> res,List<Integer> curr,int i){
        if(rem == 0){ res.add(new ArrayList<>(curr));return;}
        if(i==nums.length || rem < 0) return;

        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]){ continue;}
            
            curr.add(nums[j]);
            helper4(nums, rem-nums[j], res, curr, j+1);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String[] args) {
        int t = 8;

        // int [] nums = {10,1,2,7,6,1,5};
        // List<List<Integer>> res = isSum(nums,t);
        // System.out.println(res);

        // int [] nums = {1,2,7,6,1,5,1};
        // List<List<Integer>> res = isSum2(nums, t);
        // System.out.println(res);
        
        // int [] nums = {1,2,7,6,1,5};
        // List<List<Integer>> res = isSum3(nums, t);
        // System.out.println(res);
        
        int [] nums = {1,2,7,6,1,5};
        List<List<Integer>> res = isSum4(nums, t);
        System.out.println(res);
    }
}

/**
Example 1:
Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]

Example 2:
Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
 */