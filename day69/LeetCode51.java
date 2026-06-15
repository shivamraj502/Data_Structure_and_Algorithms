import java.util.ArrayList;

/**
Day 69 – Backtracking Basics
Concept: Trial & error recursion; undo steps after recursion.
Problem: N-Queens – LeetCode 51
Goal: Learn how to "backtrack" safely.
 */
public class LeetCode51 {
    public static void printN(int n){
        for(int i=01;i<=n;i++){
            System.out.print(i+" ");
        }
    }
    public static void printN2(int n){
       if(n==0) return ;
       printN(n-1);
       System.out.print(n +" ");
    }
    public static void printBinN1(int n){       // 0 1
       ArrayList<String> res = new ArrayList<>(); 
       if(n==0) return ;
       printBinN1(n-1);
       System.out.print(n +" ");
    }
    public static void main(String[] args) {
        printBinN1(3);
    }
}

/**
 * 1️⃣ Print Numbers from 1 to N
 * 2️⃣ Print All Binary Strings of Length N
 */