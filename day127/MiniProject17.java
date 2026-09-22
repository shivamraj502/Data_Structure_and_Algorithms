/**Day 127 – Mini Project #17
- Task: Build a DP Visualizer (Console-based)
  - Show recursive calls → memo table → final answer.
- Goal: Reinforce understanding of DP states. */

import java.util.*;

public class MiniProject17 {

    // =========================
    // 1. Recursive calls
    // =========================
    public static int recursion(int n) {

        System.out.println("Calling fib(" + n + ")");

        if(n <= 1) {
            System.out.println("fib(" + n + ") = " + n);
            return n;
        }

        int result = recursion(n - 1) + recursion(n - 2);

        System.out.println("fib(" + n + ") = " + result);

        return result;
    }


    // =========================
    // 2. Memoization
    // =========================
    public static int memoization(int n, int[] dp) {

        if(n <= 1) {
            dp[n] = n;
            return n;
        }

        if(dp[n] != -1) {
            System.out.println(
                "Using stored value: dp[" + n + "] = " + dp[n]
            );

            return dp[n];
        }

        dp[n] = memoization(n - 1, dp)
              + memoization(n - 2, dp);

        return dp[n];
    }


    // =========================
    // Visualizer
    // =========================
    public static void visualize(int n) {

        System.out.println("========== DP VISUALIZER ==========");
        System.out.println();

        // Recursive calls
        System.out.println("1. RECURSIVE CALLS");
        System.out.println("--------------------");

        int recursiveAnswer = recursion(n);

        System.out.println();
        System.out.println("Recursive Answer = " + recursiveAnswer);


        // Memoization
        System.out.println();
        System.out.println("2. MEMOIZATION");
        System.out.println("--------------------");

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        int memoAnswer = memoization(n, dp);

        System.out.println();
        System.out.println("Memo Table:");

        for(int i = 0; i <= n; i++) {
            System.out.println(
                "dp[" + i + "] = " + dp[i]
            );
        }


        // Final answer
        System.out.println();
        System.out.println("3. FINAL ANSWER");
        System.out.println("--------------------");

        System.out.println("Fibonacci(" + n + ") = " + memoAnswer);

        System.out.println();
        System.out.println("==================================");
    }


    public static void main(String[] args) {
        int n = 5;
        visualize(n);
    }
}