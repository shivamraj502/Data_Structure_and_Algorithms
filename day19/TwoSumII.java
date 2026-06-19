// Day 19 — Two-Pointer Technique
// Concept: Start/end pointer method for arrays.
// Problem: TwoSumII – LeetCode 167
// Goal: Learn efficient traversal.

// You are given:
// 👉 a sorted list of numbers (in increasing order)
// 👉 a target number
// Your task is:
// 👉 find two numbers in the list that add up exactly to the target
// 📌 What you must return
// You don’t return the numbers themselves.
// You return:
// 👉 the positions (indexes) of those two numbers
// And:
// 👉 each input has exactly one correct answer

import java.util.Scanner;
public class TwoSumII {
    public static int [] twoS(int [] arr, int t){
        int left = 0;
        int right = arr.length-1;
        int sum;
        int [] f = new int[2];

        for(int i=0;i<arr.length;i++){
            sum = arr[left] + arr[right];
            if(sum == t){ 
                f[0] = left;
                f[1] = right;
            }
            else if(sum > t) right--;
            else left++;
        }return f;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,44,55};
        int [] res = twoS(arr, 45);
        for(int i=0;i<2;i++){
            System.out.print(res[i] + " ");
        }
    }



    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter array size(n):");
        int n = in.nextInt();

        System.out.println("enter array elements(asc):");
        int [] arr = new int[n];
        for(int i= 0;i<n;i++){
            arr[i] = in.nextInt();
        }

        System.out.println("enter target to search: ");
        int target = in.nextInt();

        int left = 0;
        int right = n-1;
        while (true) {
            if(arr[left]+arr[right] == target){
                System.out.println(left + " " + right);
                return;
            }else if(target > (arr[left]+arr[right] )){left++;}
            else if(target < (arr[left]+arr[right] )){right--;}
            else{ break;}
        }

        System.out.println("not found");
    }   
}
