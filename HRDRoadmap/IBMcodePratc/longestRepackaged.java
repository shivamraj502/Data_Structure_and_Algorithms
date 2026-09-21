// longest repackaged for 2^n

import java.util.*;
public class longestRepackaged {
    public static long find(List<Integer> list){
        long rem = 0;
        long max = 0;

        for(int i : list){
            long total = i+rem;
            long pow = 1;
            for(int j=1;j<=total;j*=2){
                pow = j;
                if(j>total/2)break;
            }
            rem = total-pow;
            max = Math.max(max, pow);
        }return max;
    }
    public static void main(String[] args) {
    List<Integer> packets = Arrays.asList(10, 5, 21);
    long result = find(packets);
    System.out.println("Maximum repackaged packet: " + result);
    }
}
