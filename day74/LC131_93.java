/**
Day 74 – Backtracking Practice
Problems:
Palindrome Partitioning – LeetCode 131
Restore IP Addresses – LeetCode 93
Goal: Get comfortable with recursion + string splitting.
*/

import java.util.*;
public class LC131_93 {
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        helper(s, 0, new ArrayList<>(), result);
        return result;
    }
    public static void helper(String s, int start, List<String> current, List<List<String>> result){
        if(start == s.length()){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int end = start; end < s.length(); end++){
            String piece = s.substring(start, end+1);
            if(isPalindrome(piece)){
                current.add(piece);
                helper(s, end+1, current, result);
                current.remove(current.size()-1); // backtrack
            }
        }
    }
    public static boolean isPalindrome(String s){
        int left = 0, right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static List<List<String>> partition2(String s){
        List<List<String>> res = new ArrayList<>();
        parHelper2(s, 0, new ArrayList<>(), res);
        return res;
    }
    public static void parHelper2(String s,int i,List<String> curr,List<List<String>> res){
        if(i==s.length()){res.add(new ArrayList<>(curr));return;}

        for(int end=i;end<s.length();end++){
            String piece = s.substring(i, end+1);
            if(isPal2(piece)){
                curr.add(piece);
                parHelper2(s, end+1, curr, res);
                curr.remove(curr.size()-1);
            }
        }
    }
    public static boolean isPal2(String s){
        int left = 0;int right = s.length()-1;
        while(left < right){
            if(s.charAt(left)!=s.charAt(right))return false;
            left++;
            right--;
        }return true;
    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        helper2(s, 0, new ArrayList<>(), result);
        return result;
    }
    public static void helper2(String s, int start, List<String> parts, List<String> result){
        if(parts.size() == 4){
            if(start == s.length()){
                result.add(String.join(".", parts));
            }
            return;
        }

        for(int len = 1; len <= 3; len++){
            if(start + len > s.length()) break;

            String piece = s.substring(start, start+len);

            if(!isValid(piece)) continue;

            parts.add(piece);
            helper2(s, start+len, parts, result);
            parts.remove(parts.size()-1); // backtrack
        }
    }
    public static boolean isValid(String piece){
        if(piece.length() > 1 && piece.charAt(0) == '0') return false; // no leading zero
        int val = Integer.parseInt(piece);
        return val >= 0 && val <= 255;
    }
    
    public static List<String> restoreIpAddresses2(String s){
        List<String> res = new ArrayList<>();
        ipHelper2(s,new ArrayList<>(),res,0);
        return res;
    }
    public static void ipHelper2(String s,List<String> parts,List<String> res,int i){
        if(parts.size()==4){
            if(i==s.length()){ res.add(String.join(".", parts));}
            return;
        }

        
    }
    public static boolean isValid2(String piece){
        if(piece.length() >1 && piece.charAt(0)=='0'){ return false;}
        int val = Integer.parseInt(piece);
        return val>=0 && val<=255;
    }
    public static void main(String[] args) {
        // System.out.println(partition("aab"));
        // System.out.println(partition("a"));
        // System.out.println(partition("aabb"));

        System.out.println(partition2("aab"));

        // System.out.println(restoreIpAddresses("25525511135"));
        // System.out.println(restoreIpAddresses("0000"));
        // System.out.println(restoreIpAddresses("101023"));
        
        System.out.println(restoreIpAddresses2("25525511135"));
    }
}

/**
leetcode 131:
Example 1:
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]

Example 2:
Input: s = "a"
Output: [["a"]]

leetcode 93:
example 1:
Input: s = "25525511135"
Output: ["255.255.11.135","255.255.111.35"]

Example 2:
Input: s = "0000"
Output: ["0.0.0.0"]

Example 3:
Input: s = "101023"
Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
 
 */