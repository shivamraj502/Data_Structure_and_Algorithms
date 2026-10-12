import java.io.*;
public class b1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine().trim();
        int[] segments = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        int total = 0;

        for (int i = 0; i < n.length(); i++) {
            total += segments[n.charAt(i) - '0'];
        }

        System.out.println(total);
    }
}

/*
Problem Name: Seven-Segment Display
Problem Statement: A seven-segment display is an electronic display used to represent digits from 0 to 9. Each digit requires a specific number of illuminated segments.

You are given a non-negative integer N. Calculate the total number of segments required to display all the digits of N.

Segment counts:
0 -> 6
1 -> 2
2 -> 5
3 -> 5
4 -> 4
5 -> 5
6 -> 6
7 -> 3
8 -> 7
9 -> 6

Input Format: A single line containing the number N.

Output Format: Print the total number of segments required to display N.

Sample Input 1: 123
Sample Output 1: 12

Explanation:
Digit 1 requires 2 segments.
Digit 2 requires 5 segments.
Digit 3 requires 5 segments.
Total = 2 + 5 + 5 = 12.


Test Case 1:
Input: 123
Output: 12

Test Case 2:
Input: 0
Output: 6

Test Case 3:
Input: 8
Output: 7

Test Case 4:
Input: 000
Output: 18

Test Case 5:
Input: 9870
Output: 22

Time Complexity: O(n)
Space Complexity: O(1), excluding the input string.
*/