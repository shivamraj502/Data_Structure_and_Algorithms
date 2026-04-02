/**
 Armstrong Number 
 https://www.geeksforgeeks.org/dsa/program-for-armstrong-numbers/ 
 */

public class armstrongNumber {
    public static boolean isArmstrong(int n){
        boolean bool = false;
        int count =0,sum=0;
        int product=1;
        int rem =0;
        int m = n;
        int k=n;

        while(m>0){                // i lost my number n in this loop
            count++;
            m/=10;
        }
        
        for(int i=0;i<count;i++){
            rem= k % 10;
            k=k/10;

            for(int j=0;j<count;j++){
                product *= rem;
            }

            sum += product;
            rem=0;
            product=1;
            // System.out.println("sum: "+sum);
        }

        if(sum==n){return true;}

        return bool;
    }
    public static void main(String[] args) {
        int n=153;
        System.out.println("isArmstromg: " + isArmstrong(n));
        System.out.println();
    }
}


/**
 * Input: 153
 * output: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153        //silli mistake: 3^3=9
 */