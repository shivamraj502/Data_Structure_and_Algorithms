/**
Day 40 – Applications of Stack
Concept: Reversal, balanced parentheses, postfix evaluation.
Problem: Valid Parentheses – LeetCode 20
Goal: Understand real-world stack use cases.
 */

// package day40;
import java.util.*;
public class ApplicationsofStack {
    public static boolean isValid(String s){
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('|| ch=='{' || ch=='['){
                st.push(ch);
            }else if(ch==')'){
                if(st.isEmpty() || st.pop()!='('){return false;}
            }else if( ch=='}' ){
                if(st.isEmpty() || st.pop()!='{'){return false;}
            }else if( ch==']'){
                if(st.isEmpty() || st.pop()!='['){return false;}
            }
        }return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "({[})";
        System.out.println(isValid(s));
    }
}
