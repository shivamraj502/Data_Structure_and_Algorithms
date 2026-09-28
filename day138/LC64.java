/**Day 138 – Minimum Path Sum
Concept: DP on grid movement (down/right).
Problem: Minimum Path Sum – LeetCode 64
Goal: Matrix-based DP optimization. */

public class LC64 {
    public static int minPath(int [][] grid){
        int m= grid.length;
        int n=grid[0].length;

        int [][] dp= new int[m][n];
        dp[0][0] = grid[0][0];

        for(int j=01;j<n;j++){  dp[0][j]=grid[0][j]+dp[0][j-1]; }
        
        for(int i=01;i<m;i++){  dp[i][0]=grid[i][0]+dp[i-1][0]; }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        // int [][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int [][] grid = {{1,2,3},{4,5,6}};
        System.out.println(minPath(grid));
    }
}

/**Example 1:
Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.

Example 2:
Input: grid = [[1,2,3],[4,5,6]]
Output: 12 */