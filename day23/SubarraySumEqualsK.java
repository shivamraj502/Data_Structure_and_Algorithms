/**
 * Day 23 — Subarray Sum
Concept: Cumulative sum and prefix technique.
Problem: Subarray Sum Equals K – LeetCode 560
 */

import java.util.*;
public class SubarraySumEqualsK {
    public static int subArr(int [] arr, int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                if(sum == k){ count++;}
            }
        }return count;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,1};
        int k = 2;
        System.out.println(subArr(arr, k));
    }


    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count =0;

        System.out.println("Enter array length: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter target sum: ");
        int s = in.nextInt();

        for (int i = 0; i < n; i++) {
          for (int j = i; j < n; j++) {
                sum += arr[j];
                if(sum==s){
                    count++;
                }
            }
            sum =0;
          }
        System.out.println("count is: "+ count);
    }
}
