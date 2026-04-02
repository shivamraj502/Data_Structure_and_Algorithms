/**12 Largest Prime factor https://www.geeksforgeeks.org/dsa/find-largest-prime-factor-number/ */

public class LargestPrimefactor {
    public static void largestPrimefactor(int n){
        int count=0;
        int j=1,k=-1,l=-1;
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
        
        
        int arr2[]= new int[k+1];
        for(int i=0;i<=k;i++){
            if(n%arr[i]==0){l++;arr2[l]=arr[i];}
        }
        
        System.out.println("largest:"+arr2[l]);
    }
    public static void main(String[] args) {
        int n=28;
        largestPrimefactor(n);
    }
}

/**
Find largest prime factor of a number
Last Updated : 17 Feb, 2025
Given a positive integer n ( 1 <= n <= 1015). Find the largest prime factor of a number. 

Input: 6
Output: 3
Explanation Prime factor are 2 and 3. Largest of them is 3.

Input: 15
Output: 5
Explanation: Prime factors are 3 and 5. The largest of them is 5.

Input: 28
Output: 7
Explanation: Prime factors are 2 and 7. The largest of them is 7.
 */