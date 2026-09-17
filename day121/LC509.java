import java.util.Arrays;

/**
🧭 Days 121–150 Roadmap: Dynamic Programming + Greedy + FAANG Problem Prep
🧠 WEEK 18 — Dynamic Programming (Foundations)
Day 121 – Introduction to DP
Concept: Overlapping subproblems, optimal substructure, recursion vs DP.
Problem: Fibonacci Number – LeetCode 509
Goal: Learn DP transitions from recursion → memoization → tabulation.
*/
public class LC509 {

    //recursion, Time: O(2^n) ,Space: O(n) recursion stack.
    public static int fib(int n){
        if(n == 0 || n== 1) return n;
        return fib(n-1)+fib(n-2);
    }

    //memoization(top-down DP), Time: O(n), Space: O(n) recursion stack.
    public static int fib2(int n){
        int [] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n,dp);
    }
    public static int solve(int n, int [] dp){
        if(n<=1)return n;
        if(dp[n]!=-1)return dp[n];

        dp[n]=solve(n-1, dp)+solve(n-2, dp);

        return dp[n];
    }

    // Tabulation (Bottom-Up DP), Time: O(n), Space: O(n) recursion stack.
    public static int fib3(int n){
        if(n<=1)return n;
        int [] dp = new int[n+1];
        dp[0]=0;dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        
        return dp[n];
    }

    //Space Optimized DP, time : O(n), space : O(1)
    public static int fib4(int n){
        if(n<=1)return n;
        int [] dp = new int[n+1];
        int pre1 = 1; int pre2 = 0;

        for(int i=2;i<=n;i++){
            dp[i]=pre1+pre2;

            int current = pre1+pre2;
            pre2 = pre1;
            pre1 = current;

        }return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
        System.out.println(fib2(n));
        System.out.println(fib3(n));
        System.out.println(fib4(n));
    }
}

/**
fib ser: 0 1 1 2 3 5 8
         0 1 2 3 4 5 6
 */