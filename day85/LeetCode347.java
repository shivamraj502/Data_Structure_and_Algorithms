/**
Day 85 – HashMap + Sorting
Problem: Top K Frequent Elements – LeetCode347
Goal: Combine sorting & hashing for optimization.
 */

import java.util.*;
public class LeetCode347 {
    public static int[] topK(int []nums, int k){
        int [] res = new int[k];
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],(map.getOrDefault(nums[i],0)+1));
        }//System.out.println(map);

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        pq.addAll(map.entrySet());

        int c =0;
        while(c <k && !pq.isEmpty()){
            res[c]=pq.poll().getKey();
            c+=1;
        }

        return res;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3}; int k =2;
        // int [] nums = {1}; int k =1;
        // int [] nums = {1,2,1,2,1,2,3,1,3,2}; int k =2;
        int [] res = topK(nums,k);
        for(int n : res) System.out.print(n+" ");
    }
}

/**
Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]

Example 3:
Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
Output: [1,2]
 */