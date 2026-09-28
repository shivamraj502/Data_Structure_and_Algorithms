/**Day 136 – Longest Common Substring
Problem: Longest Common Substring – GFG
Goal: Handle DP with reset-on-mismatch rule. */

public class LongestCommonSubstring {
    public static int longSubString(String s1, String s2){
        int max = 0;s1 = s1.toLowerCase();s2=s2.toLowerCase();
        char [] a1 = s1.toCharArray();
        char [] a2 = s2.toCharArray();

        for(int i=0;i<a1.length;i++){
            int count=0;int tempMax=0;
            for(int j=0;j<a2.length;j++){
                if(i+count <a1.length&& a1[i+count]==a2[j]){
                    tempMax++;
                    count++;
                    if(tempMax > max){ max = tempMax;}
                }else {count=0;tempMax=0;}
            }//if(tempMax > max){ max = tempMax;}
        }

        return max;
    }

    public static int longSubString2(String s1, String s2){
        int max = 0;s1 = s1.toLowerCase();s2 = s2.toLowerCase();
        char [] a1 = s1.toCharArray();
        char [] a2 = s2.toCharArray();

        for(int i=0;i<a1.length;i++){
            int count=0;
            for(int j=0;j<a2.length;j++){
                while(i+count <a1.length && j+count < a2.length && a1[i+count]==a2[j+count]){
                    count++;
                }
            }if(count > max){ max = count;}
        }

        return max;
    }
    public static void main(String[] args) {
        // String s1 = "abc"; String s2 = "bc";
        // String s1 = "ABABC"; String s2 = "BABCA";
        // String s1 = "GeeksForGeeks"; String s2 = "GeeksQuizGeeks";
        // String s1 = "ABCDEFGH"; String s2 = "XYZCDEFGP";
        // String s1 = "ABCDXYZABCD"; String s2 = "PQABCDRSTABCD";
        String s1 = "ZXABCDEFY"; String s2 = "PQABCDERST";

        System.out.println(longSubString(s1,s2));
        System.out.println(longSubString2(s1,s2));
    }
}

/**
| Test | `text1`         | `text2`          | Output |
| ---- | --------------- | ---------------- | -----: |
| 1    | `ABABC`         | `BABCA`          |  **4** |
| 2    | `GeeksForGeeks` | `GeeksQuizGeeks` |  **5** |
| 3    | `ABCDEFGH`      | `XYZCDEFGP`      |  **5** |
| 4    | `ABCDXYZABCD`   | `PQABCDRSTABCD`  |  **4** |
| 5    | `ZXABCDEFY`     | `PQABCDERST`     |  **5** |
 */