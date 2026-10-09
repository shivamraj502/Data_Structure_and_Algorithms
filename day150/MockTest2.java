/**Day 150 – DP & Greedy Revision + Mock Test
- Revise all DP patterns: 1D, 2D, Knapsack, String, Greedy.
- Take a 120-min timed mock:
  - 2 DP
  - 1 Greedy
  - 1 String
  - 1 Bit manipulation problem */

public class MockTest2 {
    public static void main(String[] args) {
      System.out.println(5);
    }
}

/**25 min

Question 1 — 1D DP
House RobberFind the maximum amount you can rob without robbing adjacent houses.
Pattern: dp[i] = max(dp[i-1], nums[i] + dp[i-2])
Open problem

Question 2 — Knapsack DP
Partition Equal Subset SumDetermine whether an array can be divided into two subsets with equal sums.
Pattern: subset sum with target = total sum / 2.
Open problem

Question 3 — Greedy
Jump GameDetermine whether you can reach the final array index.
Pattern: track the farthest reachable index.
Open problem

Question 4 — String DP
Longest Common SubsequenceFind the length of the longest subsequence common to two strings.
Pattern: matching characters use the diagonal; otherwise take the maximum of top and left.
Open problem

Question 5 — Bit Manipulation
Counting BitsFor every number from 0 through n, return the number of set bits in its binary representation.
Pattern: ans[i] = ans[i >> 1] + (i & 1)
Open problem */