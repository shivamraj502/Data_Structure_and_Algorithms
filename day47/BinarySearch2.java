/**
Day 47 – Binary Search (Iterative)
Concept: Divide & conquer on sorted arrays.
Implement: binarySearchIterative(int arr[], int key)
Problem: Binary Search – LeetCode 704
Goal: Practice mid calculation safely (mid = low + (high - low)/2).
 */

import java.util.Scanner;
public class BinarySearch2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter array size: ");
        int n = in.nextInt();

        int [] arr = new int[n];
        System.out.print("enter array for binary search: ");
        for(int i=0;i<n;i++){
            arr[i] =in.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            if(arr[i]> arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        System.out.println("enter target to search: ");
        int target = in.nextInt();

        int low = 0;
        int high = arr.length-1;

        // for(int i= low;i<high;i++){
        while (low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                System.out.println("found");
                return;
            }else
            if(arr[mid] > target){
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        System.out.println("not found");
        return ;
        
    }
}
