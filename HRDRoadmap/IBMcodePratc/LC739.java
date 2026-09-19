/**Example 1:
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

Example 2:
Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]

Example 3:
Input: temperatures = [30,60,90]
Output: [1,1,0] */

import java.util.*;
public class LC739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] temperatures1 = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures1))); // Output: [1,1,4,2,1,1,0,0]

        int[] temperatures2 = {30,40,50,60};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures2))); // Output: [1,1,1,0]

        int[] temperatures3 = {30,60,90};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures3))); // Output: [1,1,0]
    }
}
