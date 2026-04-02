// Bubblesort

import java.util.Scanner;
public class Bubblesort {
    public static void main(String[] args) {
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
