/**
 Divisible by 4 
 https://www.geeksforgeeks.org/dsa/check-large-number-divisible-4-not/
*/

import java.math.BigInteger;
public class Divisibleby4 {
    public static boolean isDivisible(BigInteger n){
        BigInteger temp= new BigInteger("100");

        BigInteger result = n.mod(temp);
        int intVal =result.intValue();
        // System.out.println("last 2 digits: "+intVal);

        if(intVal % 4 == 0){return true;}
        else{return false;}
    }
    public static void main(String[] args) {
        BigInteger A = new BigInteger("363588395960667043875487");
        
        System.out.println("isDivisible by 4: "+isDivisible(A));
        
    }
}

/**
Input : n = 1124
Output : Yes

Input  : n = 1234567589333862
Output : No

Input  : n = 363588395960667043875487
Output : No
 */