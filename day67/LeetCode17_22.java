import java.util.ArrayList;
import java.util.List;

/**
Day 67 – Recursion Practice
Problems to Solve:
Letter Combinations of Phone Number – LeetCode 17
Generate Parentheses – LeetCode22
Goal: Practice tree-based recursion.
 */

public class LeetCode17_22 {
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
    
   static List<String> result = null;
   static String [] mapping = new String[] { "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
   public static List<String> letComb2(String digits){
      result = new ArrayList<>();
      
      if(digits.length() == 0) return result;
      helper2(0, digits, new StringBuilder());
      return result;
   }
   public static void helper2(int length, String digits, StringBuilder temp){
      if(length == digits.length()){
         result.add(temp.toString());
         return;
      }

      char ch = digits.charAt(length);
      String str = mapping[ch - '0'];
      for(char c : str.toCharArray()){
         temp.append(c);
         helper2(length+1,digits,temp);
         temp.deleteCharAt(temp.length()-1);
      }
   }
   
   public static List<String> leet22(int n){
      List<String> res = new ArrayList<>();

      helper3(n,n, new StringBuilder(), res);
      return res;
   }
   public static void helper3(int open, int close, StringBuilder temp, List<String> res){
      if(open == 0 && close == 0){
         res.add(temp.toString());
         return;
      }

      if(open > 0){
         temp.append('(');
         helper3(open-1, close, temp, res);
         temp.deleteCharAt(temp.length()-1);
      }

      if(close > open){
         temp.append(')');
         helper3(open, close-1, temp, res);
         temp.deleteCharAt(temp.length()-1);
      }
   }

   public static void main(String[] args) {
      // String nums = "23";
      //   System.out.println(LetComb(nums));
      // System.out.println(letComb2(nums));

      int num = 0;
      // int num = 1;
      // int num = 3;
      System.out.println(leet22(num));

    }
}


/*
17. Letter Combinations of a Phone Number
Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:
Input: digits = "2"
Output: ["a","b","c"]

22. Generate Parentheses
Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:
Input: n = 1
Output: ["()"]
 */