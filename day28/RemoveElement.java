/**
 * Day 28 — Practice Day (Mix of Arrays & Strings)
Solve 3 easy problems:
Move Zeroes – LeetCode 283
Remove Element – LeetCode 27
Valid Anagram – LeetCode 242
 */

/**
LeetCode 27: You have an array:[3, 2, 2, 3]
And a number to remove: val = 3
You must remove all 3 from the array.
Final important part:
 return how many elements are left
 order of remaining numbers should stay same
Output: 2 (because 2, 2 are left)
 */


import java.util.Scanner;
public class RemoveElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Original array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nEnter target: ");
        int target = in.nextInt();

        removeElement(arr,target,n);
    }

    static void removeElement(int[] arr,int target, int n){
        
        System.out.println("Array after removal: ");
        for(int i=0;i<n;i++){
            if(arr[i]!=target)
            {
                 System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
