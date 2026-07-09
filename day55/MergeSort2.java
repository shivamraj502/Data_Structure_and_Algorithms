import java.util.Arrays;

/**
Day 55 – Merge Sort (Divide and Conquer)
Concept: Recursively divide array and merge sorted halves.
Problem: Merge Sort – LeetCode 912
Goal: Understand recursion depth & merging logic.
 */
public class MergeSort2 {
    public static void mergeSort(int arr[]){
        if(arr.length<=1){return;}

        int mid=arr.length/2;
        // System.out.println("mid: "+mid);
        // System.out.println("arr.legth - mid: "+(arr.length-mid));
        int [] left = new int[arr.length-mid];
        int [] right = new int[mid];

        for(int i=0;i<arr.length-mid;i++){
            // System.out.println(".");
            left[i]=arr[i];
        }
        for(int i=mid+1;i<arr.length;i++){
            // System.out.println("..");
            right[i-(mid+1)]=arr[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);
    }
    public static void merge(int[] arr,int[] left,int[] right){
        int i=0,j=0,k=0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){           // compare with left[i] and right[j] not left and right
                arr[k++]=left[i++];           //compare arr and left not itself
            }else{
                arr[k++]=right[j++];           //compare arr and right not itself
            }
        }

        while (i<left.length) {
            arr[k++]=left[i++]; 
        }
        while (j<right.length) {
            arr[k++]=right[j++]; 
        }
    }
    public static void mergeSort2(int arr[]){
        if(arr.length<2){return;}

        int mid=arr.length/2;
        int [] left = new int[mid];
        int [] right = new int[arr.length-mid];

        for(int i=0;i<mid;i++){
            // System.out.println(".");
            left[i]=arr[i];
        }
        for(int i=mid;i<arr.length;i++){
            // System.out.println("..");
            right[i-mid]=arr[i];
        }

        mergeSort2(left);
        mergeSort2(right);
        merge2(arr,left,right);
    }
    public static void merge2(int[] arr,int[] left,int[] right){
        int i=0,j=0,k=0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){           // compare with left[i] and right[j] not left and right
                arr[k++]=left[i++];           //compare arr and left not itself
            }else{
                arr[k++]=right[j++];           //compare arr and right not itself
            }
        }

        while (i<left.length) {
            arr[k++]=left[i++]; 
        }
        while (j<right.length) {
            arr[k++]=right[j++]; 
        }
    }
    public static void mergeSort3(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];

        for(int i=0;i<mid;i++){ left[i]=arr[i]; }
        for(int i=mid;i<arr.length;i++){ right[i-mid]=arr[i];   }   //Mistake: right[i] over right[i-mid]

        mergeSort3(left);
        mergeSort3(right);
        merge3(arr,left,right);     // Mistake: mid over arr ,I written.

        System.out.println(Arrays.toString(arr));
    }
    public static void merge3(int []arr,int[] left,int[] right){    // Mistake: int[] over void
        int i=0,j=0,k=0;

        while(i<left.length && j<right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }

        while(i<left.length){ arr[k++]=left[i++];}
        while(j<right.length){ arr[k++]=right[j++];}    //Mistake: i++ over right[j++]
        System.out.println("Merge: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr = {5,8,9,88,4};
        mergeSort3(arr);
    }
}
