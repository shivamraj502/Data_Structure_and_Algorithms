// Day 6 — Arrays Introduction
// Concept: Declaring, initializing, and accessing arrays.
// Problem: Find Maximum and Minimum in an Array – GFG
// Goal: Iterate through arrays.

import java.util.Scanner;

public class MaximumAndMinimum {
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
        for(int i=1;i<n;i++){
            if(arr[i] > max){ max = arr[i];}
            if(arr[i] < min){ min = arr[i];}
        }
        
        System.out.println("Max: "+ max +",Min: " + min);

    }
}
