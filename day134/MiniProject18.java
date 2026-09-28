/**Day 134 – MiniProject #18
Task: Build a Budget Optimizer using 0/1 Knapsack
Input: items (cost/value), Output: max value under budget.
Goal: Practical knapsack use case. */

public class MiniProject18 {
    public static int optimizeBudget(int[] cost, int[] value, int budget) {

        int n = cost.length;
        int[][] dp = new int[n + 1][budget + 1];

        for(int i = 1; i <= n; i++) {
            for(int b = 1; b <= budget; b++) {
                // Current item can fit
                if(cost[i - 1] <= b) {
                    int take = value[i - 1]+ dp[i - 1][b - cost[i - 1]];
                    int notTake = dp[i - 1][b];
                    
                    dp[i][b] = Math.max(take, notTake);
                }

                // Current item cannot fit
                else {
                    dp[i][b] = dp[i - 1][b];
                }
            }
        }return dp[n][budget];
    }
    public static void main(String[] args) {
        int[] cost = {5, 4, 6, 3};
        int[] value = {10, 40, 30, 50};
        int budget = 10;

        int answer = optimizeBudget(cost, value, budget);
        System.out.println("Budget = " + budget);
        System.out.println("Maximum Value = " + answer);
    }
}
