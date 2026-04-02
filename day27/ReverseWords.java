// Day 27 — StringBuilder (Efficient String Manipulation)
// Concept: StringBuilder, append(), reverse(), mutable strings.
// Problem: ReverseWords in a String III – LeetCode 557

public class ReverseWords {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello i am shivam");

        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        
        int n = s.length();
        for(int i=0;i<n;i++) {
            if(s.charAt(i) != ' '){    //mistake: using " "
                temp.append(s.charAt(i));
            }else {
                temp = temp.reverse();  //can use only: temp.reverse();
                result.append(temp);
                result.append(' ');
                temp.setLength(0);  //mistake: using temp =' '    but now new thing setLength method
        }
    }
        temp.reverse();
        result.append(temp);
        System.out.println(result);
}
}