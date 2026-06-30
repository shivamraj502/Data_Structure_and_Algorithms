public class Palindrome {
    public static boolean isPal(String s){
        s = s.toLowerCase().trim();
        boolean bool = true;
        int left = 0;
        int right = s.length()-1;
        
        while(left < right){        // can also do it using reverse and compare(equals)
            if(s.charAt(left) != s.charAt(right)){return !bool;}
            left++;
            right--;
        }return bool;
    }

    public static void main(String[] args) {
        String s = "madaM   ";
        System.out.println(isPal(s));
    }
}
