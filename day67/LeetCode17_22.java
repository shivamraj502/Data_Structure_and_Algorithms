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
    public static void main(String[] args) {
        String nums = "23";
        System.out.println(LetComb(nums));
        // System.out.println(leet22(nums));
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