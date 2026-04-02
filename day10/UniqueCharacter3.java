// Day 10 — Character Frequency & ASCII
// Concept: Counting frequency using array/map.
// Problem: First Unique Character in a String – LeetCode 387
// Goal: Use HashMap<Character,Integer>.
// using map

import java.util.Scanner;
public class UniqueCharacter3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = in.nextLine();

        unique(str);
    }    

    public static void unique(String str) {
        char unique[] = str.toCharArray();
        int len = str.length();
        int count =0;
        }
}