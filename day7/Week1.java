// Day 7 — Mini-Project #1
// Concept: Combine basics (loops + arrays + functions).
// Task: Write a Java program to compute the average, minimum, and maximum of n user-entered numbers.
// Practice Reference: Average of Array Elements – GFG
// Goal: Reinforce Week-1 concepts.


import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter array size:");
        int n= in.nextInt();

        int []arr = new int[n];
        System.out.println("enter array:");
        for(int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }

        int max = arr[0],min=arr[0];
        float average,sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(arr[i] > max){ max = arr[i];}
            if(arr[i] < min){ min = arr[i];}
        }
        
        System.out.println("Average is: " + (sum/n)+", Max: "+ max +",Min: " + min);

    }
}
