// Check if Number is Prime
// for, while, do-while loops, break/continue
// break

import java.util.Scanner;

public class isPrime4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,i=2;
        boolean isPrime = true;

        System.out.println("enter a number n to check prime:");
        n= in.nextInt();

        if(n>=2){
            do{
             if (n % i == 0) {
                    isPrime = false;
                    break;
                }i++;
        }while(i < (n/2));

        if(isPrime == true) System.out.print("isPrime:"+isPrime);
        else System.out.print("isPrime:"+isPrime);
    }else System.out.println("enter valid number");
    }
}
