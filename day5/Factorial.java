// Day 5 — Functions/Methods in Java
// Concept: Creating reusable methods, parameter passing, return types.
// Problem: Factorial Using Function – GFG
// Goal: Understand modular programming.

import java.util.Scanner;

public class Factorial {
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number for factorial:");
        int n = in.nextInt();

        int result = fact2(n);
        System.out.println("factorial of " + n + " is " + result);
    }    

    public static int fact2(int n){
        int product =1;
        for(int i=1;i<=n;i++){
            product *=i;
        }
        return product;
    }

    public static int fact(int n){
        if(n <= 0) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fact(n));
    }
}
