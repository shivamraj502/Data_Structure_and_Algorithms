/**
Day 28 — Practice Day (Mix of Arrays & Strings)
Solve 3 easy problems:
Move Zeroes – LeetCode 283
Remove Element – LeetCode 27
Valid Anagram – LeetCode 242
 */

/**
 LeetCode 242: Valid Anagram
 */

import java.util.*;
public class ValidAnagram {
    public static boolean isAna(String s, String t){
        Map<Character,Integer> maps = new HashMap<>();
        Map<Character,Integer> mapt = new HashMap<>();

    if(s.length() == t.length()){
        for(int i=0;i<s.length();i++){
            if(maps.get(s.charAt(i)) == null){
                maps.put(s.charAt(i), 1);
            }else{
                maps.put(s.charAt(i),maps.get(s.charAt(i))+1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(mapt.get(t.charAt(i)) == null){
                mapt.put(t.charAt(i), 1);
            }else{
                mapt.put(t.charAt(i),mapt.get(t.charAt(i))+1);
            }
        }System.out.println(maps);System.out.println(mapt);

        for(int i=0;i<s.length();i++){
            if(maps.get(s.charAt(i)) != mapt.get(s.charAt(i))){  //better: !maps.get(s.charAt(i)).equals(mapt.get(s.charAt(i)))
                return false;
            }
        }return true;       // return maps.equals(mapt);
    
    }else return false;
    }
    public static void main(String [] args){
        String s = "heyybrol";
        String t = "hyeyrobb";
        System.out.println(isAna(s, t));
    }

     public static void main2(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter array length: ");
        // int n = in.nextInt();

        // int arr[] = new int[n];
        // System.out.println("Enter array elements: ");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = in.nextInt();
        // }

        String s= "silent";
        String t = "listen";
        boolean b =validAnagram(s,t);
        System.out.println(b);
    }

    static boolean validAnagram(String s, String t){
        boolean isanagram = true;
        if(s.length() == t.length()){
            char [] c1 = s.toCharArray();
            char [] c2 = t.toCharArray();
            for(int i=0;i<c1.length;i++){
                for(int j=0;j<c1.length-1;j++){
                    if(c1[j+1]<c1[j]){
                        char temp = c1[j];
                        c1[j]=c1[j+1];
                        c1[j+1]=temp;
                    }
                }
            }

            for(int i=0;i<c1.length;i++){
                for(int j=0;j<c1.length-1;j++){
                    if(c2[j+1]<c2[j]){
                        char temp = c2[j];
                        c2[j]=c2[j+1];
                        c2[j+1]=temp;
                    }
                }
            }

            System.out.println(new String(c1));
            System.out.println(new String(c2));
            String s1 = new String(c1);
            String s2 = new String(c2);
            
            if(s1.equals(s2)){                                   //Arrays.equals(c1,c2)
                return isanagram;
            }else return !isanagram;
        }
        else{ isanagram=false;}
         return isanagram;
    }
}
