import java.util.*;
public class evenOddPrefixSumMaximization {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6};

        int sum = 0;
        int maxOdd = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if(sum % 2 != 0) {
                maxOdd = Math.max(maxOdd, sum);
            }
        }System.out.println(maxOdd);
    }
}