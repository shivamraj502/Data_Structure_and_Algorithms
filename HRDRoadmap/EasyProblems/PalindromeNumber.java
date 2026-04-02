/**
Palindrome Number 
https://www.geeksforgeeks.org/dsa/check-if-a-number-is-palindrome/
 */

// package HRDRoadmap.EasyProblems;
public class PalindromeNumber {
    public static boolean isPalindrome(int n){
        boolean bool=true;
        int k=n,m=n;
        int count=0,i=0;

        while(k>0){
            count++;
            k/=10;                        // System.out.println("count: "+count);
        }

        int arr[] = new int[count];
        while(m>0){
            int rem=0;
            rem =m % 10;
            arr[count-i-1]=rem;
            m/=10;              // System.out.println("i: "+i);
            rem=0;              // System.out.println("m: "+m);
            i++;                // System.out.println("rem: "+rem);
        }

        int left=0,right=count-1;
        while(left<right){
            if(arr[left]!=arr[right]){
                bool=false; 
                return bool;
            }left++;right--;
        }

        return bool;
    }
    public static void main(String[] args) {
        int n=123321;
        System.out.println("isPalindrome? " + isPalindrome(n));
    }
}

