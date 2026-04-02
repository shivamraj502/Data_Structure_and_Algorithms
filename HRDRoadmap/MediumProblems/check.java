// import java.math.BigInteger;
import java.math.*;

public class check {
    public static void main(String[] args) {
        BigInteger A = new BigInteger("363588395960667043875488");
        BigInteger temp= new BigInteger("100");

        BigInteger result = A.mod(temp);
        int val =result.intValue();
        // System.out.println("last 2 digits: "+val);

        if(val % 4 == 0){
            System.out.println("isDivisible by 4: "+"true");
        }else{
            System.out.println("isDivisible by 4: "+"false");
        }
    }
    
}
