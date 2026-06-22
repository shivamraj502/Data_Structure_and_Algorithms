// Day 27 — StringBuilder (Efficient String Manipulation)
// Concept: StringBuilder, append(), reverse(), mutable strings.
// Problem: ReverseWords in a String III – LeetCode 557

public class ReverseWords {
    public static String str3(String s){
        StringBuilder str = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==' '){
                str.append(temp.reverse());
                str.append(" ");
                // temp = new StringBuilder(""); 
                temp.setLength(0);  // temp.setLength(0);                  //reset,empty
            }else{ temp.append(s.charAt(i));}
        }str.append(temp.reverse());
        
        String s2 = new String();
        for(int i=0; i<str.length();i++){
            s2 += str.charAt(i);
        }
        
        return s2;
    }
    public static void main(String[] args) {
        String s = "hi hello";
        System.out.println(str3(s));
    }


    public static void main2(String[] args) {
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