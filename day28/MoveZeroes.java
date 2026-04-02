/**
 * Day 28 — Practice Day (Mix of Arrays & Strings)
Solve 3 easy problems:
MoveZeroes – LeetCode 283
Remove Element – LeetCode 27
Valid Anagram – LeetCode 242
 */

/**
MoveZeroes – LeetCode 283: 
You have numbers like:[0, 1, 0, 3, 12]
You must move all 0 to the end.
But:👉 keep the order of other numbers same.
Result:[1, 3, 12, 0, 0]
 */

public class MoveZeroes {
    public static void main(String[] args) {
        int [] arr = {0, 0, 0, 0, 12};
        int n = arr.length;

        movezeroesToEnd(arr,n);
    }

    static void movezeroesToEnd(int[] arr, int n){
        int count =0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==0)                       // {0, 1, 0, 3, 12}   //arr1  1 0 0 5 8
            {                                   //  0  1  2  3   4    //arr2  1 0 5 8 8
                for(int j=i;j<n-1;j++){         //  j=0 j+1=1         //i     0 1 2 3 4
                    arr[j]=arr[j+1];
                }
                count++;
                i--;
            }
        }

        for(int j=n-count;j<n;j++){
            arr[j]=0;
        }
        
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }System.out.println();
    }
}