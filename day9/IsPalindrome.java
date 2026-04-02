// Day 9 — String Operations
// Concept: Compare strings (equals(), compareTo()), palindrome check.
// Problem: Check if String is Palindrome – LeetCode 125
// Goal: Practice string manipulation.

import java.util.Scanner;
public class IsPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome:");
        String str = in.nextLine();

        boolean ispal = true;

        for(int start =0, end = str.length()-1; start < (str.length())/2; start++,end--){
            if(str.charAt(start) != str.charAt(end)){
                ispal = false;
                break;
            }
        }

        if(ispal == true){ System.out.println("ispalin: "+ ispal);}
        else{ System.out.println("ispalin: "+ ispal);}
    }
}
