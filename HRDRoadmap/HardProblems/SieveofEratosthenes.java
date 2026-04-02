// 1. Sieve of Eratosthenes https://www.geeksforgeeks.org/dsa/sieve-of-eratosthenes/

public class SieveofEratosthenes {
        public static void allPrimeFactors(int n){
        int count=0;
        int j=1,k=-1;
        int arr[]= new int[n];

        if(n<2){System.out.println("invalid number");return;}

        for(int i=2;i<=n;i++){
            for( j=1;j<=i;j++){
                if(i%j==0){
                    count++;                    // System.out.println("count:"+count);
                }
            }
                                            // System.out.println("j"+j);
            if(count == 2){k++;arr[k]=i;
                                            // System.out.println("k "+k+",i "+i);
            }count=0;
        }

        System.out.println("Prime no are:");
        for(int i=0;i<=k;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int n=35;
        allPrimeFactors(n);
    }
}

/**
Input: n = 10
Output: [2, 3, 5, 7]
Explanation: The prime numbers up to 10 obtained by Sieve of Eratosthenes are [2, 3, 5, 7].

Input: n = 35
Output: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
Explanation: The prime numbers up to 35 obtained by Sieve of Eratosthenes are [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31].
 */