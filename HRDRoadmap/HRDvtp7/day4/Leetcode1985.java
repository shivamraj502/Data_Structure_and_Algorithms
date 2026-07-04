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
    public static void main(String[] args) {
        // String [] nums = {"3","6","7","10"};
        // String [] nums = {"0","0"};
        String [] nums = {"2","21","12","1"};
        int k = 3;
        System.out.println(kthLargestNumber2(nums, k));
    }
}
