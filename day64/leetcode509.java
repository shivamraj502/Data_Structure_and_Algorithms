/**
Day 64 – Factorial and Fibonacci
Concept: Mathematical recursion.
Problem: Nth Fibonacci Number – LeetCode 509
Goal: Understand overlapping subproblems.
 */
public class leetcode509 {
    public static int fact(int n){
        if(n<0){
            System.out.println("invalid input");
            return -1;
        }

        if(n==0 || n == 1 ){
            return n;
        }

        return n*fact(n-1);
    }
    public static int fib(int n){//0 1 1 2 3 5 8
        if(n<0){
            System.out.println("invalid input");
            return -1;
        }

        if(n==0 || n == 1 ){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }
    public static int leetcode509(int n){
        if(n<0){
            //System.out.println("invalid input");
            return -1;
        }

        if(n==0 || n == 1 ){
            return n;
        }

        return fib(n-1)+fib(n-2);

    }
    public static int leetcode509b(int n){// 0 1 1 2 3 5 8 13 ...
        if(n < 0){ System.out.println("invalid");return -1;}
        if(n == 0 || n ==1) return n;

        return leetcode509b(n-2)+leetcode509b(n-1);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println("output: "+leetcode509b(n));
    }
}
/**
Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 */