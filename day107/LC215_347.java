/**
Day 107 – Heap Applications
Problems:
Kth Largest Element – LeetCode 215
Top K Frequent Elements – LeetCode 347
Goal: Apply priority queues for top-K problems.
 */

import java.security.KeyStore.Entry;
import java.util.*;
public class LC215_347{
    public static int kthLargestInt(int [] nums,int k){
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->b.intValue()-a.intValue());

        for(int i=0;i<nums.length;i++){q.add(nums[i]);}
        for(int i=1;i<=nums.length;i++){
            if(i == k) return q.poll();
            q.poll();
        }return 0;
    }
    
    public static int[] kFreqEle(int [] nums,int k){
        int [] res = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        // for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        //     System.out.println(entry.getKey()+" "+entry.getValue());
        // }       
        
        PriorityQueue<Map.Entry<Integer,Integer>> q = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        q.addAll(map.entrySet());

        for(int i=0;i<k;i++){
            if(i <= k){ res[i] = q.poll().getKey();}
        }

        // for(int i=0;i<k;i++){
        //     System.out.println(res[i]);
        // }
        return res;
    }
    
    public static void main(String[] args) {
        // int []nums = {3,2,1,5,6,4};
        // System.out.println(kthLargestInt(nums,2));
        int []nums2 = {1,1,1,2,2,3};
        System.out.println(kFreqEle(nums2,2));
    }
}
/**
Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 */
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