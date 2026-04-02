// Sum of Squares of Naturals

// package HRDRoadmap.BasicProblems;
import java.util.Scanner;
public class SumofSquaresofNaturals {
    public static void SumofSquaresofNaturals(int n){
        if(n>0){
        int sum = (n*(n+1)*(2*n+1))/6;
        System.out.print("sum of " + n + " naturals is: " +sum);
        }else System.out.println("Invalid data!");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number to Sum of square of Naturals: ");
        int n=in.nextInt();

        SumofSquaresofNaturals(n);
        System.out.println();
    }
}
