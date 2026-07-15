import java.util.Arrays;
/**
Day 56 – Quick Sort
Concept: Partition-based divide & conquer using pivot.
Problem: Quick Sort – GFG
Goal: Learn partitioning and in-place swapping.
 */
public class QuickSort2 {
    public static void QuickSort(int [] arr, int low, int high){
        
        if(low < high){
            int p = partition(arr,low,high);

            QuickSort(arr, low, p-1);
            QuickSort(arr, p+1, high);
        }

    }
    public static int partition(int[] arr,int low, int high){
        int pivot = arr[high],i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp =arr[i+1];
                arr[i+1]=arr[high];
                arr[high]=temp;
    return i+1;
    }
    public static void main(String[] args) {
        int [] arr = {5,8,9,88,4};
        QuickSort(arr, 0, arr.length-1);
        System.out.println("After Sorting: "+ Arrays.toString(arr));
    }
}                                           

/* Mistakes:
You partition arr correctly, but then recurse on newArr (an empty array of zeros) instead of arr. 
So only the first partition step ever actually sorts anything — the recursive calls do nothing meaningful.


*/