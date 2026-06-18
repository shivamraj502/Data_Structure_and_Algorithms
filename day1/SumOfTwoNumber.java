//  SumOfTwoNumber: Take Input and Print Sum of Two Numbers – GFG

import java.util.Scanner;
class SumOfTwoNumber{
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a and b:");
        int a = in.nextInt();
        int b = in.nextInt();

  
            System.out.println("sum is:"+(a+b));
           
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a,b));
    }

}