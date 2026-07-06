// package HRDRoadmap.HRDvtp7.day4;
import java.util.Collections;
import java.util.PriorityQueue;
public class Leetcode1985 {     //i must use strings length to compare, because 2>10 but 2<10 in string comparison.
    public static String kthLargestNumber1(String[] nums, int k) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        // PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;

        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        
        for(int i=0;i<k;i++){
            System.out.println(pq.poll());
        }System.out.println();

        for(int i=0;i<nums.length-k+1;i++){
            if(count == nums.length-k){return pq.poll();}
            else{ pq.poll();count++;}
        }return "";
    }
    public static String kthLargestNumber2(String[] nums, int k) {
        // PriorityQueue<String> pq = new PriorityQueue<>();
        PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;

        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        
        for(int i=0;i<nums.length;i++){
            System.out.println(pq.poll());
        }System.out.println();

        for(int i=0;i<nums.length-k+1;i++){
            if(count == nums.length-k){return pq.poll();}
            else{ pq.poll();count++;}
        }return "";
    }
    public static String kthLargestNumber3(String[] nums, int k) {
        // PriorityQueue<String> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       
        int[] intArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            intArr[i] = Integer.parseInt(nums[i]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            pq.add(intArr[i]);
        }

        for (int i = 1; i <= k; i++) {
            if(i==k){ return pq.poll()+"";}
            else{ pq.poll(); }
        }return "";
    }
    public static void main(String[] args) {
        // String [] nums = {"3","6","7","10"};    //6
        // String [] nums = {"0","0"};            //0
        // String [] nums = {"623986800","3","887298","695","794","6888794705","269409","59930972","723091307","726368","8028385786","378585"};            //0
        String [] nums = {"2","21","12","1"}; //2
        int k = 2;
        System.out.println(kthLargestNumber3(nums, k));

        // String s = kthLargestNumber3(nums, k);
        // System.out.println(s);
    }
}

/* MISTAKES:
1. i must use strings length to compare, because 2<10 but 2>10 in string comparison.
2. 
*/  

/**
Example 1:

Input: nums = ["3","6","7","10"], k = 4
Output: "3"
Explanation:
The numbers in nums sorted in non-decreasing order are ["3","6","7","10"].
The 4th largest integer in nums is "3".
Example 2:

Input: nums = ["2","21","12","1"], k = 3
Output: "2"
Explanation:
The numbers in nums sorted in non-decreasing order are ["1","2","12","21"].
The 3rd largest integer in nums is "2".
Example 3:

Input: nums = ["0","0"], k = 2
Output: "0"
Explanation:
The numbers in nums sorted in non-decreasing order are ["0","0"].
The 2nd largest integer in nums is "0".
 */