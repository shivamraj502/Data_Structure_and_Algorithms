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
    
    public static List<List<Integer>> LeetCode46a(int [] nums){       // 0 1
       List<List<Integer>> resList= new ArrayList<>();
       helper46(resList,new ArrayList<>(),nums);
       return resList;
    }
    public static void helper46(List<List<Integer>> resList, List<Integer> curr, int [] nums){
      if(curr.size() == nums.length){
         resList.add(new ArrayList<>(curr));
         return;
      }
      for(int n: nums){
         if(curr.contains(n)){
            continue;
         }
         curr.add(n);
         helper46(resList,curr,nums);
         curr.remove(curr.size()-1);
      }
    }

    public static List<String> LetComb(String digits){       
       List<String> resList= new ArrayList<>();

       if(digits.length() == 0){ return resList;}

       String [] map = {
         "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
       };

       helperLC(resList,digits,0,"",map);
       return resList;
    }
    public static void helperLC(List<String> resList,String digits,int i,String curr, String[] map){

      if(i==digits.length()){
         resList.add(curr);
         return;
      }

      String letters = map[digits.charAt(i)-'0'];
      for(int j=0; j<letters.length();j++){
         helperLC(resList,digits,i+1, curr+letters.charAt(j) ,map);
      }
    }
    
    public static boolean ratNmaze(int [][] arr, int i, int j){       
      if(i == arr.length-1 && j == arr[0].length-1){
         return true;
      }
      
      if(i >= arr.length || j >= arr[0].length){
         return false;
      }

      if(arr[i][j] == 0){
         return false;
      }

      arr[i][j] = 0;

      if(ratNmaze(arr,i+1,j)){
         return true;
      }
      
      if(ratNmaze(arr,i,j+1)){
         return true;
      }

      arr[i][j]=1;

       return false;
    }


    public static void main(String[] args) {
        int[][] arr = {{1,0,0},
                        {1,0,0},
                        {0,0,0}};
        System.out.println(ratNmaze(arr,0,0));
    }
}

/**
 * 1️⃣ Print Numbers from 1 to N
 * 2️⃣ Print All Binary Strings of Length N
 * 3️⃣ Print All Subsequences of a String
 * 4️⃣ Subsets (LeetCode78)
 * 5️⃣ Permutations (LeetCode 46)
 * 6️⃣ Letter Combinations of Phone Number
 * 7️⃣ Rat in a Maze
 */