// Sum of Digits of a Number

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n ;
        int sum=0;
        int rem;

        System.out.println("enter a number: ");
        n = in.nextInt();

        if(n>=0){
        do{
            rem = n % 10;
            sum += rem;
            n /=10;
        }while(n>0);
        System.out.print("sum is: "+sum);
    }else System.out.println("invalid number");

    }
}
