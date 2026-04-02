// Swap Two Numbers

// package HRDRoadmap.BasicProblems;
import java.util.Scanner;
public class SwapTwoNumbers {
    public static void SwapTwoNumbers(int [] arr,int n){
        if(n>=0){
            for(int i=0;i<arr.length;i++){
                if(i == n){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    break;
                }
            }
        }else System.out.println("Invalid data!");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int len = in.nextInt();
        int arr[] = new int[len];

        System.out.println("Enter array elements: ");
        for(int i=0;i<len;i++){
        arr[i] = in.nextInt();
        }

        System.out.println("enter a index to Swap two numbers: ");
        int n=in.nextInt();

        System.out.println("Before array swap: ");
        for(int i=0;i<len;i++){
        System.out.print(arr[i]+" ");
        }System.out.println();

        SwapTwoNumbers(arr,n);

        System.out.println("After array swap: ");
        for(int i=0;i<len;i++){
        System.out.print(arr[i]+" ");
        }

        System.out.println();

    }
}
