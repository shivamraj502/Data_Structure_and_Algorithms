/**      2402. Minimum Cost to Hire K Workers    */
import java.util.*;
public class LC2402 {
    public static double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        double[][] workers = new double[n][2];
        
        for (int i = 0; i < n; i++) {
            workers[i][0] = (double) wage[i] / quality[i]; // ratio
            workers[i][1] = quality[i];
        }
        
        Arrays.sort(workers, (a, b) -> Double.compare(a[0], b[0]));
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        int totalQuality = 0;
        double minCost = Double.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            totalQuality += workers[i][1];
            maxHeap.offer((int) workers[i][1]);
            
            if (maxHeap.size() > k) {
                totalQuality -= maxHeap.poll();
            }
            
            if (maxHeap.size() == k) {
                minCost = Math.min(minCost, totalQuality * workers[i][0]);
            }
        }
        
        return minCost;
    }
    public static void main(String[] args) {
        int[] quality1 = {10, 20, 5};
        int[] wage1 = {70, 50, 30};
        int k1 = 2;
        System.out.println(mincostToHireWorkers(quality1, wage1, k1)); // Output: 105.00000

        int[] quality2 = {3, 1, 10, 10, 1};
        int[] wage2 = {4, 8, 2, 2, 7};
        int k2 = 3;
        System.out.println(mincostToHireWorkers(quality2, wage2, k2)); // Output: 30.66667
    }
}
