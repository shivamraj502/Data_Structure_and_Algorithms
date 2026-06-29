// package day1b;
import java.util.*;
public class Avg {
    public static int avg(int a, int b){
        return (a+b)/2;
        // return (a+(b-a)/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("avg: "+avg(a,b));

        byte c = 2;
        short d = 33;
        // c = d ;
        d = c;
    }
}