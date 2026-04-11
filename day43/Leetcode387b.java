import java.util.HashSet;
import java.util.Set;
public class Leetcode387b {
    public static int firstUniqChar(String s) {
        
                    // ARRAY METHOD
        // int [] fr = new int[26];       // a -> 97
        // char []str = s.toCharArray();
        // for(char c : str){
        //     // System.out.println('a'-0);
        //     fr[c - 'a']++;
        // }
        // for(int i=0;i<s.length();i++){
        //     if(fr[str[i]-'a']==1){return i;}
        // }return -1;

        while(int i< s.length){ 
        Set<Character> set = new HashSet<>();
        if(set.contains(s.charAt(i)))

            i++;
        }

        return -1;
    }
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println("s: "+s);
        System.out.println(firstUniqChar(s));
    }
}

/**
387. First Unique Character in a String
Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.
Example 2:
Input: s = "loveleetcode"
Output: 2
Example 3:
Input: s = "aabb"
Output: -1
 */