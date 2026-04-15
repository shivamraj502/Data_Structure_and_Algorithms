/**
Day 60 – MiniProject #8
Task: Build a Sorting Visualizer (Console-based)
Input array, choose sorting method, display each pass.
Goal: Reinforce understanding by simulating sorting steps.
 */

import java.util.Scanner;
public class MiniProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sorting Visualizer (Console) ===\n");

        // Take array input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Show menu
        System.out.println("\nChoose Sorting Algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.println("\nOriginal Array:");
        printArray(arr);

        System.out.println("\nSorting Process:\n");

        switch (choice) {
            case 1:
                bubbleSort(arr);
                break;
            case 2:
                selectionSort(arr);
                break;
            case 3:
                insertionSort(arr);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("\nSorting Completed!");
        System.out.println("Final Sorted Array:");
        printArray(arr);

        sc.close();
    }

    // ==================== Bubble Sort with Visualization ====================
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Pass " + (i + 1) + ":");
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                printArray(arr);   // Show array after each swap
            }
            System.out.println("-------------------");
        }
    }

    // ==================== Selection Sort with Visualization ====================
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            System.out.println("Pass " + (i + 1) + ":");
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            printArray(arr);
            System.out.println("-------------------");
        }
    }

    // ==================== Insertion Sort with Visualization ====================
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            System.out.println("Pass " + i + " (Inserting " + key + "):");

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                printArray(arr);   // Show shifting
            }
            arr[j + 1] = key;
            printArray(arr);
            System.out.println("-------------------");
        }
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}