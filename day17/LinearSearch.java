// Day 17 — Linear Search
// Concept: Sequential search in arrays.
// Problem: Linear Search – GFG
// Goal: First search algorithm.

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter array size: ");
    int n = in.nextInt();   
    int [] arr = new int[n];
    System.out.print("enter array for linear search: ");
    for(int i=0;i<n;i++){
        in.nextInt();
    }
    System.out.println("enter target to search: ");
    int target = in.nextInt();
    for(int i=0;i<n;i++){
        if(arr[i] == target){
            System.out.println("found");
            return;
        }
    }
    System.out.println("not found");
}
}