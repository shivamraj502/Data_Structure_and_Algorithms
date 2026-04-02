//2 Super Prime https://www.geeksforgeeks.org/dsa/super-prime/

public class SuperPrime {
    public static void superPrimeFactors(int n){
        int count=0;
        int j=1,k=0,l=0;
        int arr[]= new int[n];

        if(n<2){System.out.println("invalid number");return;}

        for(int i=2;i<=n;i++){
            for( j=1;j<=i;j++){
                if(i%j==0){
                    count++;                // System.out.println("count:"+count);
                }
            }
                                            // System.out.println("j"+j);
            if(count == 2){k++;arr[k]=i;
                                            // System.out.println("k "+k+",i "+i);
            }count=0;
        }

        int []arr2 = new int[k+1];
        for(int i=1;i<=k;i++){
            int temp=arr[i];
            if(temp>k){break;}
                                    // System.out.println("temp:"+temp);
            arr2[i]=arr[temp];
                                    // System.out.println("arr2:"+arr2[i]);
            l++;
        }

        System.out.println("Prime are:");
        for(int i=1;i<=k;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

        System.out.println("Super Prime are:");
        for(int i=1;i<=l;i++){
            System.out.print(arr2[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int n=17;
        superPrimeFactors(n);
    }
}

/**
Input: n = 7
Output: 3 5 
Explanation: In list of primes (2, 3, 5, 7}, 3 and 5 are super primes because they appear at 2nd and 3rd positions which are also a prime . 

Input: n = 17
Output: 3 5 11 17
Explanation: In list of primes (2, 3, 5, 7, 11, 13, 17), 3, 5, 11 and 17 are super primes because they appear at 2nd, 3rd, 5th and 7th positions which are also a prime . 
 */