//  Check Even or Odd

// package HRDRoadmap.BasicProblems;

import java.util.Scanner;

public class evenOdd {
    public static void evenOdd(int data){
        if(data>0){
            if(data % 2 == 0){System.out.println("Even");}
            else System.out.println("Odd");
        }else System.out.println("Invalid data");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number to check even/odd: ");
        int n=in.nextInt();

        evenOdd(n);
    }
}
