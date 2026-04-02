//  Multiplication Table

// package HRDRoadmap.BasicProblems;
import java.util.Scanner;
public class mulTable {
    public static void mulTable(int data){
        if(data>0){
        for(int i=1;i<=10;i++){
            System.out.println(data + " * " + i +" = " + (data*i));
        }}else System.out.println("Invalid data!");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number to create Table: ");
        int n=in.nextInt();

        mulTable(n);
        System.out.println();
    }
}
