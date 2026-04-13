/**
Day 53 – Selection Sort
Concept: Select minimum element each pass.
Problem: Selection Sort – GFG
Goal: Learn about in-place sorting.
 */
public class SelectionSort2 {
    public static void sort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    min = j;
                }
            }
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
        }

        System.out.println("selection sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {1,5,9,4,2};
        sort(arr);
    }
}
