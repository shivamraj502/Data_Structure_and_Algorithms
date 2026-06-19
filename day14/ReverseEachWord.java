// Day 14 — Mini-Project #2
// Task: Write a program to take a sentence, reverse each word, and print it.
// Hint: Use split(), StringBuilder.reverse().
// Goal: Apply strings + loops.
// ex: hii hello bye Output: iih olleh eyb

import java.util.Scanner;
public class ReverseEachWord {
    public static void revW(String s){
        StringBuilder str = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        s = s.trim();
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)!=' '){
            temp.append(s.charAt(i));
            }else{
                str.append(temp.reverse());
                str.append(" ");
                temp.setLength(0);                   // clear/reset StringBuilder
            }
        }
        str.append(temp.reverse());
        System.out.println(str);
    }
    public static void main(String[] args) {
        String s = "hii bro hello";
        revW(s);
    }


    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("enter string:");
        String str = in.nextLine();
        int n = str.length();

        String reverseString = "";
        String [] words = str.split(" ");

        for(String w: words){
        String reverseWord = "";
            for(int i= w.length()-1;i>=0;i--){
            reverseWord += w.charAt(i);
           }
        reverseString += reverseWord +" ";
        }
        
        System.out.print("reverse is: " + reverseString);
        
    }
}

            //StringBuilder clear/reset note
//Use temp.setLength(0) to empty StringBuilder