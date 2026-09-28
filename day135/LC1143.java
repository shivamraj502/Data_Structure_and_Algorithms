/**💡 WEEK 20 — String DP
Day 135 – Longest Common Subsequence (LCS)
Concept: Classic DP relation between two strings.
Problem: LCS – LeetCode 1143
Goal: Learn 2D DP logic. */

public class LC1143 {
    public static int longestSubseq(String s1, String s2){
        int m = s1.length();
        int n = s2.length();

        int [][] dp = new int[m+1][n+1];
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
    }
    public static void main(String[] args) {
        String s1 = "abcde"; String s2 = "ace";
        System.out.println(longestSubseq(s1,s2));
    }
}
