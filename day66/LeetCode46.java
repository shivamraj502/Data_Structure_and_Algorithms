/**
Day 66 – Permutations
Concept: Fix one character, permute the rest.
Problem: Permutations – LeetCode 46
Goal: Understand backtracking pattern via recursion.
 */

import java.util.List;
import java.util.ArrayList;
public class LeetCode46 {
    public static List<List<Integer>> perm(int [] nums){
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList,new ArrayList<>(),nums);
        return resultList;
    }
    
    public static void backtrack(List<List<Integer>> resultList,List<Integer> tempList,int[] nums){
        if(tempList.size() == nums.length){
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for(int n : nums){
            if(tempList.contains(n)){
                continue;
            }

            tempList.add(n);
            backtrack(resultList,tempList,nums);
            tempList.remove(Integer.valueOf(n));    // value
            // tempList.remove(tempList.size()-1); //index 
        }
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(perm(nums));
    }
}
