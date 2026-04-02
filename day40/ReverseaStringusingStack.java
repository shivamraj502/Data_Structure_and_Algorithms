import java.util.Stack;
public class ReverseaStringusingStack {
    public static String reverse(String s){ 
    Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }

        String result = "";

        while (!st.isEmpty()) {
            result += st.pop();
        }

        return result;
    }
    public static void main(String[] args) {
        String s= "hello";
        System.out.println(reverse(s));
    }
    
}
