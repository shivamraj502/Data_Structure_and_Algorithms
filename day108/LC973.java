/**
Day 108 – Java PriorityQueue Class
Concept: Custom comparators, max/min configuration.
Problem: K Closest Points to Origin – LeetCode 973
Goal: Master heap operations in Java.
 */
import java.util.*;
public class LC973{
    public static int[][] kClosest(int[][] points, int k) {
        int [][] res = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->distance(b)-distance(a));
        
        for(int [] point : points){ pq.add(point);
            if(pq.size()>k){ pq.poll();}
        }
        // for(int i=0;i<pq.size()-k;i++){
        //     pq.poll();
        // }
        for(int i=0;i<k;i++){
            res[i] = pq.poll();
        }
        // for(int i=0;i<k;i++){
        //     System.out.println(res[i]);
        // }
        return res;
    }
    public static int distance(int [] n){
        int x = n[0];
        int y = n[1];
        return x*x + y*y;
    }
    public static void main(String[] args) {
        int [][] nums = {
                            {1,3},{-2,2}
        };
        System.out.println(kClosest(nums, 1));
    }
}
/**
Example 1:
Input: points = [[1,3],[-2,2]], k = 1
Output: [[-2,2]]
Explanation:
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].

Example 2:
Input: points = [[3,3],[5,-1],[-2,4]], k = 2
Output: [[3,3],[-2,4]]
Explanation: The answer [[-2,4],[3,3]] would also be accepted.
 */