/**Prime Factorization https://www.geeksforgeeks.org/dsa/prime-factor/ */

public class PrimeFactors{
    public static void allPrimeFactors(int n){
        int count=0;
        int j=1,k=-1;
        int arr[]= new int[n];

        if(n<2){System.out.println("invalid number");return;}

        for(int i=2;i<=n;i++){
            for( j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                                            // System.out.println("count:"+count);
                }
            }
                                            // System.out.println("j"+j);
            if(count == 2){k++;arr[k]=i;
                                            // System.out.println("k "+k+",i "+i);
            }count=0;
        }

        // for(int i=0;i<n;i++){
        //     System.out.println("arr:"+arr[i]);
        // }
        
        System.out.println("factors are: ");
        for(int i=0;i<=k;i++){
            if(n%arr[i]==0){System.out.print(arr[i]+" ");}
        }
    }
    public static void main(String[] args) {
        int n=60;
        allPrimeFactors(n);
    }
}

/**
Last Updated : 14 Jul, 2025
Given an integer n, find all unique prime factors of n. A prime factor is a prime number that divides n exactly (without leaving a remainder).

Examples:

Input: n = 100
Output: [2, 5]
Explanation: Unique prime factors of 100 are 2 and 5.
Input: n = 60
Output: [2, 3, 5]
Explanation: Prime factors of 60 are 2, 2, 3, 5. Unique prime factors are 2, 3 and 5. */