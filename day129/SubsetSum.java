/**Day 129 – Subset Sum Problem
Concept: Check if subset with sum = target exists.
Problem: Subset Sum – GFG
Goal: Practice boolean DP table logic. */

import java.util.*;
public class SubsetSum {    // Memoization
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

    // Tabulation
    public static int knapsack3(int[] weight, int[] value, int capacity) {

    int n = weight.length;

    // DP table
    int[][] dp = new int[n + 1][capacity + 1];

    // Fill the table
    for(int i = 1; i <= n; i++) {

        for(int c = 1; c <= capacity; c++) {

            // Current item can fit
            if(weight[i - 1] <= c) {

                // Take the item
                int take = value[i - 1] + dp[i - 1][c - weight[i - 1]];

                // Don't take the item
                int notTake = dp[i - 1][c];

                dp[i][c] = Math.max(take, notTake);
            }

            // Current item cannot fit
            else {
                dp[i][c] = dp[i - 1][c];
            }
        }
    }

    return dp[n][capacity];
    }
    public static void main(String[] args) {
        int [] w = {1, 2, 3}; int [] v = {10, 15, 40}; int c = 4;
        // int [] w = {1, 2, 3, 5}; int [] v = {10, 15, 40, 50}; int c = 6;
        // int [] w = {2, 3, 4, 5}; int [] v = {3, 4, 5, 6}; int c = 5;
        // int [] w = {5, 4, 6, 3}; int [] v = {10, 40, 30, 50}; int c = 10;
        // int [] w = {10, 20, 30}; int [] v = {60, 100, 120}; int c = 50;

        int [][] dp = new int[w.length+1][c+1];
        for(int[] i :dp){ Arrays.fill(i,-1);}
        System.out.println(knapsack2(w, v, c, w.length, dp));
        System.out.println(knapsack3(w, v, c));
    }
}

/**Input:
Weight = [1, 2, 3]  Value  = [10, 15, 40]   Capacity = 4
Output: 50

Input:
Weight = [1, 2, 3, 5]   Value  = [10, 15, 40, 50]   Capacity = 6
Output: 65

Input:
Weight = [2, 3, 4, 5]   Value  = [3, 4, 5, 6]   Capacity = 5
Output: 7

Input:
Weight = [5, 4, 6, 3]   Value  = [10, 40, 30, 50]   Capacity = 10
Output: 90

Input:
Weight = [10, 20, 30]   Value  = [60, 100, 120] Capacity = 50
Output: 220
*/