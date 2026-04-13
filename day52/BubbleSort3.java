/**
Day 52 – BubbleSort
Concept: Repeated swapping of adjacent elements.
Implement: bubbleSort(int arr[])
Problem: Bubble Sort – GFG
Goal: Understand nested loops & time complexity O(n²).
 */
public class BubbleSort3 {
    public static void sort(int []arr){
        int n=arr.length;
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
    public static void main(String[] args) {
        int arr[] ={1,6,2,7,9};
        sort(arr);
    }
}
