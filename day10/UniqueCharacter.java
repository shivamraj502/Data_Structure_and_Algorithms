// Day 10 — Character Frequency & ASCII
// Concept: Counting frequency using array/map.
// Problem: First Unique Character in a String – LeetCode 387
// Goal: Use HashMap<Character,Integer>.

// wrong code
import java.util.Scanner;
public class UniqueCharacter {
    public static void main(String[] args) {
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