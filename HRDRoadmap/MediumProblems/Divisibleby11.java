/**
Check if a large number is divisible by 11 or not
*/

import java.math.BigInteger;
public class Divisibleby11 {
    public static boolean isDivisible(BigInteger n){
        BigInteger sum1 = new BigInteger("0");
        BigInteger sum2 = new BigInteger("0");

        String result = n.toString();
        // System.out.println(result);
        
        for(int i=1;i<result.length();i=i+2){
        int digit = result.charAt(i)-'0';
        sum1=sum1.add(BigInteger.valueOf(digit)); //most difficult line of code in this problem
        // System.out.println("digit: "+ digit);
        // System.out.println("sum1: "+sum1);
        // System.out.println("i: "+i);
        }
        
        for(int j=0;j<result.length();j=j+2){ 
        int digit = result.charAt(j)-'0';
        sum2=sum2.add(BigInteger.valueOf(digit));
        // System.out.println("digit: "+ digit);
        // System.out.println("sum2: "+sum2);
        // System.out.println("j: "+j);
        }

        BigInteger diff = sum1.subtract(sum2).abs();
        // BigInteger diff2 = new BigInteger("0");

        if(diff.mod(BigInteger.valueOf(11)).equals(BigInteger.ZERO)){
            return true;
        }
        else{
            return false;
        }

        // if(sum1.subtract(sum2)==0 || (sum1.subtract(sum2)).(mod(11))==0){return true;}
        // else{return false;}
    }
    public static void main(String[] args) {
        BigInteger A = new BigInteger("76945");
        
        System.out.println("isDivisible by 11: "+isDivisible(A));
        
    }
}

/**
Input: s = "76945"
Output: true
Explanation: s when divided by 11 gives 0 as remainder.

Input: s = "7695"
Output: false
Explanation: s does not give 0 as remainder when divided by 11.

Input: s = "1234567589333892"
Output: true
Explanation:  s when divided by 11 gives 0 as remainder.
 */