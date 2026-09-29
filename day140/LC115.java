/**Day 140 – Distinct Subsequences
Problem: Distinct Subsequences – LeetCode 115
Goal: Learn recursive inclusion-exclusion DP. */

public class LC115 {
    static int count = 0;
    public static int distincts(String s, String t){
        count = 0;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        return helper(s1,t1,0,0);
    }
    public static int helper(char[] s1, char[] t1,int i,int j){
        if(j == t1.length){ return 1;}
        if(i == s1.length){ return 0;}

        if(s1[i]==t1[j]){
            int add = helper(s1, t1, i+1, j+1);
            int remove = helper(s1, t1, i+1, j);
            return add+remove;
        }return helper(s1, t1, i+1, j);
    }
    public static void main(String[] args) {
        // String s = "rabbbit"; String t = "rabbit";
        String s = "babgbag"; String t = "bag";
        System.out.println(distincts(s,t));
    }
}

/**Example 1:
Input: s = "rabbbit", t = "rabbit"
Output: 3
Explanation:
As shown below, there are 3 ways you can generate "rabbit" from s.
rabbbit
rabbbit
rabbbit

Example 2:
Input: s = "babgbag", t = "bag"
Output: 5
Explanation:
As shown below, there are 5 ways you can generate "bag" from s.
babgbag
babgbag
babgbag
babgbag
babgbag
  */