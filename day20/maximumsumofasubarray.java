// Given an array arr[] and an integer k, we need to calculate the maximum sum of a subarray having size exactly k.
// Input  : arr[] = [5, 2, -1, 0, 3], k = 3
// Output : 6
// Explanation : We get maximum sum by considering the subarray [5, 2 , -1]

import java.util.Scanner;

public class maximumsumofasubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k;
        int sum=0;
        int maxSum = 0;

        System.out.println("Enter array length: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter sub array length: ");
        k = in.nextInt();
        
        for (int i = 0; i <= n - k; i++) {
            for(int j=i;j<i+k;j++){
            sum += arr[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
            sum =0;
        }

        System.out.println("Max sum is: " + maxSum);

    }
}