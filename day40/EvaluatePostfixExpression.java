import java.util.*;
public class EvaluatePostfixExpression {
    public static int evaluate(String s) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // if digit → push
            if (Character.isDigit(ch)) {
                st.push(ch - '0');  // convert char to int
            } 
            else {
                int op2 = st.pop(); // second operand
                int op1 = st.pop(); // first operand

                int res = 0;

                if (ch == '+') res = op1 + op2;
                else if (ch == '-') res = op1 - op2;
                else if (ch == '*') res = op1 * op2;
                else if (ch == '/') res = op1 / op2;

                st.push(res); // push result back
                System.out.println(res);
            }
        }

        return st.pop(); // final answer
    }

    public static void main(String[] args) {
        String s = "23*54*+9-";
        System.out.println("Output: " + evaluate(s));
    }
}