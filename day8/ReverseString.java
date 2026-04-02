// Day 8 — Strings Basics
// Concept: Creating strings, concatenation, length(), charAt(), substring().
// Problem: Reverse a String – GFG 
// Goal: Understand String immutability.

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = in.nextLine();

        reverse(str);
    }    

    public static void reverse(String str){

        // mistakes
        // int n = str.length();
        // String rev[] = new String[n];
        // for(int i=str.length()-1 ,j=0;i>=0;i--,j++){
        //     System.out.print(str.charAt(i));
        //      rev[j] = str.charAt(i);
        // }

        char rev[] = str.toCharArray();
        int left =0;
        int right = str.length()-1;
        String new1 = "";

        System.out.println("original: " + str);
        while(left < right){
            char temp = rev[left];
            rev[left] = rev[right];
            rev[right] = temp;

            left++;
            right--;

        }
        System.out.print("reversed array: ");
        System.out.println(rev);
        
    }
}