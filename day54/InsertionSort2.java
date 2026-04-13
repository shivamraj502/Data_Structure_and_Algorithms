import java.util.Arrays;

/**
Day 54 – InsertionSort
Concept: Build sorted array one element at a time.
Problem: Insertion Sort – GFG
Goal: Practice shifting elements manually.
 */
public class InsertionSort2 {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
          for(int j=i+1;j>0;j--){
            if(arr[j] < arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }else break;
            }
        }
        System.out.println("After insertion sort:");
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");}
    }
    public static void main(String[] args) {
        int arr[] = {5,8,9,1,6};
        sort(arr);
    }
}
