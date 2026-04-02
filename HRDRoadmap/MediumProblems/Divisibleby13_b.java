/**
Check if a larger number is divisible by 13 or not
 */

import java.math.BigInteger;
public class Divisibleby13_b {
    public static boolean isDivisible(BigInteger A, BigInteger B){
        BigInteger result = A.mod(B);
        System.out.println("result: "+result);

        if(result.equals(BigInteger.ZERO)){return true;}
        else{return false;}

    }
    public static void main(String[] args) {
        BigInteger A = new BigInteger("1300000000000013000000000000013");
        BigInteger B = new BigInteger("13");
        System.out.println("isDivisible by 13: "+isDivisible(A,B));    
    }
}

/**
Examples : 
Input: s = "2911285"
Output: true
Explanation: 2911285 / 13 = 223945, which is a whole number with no remainder.

Input: s = "27"
Output: false
Explanation: 27 / 13 ≈ 2.0769..., which is not a whole number (there is a remainder).
 */