import java.io.*;
import java.util.*;
public class a1 {   // cot correct completely
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] sf = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            sf[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sf);

        long power = 0;
        for (int i = 0; i < k; i++) {
            power += sf[i];
        }

        System.out.println(power);
    }
}

/*
Problem Name: The Server Conundrum - Maximum Distribution Power

Problem Statement:
You are given N servers, each having a storage factor SF[i], and an integer K.
Your task is to select exactly K servers such that the sum of their storage factors is minimized.
The minimum possible sum is called the distribution power P.

Input Format:
- The first line contains two integers N and K.
- The second line contains N space-separated integers representing SF[i].

Output Format:
Print the minimum possible sum of the storage factors of exactly K selected servers.

Constraints:
- 1 <= K <= N <= 200
- 1 <= SF[i] <= 200

Sample Input 1:
3 2
6 3 5

Sample Output 1: 8

Explanation:
The storage factors in sorted order are [3, 5, 6].
The two smallest values are 3 and 5.
Therefore, P = 3 + 5 = 8.


Test Case 1:
Input:
3 2
6 3 5
Output: 8


Test Case 2:
Input:
5 1
10 4 7 2 9
Output: 2


Test Case 3:
Input:
4 3
8 1 6 3
Output: 10


Test Case 4:
Input:
5 5
2 4 6 8 10
Output: 30


Test Case 5:
Input:
6 2
100 50 20 10 70 30
Output: 30


Algorithm:
1. Read N, K, and the storage factors.
2. Sort the storage factors in ascending order.
3. Add the first K elements.
4. Print the resulting sum.

Time Complexity: O(N log N)
Space Complexity: O(N)
*/