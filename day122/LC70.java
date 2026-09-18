/**Day 122 – Climbing Stairs
Concept: Simple recurrence relation f(n) = f(n-1) + f(n-2)
Problem: Climbing Stairs – LeetCode 70
Goal: Practice both memoization & tabulation. */
public class LC70 {
    public static int climb(int n){
        int res =0,count=0;
        helper(n,res,count);
        return count;
    }
    public static int helper(int n, int res,int count){
        if(res == n){count+=1;return count;}
        res+=1;
        helper(n, res, count);
        res-=1;
        res+=2;
        helper(n, res, count);
        res-=2;
        return count;
    }

    static int count =0;
    public static int climb2(int n){
        helper2(0,n);
        return count;
    }
    public static void helper2(int curr,int n){
        if(curr == n){count+=1;return;}
        if(curr > n) return;
        helper2(curr+1, n);
        helper2(curr+2, n);
    }
    
    public static int climb3(int n){
        if(n<=2)return n;
        int [] dp = new int[n+1];
        dp[1]=1;dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }return dp[n];
    }
   
    public static int climb4(int n){
        int [] dp = new int[n+1];
        return helper4(n,dp);
    }
    public static int helper4(int n,int []dp){
        if(n<=2)return n;
        
        if(dp[n]!= 0)return dp[n];

        dp[n]=helper4(n-1, dp)+helper4(n-2, dp);
        return dp[n];
    }

    public static int climb5(int n){
        if(n<=2)return n;
        int p1=2,p2=1;
        for(int i=3;i<=n;i++){
            int curr = p1+p2;
            p2=p1;
            p1=curr;
        }return p1;
    }
    public static void main(String[] args) {
        int n=2;
        // int n =3;
        // System.out.println(climb(n));    // brute force method
        System.out.println(climb2(n));      // recursion
        System.out.println(climb3(n));      // tabulation
        System.out.println(climb4(n));      // memoization
        System.out.println(climb5(n));      // space optimal tabulation
    }
}
/**
Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */