package day1b;
import java.util.*;
public class Avg {
    public static long avg(long a, long b){
        return (a+b)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println("avg: "+avg(a,b));
    }
}