// package HRDRoadmap.HRDvtp7.day4;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Leetcode215 {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }

        int res = 0;
        for(int i=0;i<k;i++){
            res = pq.poll();
        }return res;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,55,33};
        int k= 5;
        System.out.println(findKthLargest(nums, k));
    }
}
