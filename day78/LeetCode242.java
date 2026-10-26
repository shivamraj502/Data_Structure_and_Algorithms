/**
Day 78 – Frequency Counting
Concept: Counting characters/elements using HashMap.
Problem: Valid Anagram – LeetCode 242
Goal: Use maps for frequency-based problems.
 */

import java.util.*;
public class LeetCode242 {
    public static boolean isAnag(String s, String t){
        char [] ch = s.toCharArray();
        char [] ch2 = t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        if(ch.length == ch2.length){ 
        for(int i=0;i<ch.length;i++){
            if(ch[i] != ch2[i]) return false;
            // System.out.println(ch[i]+" "+ch2[i]);
        }}else return false;

        return true;
    }
    
    public static boolean isAnag2(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        char[] c1 = s1.toCharArray();   char [] c2 = s2.toCharArray();
        Arrays.sort(c1); Arrays.sort(c2);
        
        for(int i=0;i<s1.length();i++){ if(c1[i] != c2[i]) return false;}

        return true;
    }
    
    public static boolean isAnag3(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        char[] c1 = s1.toCharArray();   char [] c2 = s2.toCharArray();
        Arrays.sort(c1); Arrays.sort(c2);
        
        return Arrays.equals(c1, c2);
    }
    
    public static boolean isAnag4(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        char[] c1 = s1.toCharArray();   char [] c2 = s2.toCharArray();
        
        for(int i =0;i<s1.length();i++){
            map1.put(c1[i],map1.getOrDefault(c1[i],0)+1);
            map2.put(c2[i],map2.getOrDefault(c2[i],0)+1);
        }return map1.equals(map2);
    }
    
    public static boolean isAnag5(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        char[] c1 = new char[26];   char[] c2 = new char[26];
        
        for(int i =0;i<s1.length();i++){
            c1[s1.charAt(i)-'a']++;
            c2[s2.charAt(i)-'a']++;
        }return Arrays.equals(c1, c2);
    }

    public static boolean isAnag6(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        Map<Character,Integer> map1 = new HashMap<>();

        for(int i =0;i<s1.length();i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i =0;i<s1.length();i++){
            if((!map1.containsKey(s2.charAt(i))) || map1.get(s2.charAt(i))==0) return false;
            map1.put(s2.charAt(i),map1.getOrDefault(s2.charAt(i),0)-1);
        }return true; 
        // return map1.isEmpty();   // NOT CORRECT WAY
        // return map1.size()==0;   // NOT CORRECT WAY
    }
    
    public static boolean isAnag7(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        char[] freq = new char[26];
        for(int i =0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int i =0;i<s2.length();i++){
            freq[s2.charAt(i)-'a']--;
        }
        
        for(int count : freq){ if(count != 0) return false;}
        return true;
    }
    
    public static boolean isAnag8(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        char[] freq = new char[26];
        for(int i =0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        
        for(int count : freq){ if(count != 0) return false;}
        return true;
    }

    public static void main(String[] args) {
        // String s = "anagram", t = "nagaram";
        String s = "rat", t = "car";
        System.out.println(isAnag(s,t));
        System.out.println(isAnag2(s,t));
        System.out.println(isAnag3(s,t));
        System.out.println(isAnag4(s,t));
        System.out.println("isAnag5 : "+isAnag5(s,t));
        System.out.println("isAnag6 : "+isAnag6(s,t));
        System.out.println("isAnag7 : "+isAnag7(s,t));
        System.out.println("isAnag8 : "+isAnag8(s,t));
    }
}

/**
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 */