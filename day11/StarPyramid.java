// Day 11 — Nested Loops & Patterns
// Concept: Nested loops for pattern problems.
// Problem: Print Star Pyramid Pattern – GFG
// Goal: Practice nested loops.

import java.util.Scanner;
public class StarPyramid {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n;
    System.out.println("enter level of pyramid: ");
    n = in.nextInt();

    pyramid(n);
    }

    static void pyramid(int n){
        for(int i=0;i<n;i++){ 
         for(int sp=0;sp<n-i-1;sp++){  //run in same row for space and then for star for same i
            System.out.print("   ");
         }
         for(int st=0;st<2*i+1;st++){  //run in same row for space and then for star for same i
            System.out.print(" * ");
         }System.out.println();
    }
    }
}