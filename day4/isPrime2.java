// Check if Number is Prime
// for, while, do-while loops, break/continue
// while

import java.util.Scanner;

public class isPrime2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,i=2;
        boolean isPrime = true;

        System.out.println("enter a number n to check prime:");
        n = in.nextInt();

        if (n >= 2) {

            while (i < (n/2)) {

                if (n % i == 0) {
                    isPrime = false;
                }i++;
            }

            if (isPrime == true)
                System.out.print("isPrime:" + isPrime);
            else
                System.out.print("isPrime:" + isPrime);

        } else
            System.out.println("enter valid number");
    }
}
