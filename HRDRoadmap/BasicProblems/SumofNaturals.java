// Sum of Naturals

// package HRDRoadmap.BasicProblems;
import java.util.Scanner;
public class SumofNaturals {
    public static void SumofNaturals(int data){
        if(data>0){
        int sum = (data*(data+1))/2;
        System.out.print("sum of " + data + " naturals is: " +sum);
        }else System.out.println("Invalid data!");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number to Sum of Naturals: ");
        int n=in.nextInt();

        SumofNaturals(n);
        System.out.println();
    }
}
