/**
⚡ WEEK 11 — Hashing (HashMap, HashSet)
Day 76 – Introduction to Hashing
Concept: Hashing, collision, and load factor.
Java Classes: HashMap, HashSet.
Problem: Number of Good Pairs – LeetCode 1512
Goal: Understand key-value concept.
 */

import java.util.*;
public class LeetCode1512 {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public static int numIdenticalPairs2(int[] nums) { //not good
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }// for(int i : set){ System.out.println(i); }

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){ count++; }
        }
        
        return count;
    }
    
    public static int numIdenticalPairs3(int[] nums) {
        if(nums.length==1)  return 0;
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])count++;
            }
        }return count;
    }

    public static int numIdenticalPairs4(int [] nums){
        int count =0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            count += map.getOrDefault(n,0);
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        return count;
    }
    
    public static int numIdenticalPairs5(int [] nums){
        int[] freq = new int[101];
        int count = 0;

        for (int num : nums) {
            count += freq[num];
            freq[num]++;
        }

        return count;
    }
    
    public static int numIdenticalPairs6(int [] nums){
        int [] freq = new int[101]; int count = 0;

        for(int n : nums){
            freq[n]++;
        }

        for(int k : freq){
            count += ((k-1)*k)/2;
        }return count;
    }
    
    public static void main(String[] args) {
        int []nums = {1,2,3,1,1,3};
        // int []nums = {1,1,1,1};
        // int []nums = {1,2,3};
        System.out.println("Good Pairs: " + numIdenticalPairs(nums));
        System.out.println("Good Pairs: " + numIdenticalPairs2(nums));
        System.out.println("Good Pairs: " + numIdenticalPairs3(nums));
        System.out.println("Good Pairs: " + numIdenticalPairs4(nums));
        System.out.println("Good Pairs: " + numIdenticalPairs5(nums));
        System.out.println("Good Pairs: " + numIdenticalPairs6(nums));
    }
}

/**
Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

Example 2:
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.

Example 3:
Input: nums = [1,2,3]
Output: 0
 */

/**LeetCode 1512 — Number of Good Pairs can be solved using 4 main approaches in Java.
1. Brute Force — Nested Loops
2. HashMap Frequency Counting — Using HashMap
3. Array Frequency Counting — Using a frequency array
4. Mathematical Approach — Combinations formula \(n(n-1)/2\) */