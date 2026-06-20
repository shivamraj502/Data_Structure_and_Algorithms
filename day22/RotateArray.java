/**
 * WEEK-4: Strengthen Arrays + Strings
Day 22 — Array Rotation
Concept: Rotate array left/right by k.
Problem: Rotate Array – LeetCode 189 
Topic name: Array Rotation (Two-Pointer / Reversal Technique) */

import java.util.Scanner;
public class RotateArray {
    public static int [] rot(int arr[],int k){

        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for(int i=0;i<(arr.length -k)/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-k-i-1];
            arr[arr.length-k-i-1] = temp;
        }
        for(int i=arr.length-k,j=0; i< arr.length-k+(k/2); i++,j++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-j];
            arr[arr.length-1-j] = temp;
        }        
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] res = rot(arr, 3);

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }System.out.println();
    }



    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter array length: ");
        int n = in.nextInt();

        System.out.println("Enter number of elements to rotate: ");
        int k = in.nextInt();

        int left = 0 ,right = n-1;
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Original array:");
        for(int l= 0;l<n;l++){System.out.print(arr[l] +" ");}

        System.out.println("\nnew:");
        for(int l= 0;l<n/2;l++){
            int temp = arr[l];
            arr[l] = arr[n-l-1];
            arr[n-l-1] = temp;
        }
        for(int l= 0;l<n;l++){System.out.print(arr[l] +" ");}

        System.out.println("\nnew k swap:");
        for(int l= 0;l<k/2;l++){
            int temp = arr[l];
            arr[l] = arr[k-l-1];
            arr[k-l-1] = temp;
        }
        for(int l= 0;l<n;l++){System.out.print(arr[l] +" "); }

        System.out.println("\nnew n-k swap:");
        for(int l= k, m=0;l<(k+(n-k)/2);l++,m++){
            int temp = arr[l];             // 1 2 3 4 5 
            arr[l] = arr[n-m-1];           // 0 1 2 3 4 
            arr[n-m-1] = temp;             // k=2
        }                                  //     2
        for(int l= 0;l<n;l++){System.out.print(arr[l] +" ");}
    }
}
