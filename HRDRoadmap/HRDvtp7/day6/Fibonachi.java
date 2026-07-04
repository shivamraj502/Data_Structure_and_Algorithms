// package HRDRoadmap.HRDvtp7.day6;
public class Fibonachi {        // 0 1 1 2 3 5 8 ...
    public static int fib(int n){   // methods: iteration,recursion,maniputation or memorization
        if(n==0 || n ==1) return n; // MISTAKE: I written return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n= 7;
        System.out.println(fib(n));
    }
}

// MISTAKE: I written return 1 over return n;