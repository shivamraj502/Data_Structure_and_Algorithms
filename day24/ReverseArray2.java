/**
 * Day 24 — Reverse Array In-Place
Concept: Swap elements using two-pointer.
Problem: Reverse Array – GFG
will try using method also
 */

import java.util.*;
public class ReverseArray2 {
    public static void reverse(int [] arr,int n){
        System.out.println("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }System.out.println();

        int left = 0;
        int right =n-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reverse array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
}
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Enter array length: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        reverse(arr, n);

    }
}