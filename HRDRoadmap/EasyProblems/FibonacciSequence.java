// Fibonacci Sequence

// package HRDRoadmap.EasyProblems;
public class FibonacciSequence {
    public static int fib(int n){
        if(n<0) return -1;
        if(n<2) return n;
        
        return fib(n-1)+fib(n-2);
    
    }
    public static void main(String[] args) {
        System.out.println("fibonacchi value: "+ fib(-8));
        System.out.println();
    }
}

/**
 The Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21.

Example:
Input: n = 2
Output: 1 
Explanation: 1 is the 2nd number of Fibonacci series.

Input: n = 5
Output: 5
Explanation: 5 is the 5th number of Fibonacci series.
 */