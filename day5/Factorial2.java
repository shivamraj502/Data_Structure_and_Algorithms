// Day 5 — Functions/Methods in Java
// Concept: Creating reusable methods, parameter passing, return types.
// Problem: Factorial Using Function – GFG
// Goal: Understand modular programming.

import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number for factorial:");
        int n = in.nextInt();

        int result = fact(n);
        System.out.println("factorial of " + n + " is " + result);
    }    

    // using private access
    private static int fact(int n){
        int product =1;
        for(int i=1;i<=n;i++){
            product *=i;
        }
        return product;
    }
}
