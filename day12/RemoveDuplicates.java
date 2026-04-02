// Day 12 — Arrays Deep Dive
// Concept: Traversal, insertion, deletion.
// Problem: Remove Duplicates from Sorted Array – LeetCode 26
// Goal: Manipulate arrays efficiently.

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter array size(n):");
        int n = in.nextInt();

        System.out.println("enter array elements:");
        int [] arr = new int[n];
        for(int i= 0;i<n;i++){
            arr[i] = in.nextInt();
        }

        for(int i= 0;i<n;i++){
            for(int j= i+1;j<n;j++){
                if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }
            }
        }

        System.out.println("sorted array:");
        for(int i= 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

        System.out.println("new array:");

        // 1 2 2 2 4   4 
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--;
                    j--;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
