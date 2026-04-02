import java.util.*;
public class MinStack {
    Stack<Integer> st = new Stack<>();

    public void push(int x) {
        st.push(x);
    }

    public void pop() {
        if (!st.isEmpty()) st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {

        int min = Integer.MAX_VALUE;

        for (int x : st) {
            if (x < min) min = x;
        }

        return min;
    }

    public static void main(String[] args) {

        MinStack obj = new MinStack();

        obj.push(3);
        obj.push(1);
        obj.push(2);

        System.out.println(obj.getMin()); // 1
    }
}
