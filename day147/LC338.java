/**Day 147 – Count Set Bits
Problem: Counting Bits – LeetCode 338
Goal: Understand dynamic bit calculation. */

import java.util.Arrays;
public class LC338 {
    public static int[] find(int n){
        int [] res = new int[n+1];
        for(int i=0;i<=n;i++){
            res [i]= convert(i);
        }return res;
    }
    public static int convert(int n){
        String s="",s2="";    int m = n;
        while(m>0){
            int rem = m%2;
            s+=rem;
            m /=2;
        }

        for(int i=0;i<s.length();i++){
            s2 += s.charAt(s.length()-i-1);
        }return count(s2);
    }
    public static int count(String s){
        int c =0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
            }
        }return c;
    }
    public static void main(String[] args) {
        // int [] res =find(2);
        // int [] res =find(5);
        // int [] res =find(10);
        // int [] res =find(15);
        int [] res =find(20);
        System.out.println(Arrays.toString(res));
    }
}

/**
Test Case 1: n = 2 → Output: [0, 1, 1]
Test Case 2: n = 5 → Output: [0, 1, 1, 2, 1, 2]
Test Case 3: n = 10 → Output: [0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2]
Test Case 4: n = 15 → Output: [0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4]
Test Case 5: n = 20 → Output: [0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1, 2, 2, 3, 2]
*/

/**Line 15-28: The code converts the number to a binary string representation to count set bits, which is explicitly forbidden. */