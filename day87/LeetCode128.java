/**
Day 87 – Practice Problems
Problems:
Happy Number – LeetCode202
Longest Consecutive Sequence – LeetCode128
Goal: Apply hashing creatively. */

import java.util.*;
public class LeetCode128 {
    public static int lonConSeq(int [] nums){
        HashSet<Integer> set = new HashSet<>();
        int max=0;

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int n=set.size(); int k=0;
        int [] res = new int[n];
        for(int i : set){
            res[k] = i; k++;
        }for(int i : res) System.out.print(i+" ");
        Arrays.sort(res);

        if(res.length == 1) return 1;
        for(int i=1;i<res.length;i++){
            int count = 1;
            for(int j=i;j<res.length;j++){
                if(res[j]-res[j-1]==1){
                    //System.out.print("diff:"+(res[j]-res[j-1]));
                    count += 1;
                    if(count>max) max = count;
                }else{ count = 1;}
            }//System.out.println();
        }//System.out.println();
        
        return max;
    }
    public static int lonConSeq2(int [] nums){
        HashSet<Integer> set = new HashSet<>();
        int max=0;

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int num : set){
            if(!set.contains(num-1)){
                int length = 1;
                int current = num;
                while(set.contains(current+1)){
                    current +=1;
                    length += 1;
                }max = Math.max(max,length);
            }
        }return max;
    }
    public static void main(String[] args) {
        // int [] nums = {100,4,200,1,3,2};
        int [] nums = {0,3,7,2,5,8,4,6,0,1};
        // int [] nums = {1,0,1,2};    
        // int [] nums = {0};
        // int [] nums = {1,2,6,7,8};
        // int [] nums = {1,100};
        System.out.println(lonConSeq2(nums));
    }
}

/**
Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

Example 3:
Input: nums = [1,0,1,2]
Output: 3
 */