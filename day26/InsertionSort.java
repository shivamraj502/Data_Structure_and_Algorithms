// Day 26 — Insertion Sort
// Concept: Incremental insertion technique.
// Problem: InsertionSort – GFG
// [5, 2, 4, 1, 3] -> [1, 2, 3, 4, 5]
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int arr[]={5,4,33,2,1};
        // int n = arr.length;
       
        System.out.println("Enter array length: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Before insertion sort:");
        for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");}
        System.out.println();
        
        insertionsort(arr,n);
    }

    public static void insertionsort(int[]arr,int n){
        // [5, 2, 4, 1, 3] -> [1, 2, 3, 4, 5]
        for(int i=0;i<n-1;i++){
          for(int j=i+1;j>0;j--){
            if(arr[j] < arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }else break;
        } System.out.println(Arrays.toString(arr));
    }

        System.out.println("After insertion sort:");
        for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");}
        System.out.println();
    }
}
