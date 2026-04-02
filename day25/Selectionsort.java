// selection sort

import java.util.Scanner;
class Selectionsort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        // int arr[]={5,4,3,2,1};
        // int n = arr.length;

        for (int i = 0; i < n; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    min = j;
                }
            }
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
        }

        System.out.println("selection sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}