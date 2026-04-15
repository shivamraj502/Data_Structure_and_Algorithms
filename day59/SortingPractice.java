/**
Day 59 – SortingPractice (Mixed)
Problems to Solve:
Sort Colors – LeetCode75
Merge Intervals – LeetCode 56
Top K Frequent Elements – LeetCode 347
Goal: Apply sorting logic to real-world patterns.
 */
public class SortingPractice {
    public static void LeetCode75(int[] nums){
        int min=nums[0];
        int max=nums[0];
        int temp=0;
        int [] newarr = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){min=nums[i];}
            else{max=nums[i];}
        }
        //System.out.println("min max: "+min +" "+max);

        for(int i=0;i<nums.length;i++){
            int count =0;

            for(int j=0;j<nums.length;j++){
                if(min == nums[j]){count++;}
            }

            for(int j=temp;j<temp+count;j++){
                System.out.println("min: "+ min);
                newarr[j] = min;
            }
            min = min+1;
            temp = temp + count;
            
            System.out.println("min temp: "+min+" "+temp);
        }

        for(int j=0;j<newarr.length;j++){
                 nums[j] = newarr[j];
        }

        for(int j=0;j<newarr.length;j++){
                 System.out.print(nums[j]+" ");
        }

    }
    public static void LeetCode56(String s){

    }
    public static void LeetCode347(String s){

    }
    public static void main(String[] args) {
        int [] nums = {0,2};
        LeetCode75(nums);
    }
}


/**
75:
Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]

56:
Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
Example 3:

Input: intervals = [[4,7],[1,4]]
Output: [[1,7]]
Explanation: Intervals [1,4] and [4,7] are considered overlapping.

347:

 */