import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
Day 59 – SortingPractice (Mixed)
Problems to Solve:
Sort Colors – LeetCode75
Merge Intervals – LeetCode 56
Top K Frequent Elements – LeetCode 347
Goal: Apply sorting logic to real-world patterns.
 */
public class SortingPractice {
    public static int[] LeetCode75(int[] nums){
        int min=nums[0];
        int max=nums[0];
        int temp=0;
        int k=0;
        int [] newarr = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){min=nums[i];}
            if(nums[i]>max){max=nums[i];}
        }
        System.out.println("min max: "+min +" "+max);

        if(max -min +1 == nums.length){ 
        for(int i=0;i<nums.length;i++){
            int count =0;

            for(int j=0;j<nums.length;j++){
                if(min == nums[j]){count++;}
            }

            for(int j=temp;j<temp+count;j++){
                //System.out.println("min: "+ min);
                newarr[j] = min;
            }
            min = min+1;
            temp = temp + count;
            
            //System.out.println("min temp: "+min+" "+temp);
        }

        for(int j=0;j<newarr.length;j++){
                 nums[j] = newarr[j];
        }

        // for(int j=0;j<newarr.length;j++){
        //         System.out.print(nums[j]+" ");
        // }
        return nums;
        }else{
            for(int i=0;i<=max;i++){ 
            // int count =0;
                    for(int j=0;j<nums.length;j++){
                        if(i == nums[j]){
                            // System.out.println("i: "+i+" k: "+k+" nums[j]: "+nums[j]);
                            newarr[k++] = i;
                            // System.out.println("i: "+i+" k: "+k+" nums[j]: "+nums[j]);

                        }
                        // System.out.println("i: "+i+" j: "+j+" k: "+k+" nums[j]: "+nums[j]);
                    }
                }
                for(int j=0;j<nums.length;j++){
                        nums[j] = newarr[j];
                        // System.out.println(nums[j]);
                        // System.out.println(newarr[j]);
                }return nums;
            }
        }
    public static int[] LeetCode75b(int[] nums){
        int min=nums[0];
        int max=nums[0];
        int k=0;
        int [] newarr = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){min=nums[i];}
            if(nums[i]>max){max=nums[i];}
        }
        //System.out.println("min max: "+min +" "+max);

        
            for(int i=0;i<=max;i++){ 
                    for(int j=0;j<nums.length;j++){
                        if(i == nums[j]){
                            newarr[k++] = i;

                        }
                    }
            }
                for(int j=0;j<nums.length;j++){
                        nums[j] = newarr[j];   
                }return nums;
        }

    /** /how to check a number in number array
     * linear search
     * 
     */

    public static int[][]  LeetCode56(int[][] intervals){
        /**
        Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
        Output: [[1,6],[8,10],[15,18]]
         */
        int [][] res;
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals[0].length;j++){
                System.out.print(intervals[i][1]);
            }System.out.println();
        }

        return intervals;
    }
    public static int[][]  LeetCode56b(int[][] intervals){
        /**
        Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
        Output: [[1,6],[8,10],[15,18]]
         */
        if(intervals.length <= 1) return intervals;

        Arrays.sort(intervals,Comparator.comparingInt(i -> i[0]));  // Sorting
        List<int[]> res = new ArrayList<>();
        int [] newInterval = intervals[0];
        res.add(newInterval);
        for(int[] interval:intervals){
            if(interval[0] <= newInterval[1]){newInterval [1] = Math.max(newInterval[1],interval[1] );}
            else{ newInterval = interval; res.add(newInterval);
                // System.out.println(Arrays.toString(interval));   //Checking equals or not
                // System.out.println(Arrays.toString(newInterval));
            }
        }
        
/**
* Arrays.sort(intervals, comparator)

Two-argument version of sort — first is the array, second tells Java how to compare elements.
Needed because intervals is int[][] (array of arrays) — Java doesn't know which column to sort by on its own.

Comparator.comparingInt(i -> i[0])

A factory method that builds a Comparator for you, based on an int key you extract.
i = each row of the 2D array (e.g. {5, 10}, {1, 3}).
i -> i[0] = a lambda saying "use i[0] (first element of that row) as the sort key."
So this line means: "sort rows by comparing their first element."

Why not just Comparator.comparing()?

comparingInt avoids autoboxing (int → Integer) — slightly faster, cleaner for primitives.
comparing() works too but is meant for Integer/objects, not raw int.
*/

        return res.toArray(new int[res.size()][]);
    }
    public static void LeetCode347(String s){

    }
    public static void main(String[] args) { //Input: nums = [2,0,2,1,1,0] Output: [0,0,1,1,2,2]
        // int [] nums = {2,0,2,1,1,0};
        // int [] nums = {2,1,0};
        // int [] nums = {0};
        // int [] nums = {1,1,1,1,1};
        // int [] nums = {2,2,2,1,1,0,0,0};
        // int [] nums = {2,0};
        // int [] res = LeetCode75b(nums);
        // System.out.println(Arrays.toString(res));

        int [][] intervals = {
            {1,3},{2,6},{8,10},{15,18}
        };
        int[][] res = LeetCode56b(intervals);
        for(int[] n: res){System.out.println(Arrays.toString(n));}
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

Input: [2,0,2,1,1,0] → Output: [0,0,1,1,2,2]
Input: [2,0,1] → Output: [0,1,2]
Input: [0] → Output: [0] (single element edge case)
Input: [1,1,1,1] → Output: [1,1,1,1] (all same, no swaps needed)
Input: [2,2,2,1,1,0,0,0] → Output: [0,0,0,1,1,2,2,2] (already grouped but wrong order)

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