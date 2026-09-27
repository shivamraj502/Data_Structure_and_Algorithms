import java.util.Arrays;

/**🪙 WEEK 19 — 0/1 Knapsack Patterns
Day 128 – 0/1 Knapsack Problem
- Concept: Core of decision-based DP.
- Problem: 0/1 Knapsack – GFG
- Goal: Learn decision-based recursion. */

public class Knapsack {
    public static int knapsack(int[] w, int [] v, int c){
        if(w.length!=v.length){return -1;}

        int max = 0;
        double [] r = new double[w.length];
        for(int i=0;i<w.length;i++){r[i] = v[i]/w[i];}
        Arrays.sort(r);
        
        //for(int i=0;i<w.length;i++){ System.out.print(r[i]+" ");}

        System.out.println();
        for(int i=0;i<w.length;i++){
            int tempW =0;   int tempV =0;
            for(int j=i;j<w.length;j++){
                tempW+=w[j];
                if(!(tempW > c)){
                    tempV += v[j];
                    if(tempV > max){max = tempV;/*System.out.println("weight: "+tempW+" value: "+tempV);*/}
                }else break;
            }
        }return max;
    }
    
    public static int knapsack2(int[] weight, int [] value, int capacity,int n,int[][] dp){

        // Base case
        if(n == 0 || capacity == 0) {
            return 0;
        }

        // Already calculated
        if(dp[n][capacity] != -1) {
            return dp[n][capacity];
        }

        // If current item is too heavy
        if(weight[n - 1] > capacity) {
            return dp[n][capacity] =
                    knapsack2(weight, value, capacity, n - 1, dp);
        }

        // Take the item
        int take = value[n - 1]
                + knapsack2(weight, value,
                           capacity - weight[n - 1],
                           n - 1, dp);

        // Don't take the item
        int notTake = knapsack2(weight, value,
                               capacity, n - 1, dp);

        // Store the best answer
        dp[n][capacity] = Math.max(take, notTake);

        return dp[n][capacity];
    }
    public static void main(String[] args) {
        // int [] v = {10, 15, 40 };   int [] w = {1,2,3}; int c=4; //50
        // int [] v = {10, 15, 40, 50 };   int [] w = {1, 2, 3, 5}; int c=6;   //65
        // int [] v = {3, 4, 5, 6};   int [] w = {2, 3, 4, 5}; int c=5; //7
        // int [] v = {10, 40, 30, 50 };   int [] w = {5, 4, 6, 3}; int c=10; //90 
        // int [] v = {60, 100, 120 };   int [] w = {10, 20, 30}; int c=50; //220
        int [] v = {20, 35, 60, 75, 90, 110, 125, 145, 160, 180};   int [] w = {7, 13, 18, 22, 26, 31, 35, 40, 44, 50}; int c=100; //350
        // int [] v = {14, 30, 45, 55, 70, 82, 95, 115, 130, 145, 160, 175};   int [] w = {3, 8, 12, 15, 17, 21, 25, 29, 34, 38, 42, 47}; int c=100; //392

        int [][] dp = new int[w.length+1][c+1];
        for(int[] row : dp) {
        Arrays.fill(row, -1);
        }
        // System.out.println(knapsack(w,v,c));
        System.out.println(knapsack2(w,v,c,w.length,dp));
    }
}

/**
Test Case 1
Input:
Weight = [1, 2, 3] Value  = [10, 15, 40] Capacity = 4 Output: 50

Test Case 2
Input:
Weight = [1, 2, 3, 5] Value  = [10, 15, 40, 50] Capacity = 6 Output: 65

Test Case 3
Input:
Weight = [2, 3, 4, 5] Value  = [3, 4, 5, 6] Capacity = 5 Output: 7

Test Case 4
Input:
Weight = [5, 4, 6, 3] Value  = [10, 40, 30, 50] Capacity = 10 Output: 90

Test Case 5
Input:
Weight = [10, 20, 30] Value  = [60, 100, 120] Capacity = 50 Output: 220

Test Case 6
Input:
Weight = [7, 13, 18, 22, 26, 31, 35, 40, 44, 50] Value  = [20, 35, 60, 75, 90, 110, 125, 145, 160, 180] Capacity = 100 Output: 430

Test Case 7
Input:
Weight = [3, 8, 12, 15, 17, 21, 25, 29, 34, 38, 42, 47] Value  = [14, 30, 45, 55, 70, 82, 95, 115, 130, 145, 160, 175] Capacity = 100 Output: 455
 */