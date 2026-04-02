// Check if Number is Prime
// for, while, do-while loops, break/continue
// for

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        boolean isPrime = true;

        System.out.println("enter a number n to check prime:");
        n = in.nextInt();

        if (n >= 2) {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true)
                System.out.print("isPrime:" + isPrime);
            else
                System.out.print("isPrime:" + isPrime);
        } else
            System.out.println("enter valid number");
    }
}
