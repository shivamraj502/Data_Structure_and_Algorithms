/**
Day 86 – HashSet + Arrays
Problem: Intersection of Two Arrays – LeetCode349
Goal: Learn set operations.
 */

import java.util.*;
public class LeetCode349 {
    public static int[] twoArr(int [] nums1, int [] nums2){
        nums1 = removeDup(nums1);
        nums2 = removeDup(nums2);

        int m =(nums1.length>nums2.length) ? (m = nums2.length): (m =nums1.length);
        int [] temp = new int[m]; int c =0;

        for(int i= 0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){ temp[c]=nums1[i]; c+=1; }
            }
        }

        int [] res = new int[c];    int max =c;
        for(int i=0;i<max;i++){ res[i]=temp[i]; c -=1;}
        
        return res;
    }
    public static int[] removeDup(int [] nums){
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        int m = set.size(); int j=0;
        int [] res = new int[m];
        for(int i : set){
            res[j] =i;
            j++;
        }return res;
    }
    public static void main(String[] args) {
        // int [] nums1 = {1,2,2,1}; int [] nums2 = {2,2};
        int [] nums1 = {4,9,5}; int [] nums2 = {9,4,9,8,4};
        int [] res = twoArr(nums1,nums2);
        for(int n : res) System.out.print(n+" ");
    }
}

/**
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */