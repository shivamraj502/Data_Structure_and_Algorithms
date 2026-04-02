/**
K-th digit in 'a' raised to power 'b'
*/
public class KthNumber {
    public static int findKth(int a, int b, int k){
        int temp=1;
        int digit=0;

        for(int i=0;i<b;i++){
            temp *= a;
        }

        int newNum=temp;
        for(int i=0;i<k-1;i++){
            newNum = newNum/10;
            // System.out.println(newNum);
            // System.out.println(".");
        }

        for(int i=0;i<k;i++){
            digit = newNum%10;
            // System.out.println(newNum);
            // System.out.println("..");
        }



        return digit;
    }
    public static void main(String[] args) {
        int a=15;
        int b=2;
        int k=1;
        System.out.println(findKth(a,b,k));
    }
}

/**
Given three numbers a, b and k, find k-th digit in ab from right side

Examples: 
Input : a = 3, b = 3, k = 1
Output : 7
Explanation: 3^3 = 27 for k = 1. First digit is 7 in 27

Input : a = 5, b = 2,  k = 2
Output : 2
Explanation: 5^2 = 25 for k = 2. First digit is 2 in 25
 */
 