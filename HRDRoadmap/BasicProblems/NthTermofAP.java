// Nth Term of AP

// package HRDRoadmap.BasicProblems;
import java.util.Scanner;
public class NthTermofAP {
    public static void findAp(int a1,int a2,int n){
        if(n>0){ 
        int num = a1 + (n-1)*(a2-a1);
        System.out.println("Nth term is: "+ num);
        }else System.out.println("Invalid position!");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st term: ");
        int a1=in.nextInt();

        System.out.println("Enter 2nd term: ");
        int a2=in.nextInt();

        System.out.println("Enter position(n) to find: ");
        int n=in.nextInt();

        findAp(a1,a2,n);
        // System.out.println("Nth term is: "+nth);

    }
}
