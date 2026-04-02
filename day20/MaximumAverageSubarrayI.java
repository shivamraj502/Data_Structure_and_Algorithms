// Day 20 — Sliding Window Technique
// Concept: Dynamic subarray/substring window.
// Problem: Maximum Average Subarray I – LeetCode 643
// Goal: Optimise range problems.
// Input: [1, 12, -5, -6, 50, 3]: 
// [1, 12, -5, -6]
// [12, -5, -6, 50]
// [-5, -6, 50, 3]

import java.util.Scanner;

public class MaximumAverageSubarrayI {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double k;
        double sum=0;
        double maxAvg = 0;
        double avg;

        System.out.println("Enter array length: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter sub array length: ");
        k = in.nextInt();
        
        if(n >= 0){
        for (int i = 0; i <= n - k; i++) {
            for(int j=i;j<i+k;j++){
            sum += arr[j];
            }avg = sum / k;
            if (avg > maxAvg) {
                maxAvg = avg;
            }
            sum =0;
        }
      }else{
        System.out.println("Invalid array length");
      }

        System.out.println("Max sum is: " + maxAvg);
    }
}