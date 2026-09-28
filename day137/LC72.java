/**Day 137 – Edit Distance
Concept: Insert/Delete/Replace operations.
Problem: Edit Distance – LeetCode 72
Goal: Understand 3D state transitions. */

public class LC72 {
    public static int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m + 1][n + 1];

        // word1 -> empty
        for(int i = 0; i <= m; i++) { dp[i][0] = i; }

        // empty -> word2
        for(int j = 0; j <= n; j++) { dp[0][j] = j; }

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {

                if(word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else {
                    int insert = dp[i][j - 1];
                    int delete = dp[i - 1][j];
                    int replace = dp[i - 1][j - 1];

                    dp[i][j] = 1 + Math.min(insert,Math.min(delete, replace));
                }
            }
        }

        return dp[m][n];
    }
    public static void main(String[] args) {
        String s1 = "horse"; String s2 = "ros";
        System.out.println(minDistance(s1,s2));
    }
}

/**Example 1:
Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation: 
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')

Example 2:
Input: word1 = "intention", word2 = "execution"
Output: 5
Explanation: 
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')               */

/**1. What is Edit Distance?
Given two strings, find the minimum number of operations needed to convert word1 into word2. */