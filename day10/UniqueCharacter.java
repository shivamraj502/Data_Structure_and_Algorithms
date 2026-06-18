// Day 10 — Character Frequency & ASCII
// Concept: Counting frequency using array/map.
// Problem: First Unique Character in a String – LeetCode 387
// Goal: Use HashMap<Character,Integer>.

import java.util.HashMap;
import java.util.Scanner;
public class UniqueCharacter {
    public static char unq(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<s.length();i++){
            if((map.get(s.charAt(i)))==1) return s.charAt(i);
        }
        return 0;
    }
    public static void main(String[] args) {
        String s = "heehi";
        System.out.println(unq(s));
    }


    // wrong code
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = in.nextLine();

        unique(str);
    }    

    public static void unique(String str){

        char unique[] = str.toCharArray();
        int k=0;
        int len = str.length();
        boolean bool = true;

        for(int i =0;i<len;i++){
         for(int j = 0;j<len;j++){
            if(unique[i] == unique[j]){

                bool =false;
                break;
            }
          }k++;
        }
        
        if(bool == true){System.out.println("unique char is: " + unique[k]);}
        else{ System.out.println("unique char: Not available any");}
   }
}