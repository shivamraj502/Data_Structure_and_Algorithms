// Day 10 — Character Frequency & ASCII
// Concept: Counting frequency using array/map.
// Problem: First Unique Character in a String – LeetCode 387
// Goal: Use HashMap<Character,Integer>.
// using brute force method

import java.util.Scanner;
public class UniqueCharacter2 {
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
        
        for (int i = 0; i < len; i++) {
            boolean foundDuplicate = false;
            
            for (int j = 0; j < len; j++) {
                if (i != j && unique[i] == unique[j]) {
                    foundDuplicate = true;count++;
                    System.out.println(count);
                    break;  
                }
            }
            
             if (!foundDuplicate) {      
                System.out.println("First unique character is: '" + unique[i] + "' at index: " + i);
                return;  
            }
        }
        
        System.out.println("No unique character found");
    }
}