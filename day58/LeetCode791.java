/**
Day 58 – Sorting in Java & Comparators
Concept: Arrays.sort(), Collections.sort(), and custom comparators.
Problem: Custom Sort String – LeetCode791
Goal: Learn practical sorting in Java for objects.
 */
public class LeetCode791 {
    public static String sort(String s, String order){
        String str="";
        
        for(int i=0;i<order.length();i++){
            int count=0;

            for(int j=0;j<s.length();j++){
                if(order.charAt(i)==s.charAt(j)){
                    count++;
                    // System.out.println(".");
                }
            }

            for(int k=0;k<count;k++){
                str += order.charAt(i);
                // System.out.println(",,");
                // System.out.println(str);
            }
        }
        
        for(int i=0;i<s.length();i++){
            String temp = ""+s.charAt(i);

            if(str.contains(temp)){
                // System.out.println("<");
                continue;
            }else{
                int count =0;
                for(int j=i;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j)){
                        count++;
                        // System.out.println(">");
                    }
                }
                for(int j=0;j<count;j++){
                        str += temp;
                }
            }
        }return str;
    }
    public static void main(String[] args) {
            // String s = "utzoampdgkalexslxoqfkdjoczajxtuhqyxvlfatmptqdsochtdzgypsfkgqwbgqbcamdqnqztaqhqanirikahtmalzqjjxtqfnh";
            String s = "bcafg";
            // String order = "bcafg";
            // String order = "hucw";
            String order = "cba";
            String str =sort(s,order);
            System.out.println("result: "+str);
    }
}

/**
Example 1:
Input: order = "cba", s = "abcd"
Output: "cbad"

Example 2:
Input: order = "bcafg", s = "abcd"
Output: "bcad"

Example 2:
Input: order = ""hucw"", s = "utzoampdgkalexslxoqfkdjoczajxtuhqyxvlfatmptqdsochtdzgypsfkgqwbgqbcamdqnqztaqhqanirikahtmalzqjjxtqfnh"
Output: "bcad"


 */

// Mistakes: 
/**
    how to check a char in a string: 
    if (s.indexOf('a') != -1) {
    // 'a' exists in s
    } 

    if (s.contains(String.valueOf('a'))) { ... }
    // or
    if (s.contains("a")) { ... }
 */