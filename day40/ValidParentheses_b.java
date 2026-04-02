import java.util.*;
public class ValidParentheses_b {
    public static boolean isValid( String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            st.push('(');
        }else if(s.charAt(i)=='{'){
            st.push('{');
        }else if(s.charAt(i)=='['){
            st.push('[');
        }else if(s.charAt(i)==')'){
            if(st.pop()!='('){return false;}
        }else if(s.charAt(i)=='}'){
            if(st.pop()!='{'){return false;}
        }else if(s.charAt(i)==']'){
            if(st.pop()!='['){return false;}
        }}
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s="{}()[]";
        System.out.println(isValid(s));
    }
}

