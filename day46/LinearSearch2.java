/**
Day 46 – Linear Search
Concept: Basic search; best for small/unordered data.
Implement: linearSearch(int arr[], int key)
Problem: Linear Search – GFG
Goal: Understand O(n) complexity.
 */
   
import java.util.Scanner;
public class LinearSearch2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("enter array size: ");
    int n = in.nextInt();   

    int [] arr = new int[n];
    System.out.print("enter array for linear search: ");
    for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
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