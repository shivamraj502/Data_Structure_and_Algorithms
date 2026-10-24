/**
Day 77 – HashMap Operations
Concept: put(), get(), containsKey(), remove().
Problem: Two Sum – LeetCode 1
Goal: Use map to reduce time complexity from O(n²) to O(n).
 */

import java.util.*;
public class LC1 {
    public static int[] twoSum(int[] nums, int t) {
        int [] res = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==t){ res[0]=i;res[1]=j;}
            }
        }return res;
    }
    
    public static int[] twoSum2(int[] nums, int t) {
        int res [] = new int[2];

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==t){res[0]=i;res[1]=j;return res;}
            }
        }return res;
    }
    
    public static int[] twoSum3(int[] nums, int t) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==t){return new int[]{i,j};}
            }
        }return new int[]{};
    }
    
    public static int[] twoSum4(int[] nums, int t) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        
        // System.out.println(map);    // printing

        for(int i=0;i<nums.length;i++){
            int complement = t-nums[i];
            // if(map.containsValue(complement) && map.get(complement) != i){   // it is not checking index of complement is present or not, it is checking index == complement
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i,map.get(complement)};
            }
        }return new int[]{};

    }
    
    public static int[] twoSum5(int[] nums, int t) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = t-nums[i];
            
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }

            map.put(nums[i],i);
        }return new int[]{};

    }
    
    public static int[] twoSum6(int[] nums, int t) {
        int [][] arr = new int[nums.length][2];

        for(int i=0;i<nums.length;i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));

        int left =0;int right = nums.length-1;

        while(left<right){
            int sum = arr[left][0]+arr[right][0];

            if(sum == t){
                return new int[]{arr[left][1],arr[right][1]};
            }else if(sum<t){
                left++;
            }else right--;
        }return new int[]{};

    }
    
    public static int[] twoSum7(int[] nums, int t) {
        int [][] arr = new int[nums.length][2];

        for(int i=0;i<nums.length;i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr,(a,b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < nums.length; i++) {
            int complement = t - nums[i];
            int left = i + 1; int right = nums.length - 1;  int mid;

            while (left <= right) {
                mid = left + (right - left) / 2;
                if(arr[mid][0]==complement) return new int[]{arr[i][1],arr[mid][1]};
                else if(arr[mid][0] < complement) left = mid +1;
                else right = mid - 1;
            }
        }return new int[]{};

    }
    public static void main(String[] args) {
        int [] nums = {2,7,11,15}; int t=9;
        // int [] nums = {3,2,4}; int t=6;
        // int [] nums = {3,3}; int t=6;
        int [] res =twoSum(nums, t);
        for(int n : res){System.out.print(n+" ");}  System.out.println();
        
        int [] res2 =twoSum2(nums, t);
        for(int n : res2){System.out.print(n+" ");} System.out.println();
        
        int [] res3 =twoSum3(nums, t);
        for(int n : res3){System.out.print(n+" ");} System.out.println();
        
        int [] res4 =twoSum4(nums, t);
        for(int n : res4){System.out.print(n+" ");} System.out.println();
        
        int [] res5 =twoSum5(nums, t);
        for(int n : res5){System.out.print(n+" ");} System.out.println();
        
        int [] res6 =twoSum6(nums, t);
        for(int n : res6){System.out.print(n+" ");} System.out.println();
        
        int [] res7 =twoSum7(nums, t); System.out.print("7. ");
        for(int n : res7){System.out.print(n+" ");} System.out.println();
    }
}

/**
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 */