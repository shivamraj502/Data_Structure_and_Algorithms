
// Day 13 — Enhanced for-loop & Array Utilities
// Concept: Enhanced for, Arrays.sort(), Arrays.equals().
// Problem: Check Two Arrays Equal – GFG
// Goal: Use built-in utilities.
import java.util.Scanner;

public class CheckTwoArraysEqual {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter array1 size(n):");
        int n = in.nextInt();
        System.out.println("enter array2 size(n):");
        int l = in.nextInt();

        System.out.println("enter array1 elements:");
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }

        System.out.println("enter array2 elements:");
        int[] arr2 = new int[l];
        for (int i = 0; i < l; i++) {
            arr2[i] = in.nextInt();
        }

        boolean bool = true;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < n; i++) {
                if (arr1[i] != arr2[i]) {
                    bool = false;
                }
            }
            if (bool) {
                System.out.println("eql or not: eql");
            } else {
                System.out.println("eql or not: not eql");
            }
        } else {
            System.out.println("eql or not: not eql");
        }
    }
}
