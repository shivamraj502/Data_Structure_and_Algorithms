import java.util.Scanner;
public class StringRev {
    public static String rev(String s){
        String st = "";
        for(int i=0;i<s.length();i++){
            st += s.charAt(s.length()-i-1);
        }return st;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(rev(s));
    }
}
