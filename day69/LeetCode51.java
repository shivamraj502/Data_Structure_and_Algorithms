/**
Day 69 – Backtracking Basics
Concept: Trial & error recursion; undo steps after recursion.
Problem: N-Queens – LeetCode 51
Goal: Learn how to "backtrack" safely.
 */

import java.util.*;
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
    public static void printBinN2(int n , String s){       // 0 1
       if(s.length() == n){
            System.out.println(s);
            return;
       } 
       printBinN2(n,s+"0");
       printBinN2(n,s+"1");
    }
    public static void printBinN3(int n , String s){       // 0 1
       if(s.length() == n){
            System.out.println(s);
            return;
       } 
       printBinN3(n,s+"0");
       printBinN3(n,s+"1");
    }

    public static void printSubseq(String s, String t){       // 0 1
       if(t.length() == s.length()){
            return;
       } 
       printSubseq(s, t);
       
    }
    
    public static void printSubseq2(String s, int i, String curr){       // 0 1
       if(i == s.length()){
            System.out.println("\"" + curr + "\"");
            return;
       } 
       printSubseq2(s, i+1, curr);
       printSubseq2(s, i+1, curr+s.charAt(i));
    }

    public static void LeetCode78(String s, int i, String curr){       // 0 1
       if(i == s.length()){
            System.out.println("[" + curr + "]");
            return;
       } 
       LeetCode78(s, i+1, curr);
       LeetCode78(s, i+1, curr+s.charAt(i));
    }

    public static List<List<Integer>> LeetCode78b(int [] nums){       // 0 1
       List<List<Integer>> res= new ArrayList<>();
       helper(nums,0,new ArrayList<>(),res);
       return res;
    }
    public static void helper(int [] n,int i, List<Integer> curr, List<List<Integer>> res){
        if(i==n.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        helper(n, i+1, curr, res);
        curr.add(n[i]);
        helper(n, i+1, curr, res);
        curr.remove(curr.size()-1);
    }

    public static void main(String[] args) {
        int [] n = {1,2};
        System.out.println(LeetCode78b(n));
    }
}

/**
 * 1️⃣ Print Numbers from 1 to N
 * 2️⃣ Print All Binary Strings of Length N
 * 3️⃣ Print All Subsequences of a String
 * 4️⃣ Subsets (LeetCode78)
 */