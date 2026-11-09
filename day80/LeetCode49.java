/**
Day 80 – Map of Lists / Complex Mappings
Concept: HashMap<Integer, List<Integer>>
Problem: Group Anagrams – LeetCode49
Goal: Practice composite data structures.
 */
import java.util.*;
public class LeetCode49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        String [] temp = new String[strs.length];
        boolean [] used = new boolean[strs.length];

        for(int i=0;i<strs.length;i++){
            char [] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            temp[i]=sorted;
            sorted = "";
        }

        // for(int i=0;i<strs.length;i++){
        //     System.out.print(temp[i]+" ");
        // }System.out.println();

        for(int i=0;i<strs.length;i++){
            if(used[i]) continue;

            curr.add(strs[i]);
            used[i] = true;

            for(int j=i+1;j<strs.length;j++){
                if(!used[j] && temp[i].equals(temp[j])){
                    // System.out.println(true);
                    curr.add(strs[j]);
                    used[j]=true;
                }
            }res.add(new ArrayList<>(curr));
            curr.clear();
        }return res;
    }
    
    public static List<List<String>> groupAnagrams2(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }return new ArrayList<>(map.values());
    }
    
    public static List<List<String>> groupAnagrams3(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            int [] freq = new int[26];

            for(char c : s.toCharArray()){
                freq[c-'a']++;
            }

            StringBuilder key = new StringBuilder();
            for(int count: freq){
                key.append(count).append('#');
            }

            map.computeIfAbsent(key.toString(), k->new ArrayList<>()).add(s);
        }return new ArrayList<>(map.values());
    }
    
    public static List<List<String>> groupAnagrams4(String[] strs) {
        Map<Map<Character,Integer>, List<String>> groups = new HashMap<>();

        for(String s : strs){
            Map<Character,Integer> freq = new HashMap<>();

            for(char c : s.toCharArray()){
                freq.put(c,freq.getOrDefault(c, 0)+1);
            }

            groups.computeIfAbsent(freq, k -> new ArrayList<>()).add(s);
        }return new ArrayList<>(groups.values());
    }
    public static void main(String[] args) {
        String [] s = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(s));
        System.out.println(groupAnagrams2(s));
        System.out.println("\ngroup anag3 :"+groupAnagrams3(s));
        System.out.println("\ngroup anag4 :"+groupAnagrams4(s));
    }
}

/**
Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Explanation:
There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]
 */