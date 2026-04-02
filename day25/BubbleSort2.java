// Day 25 — Sorting Basics
// Concept: Bubble sort, selection sort.
// Problem: Bubble Sort – GFG

// Hint (simple idea)
// Compare neighbor numbers
// If left number is bigger, swap them
// After one full round, the largest number goes to the end
// Repeat until sorted
// Think of bubbles rising to the top

import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort2 { 
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        // int arr[]={5,4,33,2,1};
        // int n = arr.length;
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}
                        

