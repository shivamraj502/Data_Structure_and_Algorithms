package day0_4;
// program to find length of longest palindromic substring in a given string

public class palindrome {
    public static String longestPalindromicSubstring(String str) {
        int n = str.length();
        if (n == 0) {
            return "";
        }

        boolean[][] dp = new boolean[n][n];
        int maxLength = 1;
        int start = 0;

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        for (int length = 2; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;

                if (str.charAt(i) == str.charAt(j)) {
                    if (length == 2 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;

                        if (length > maxLength) {
                            start = i;
                            maxLength = length;
                        }
                    }
                }
            }
        }

        return str.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String input = "banana";
        String result = longestPalindromicSubstring(input);
        System.out.println("Longest Palindromic Substring of '" + input + "' is: " + result);
        System.out.println("Length: " + result.length());
    }
    
}
