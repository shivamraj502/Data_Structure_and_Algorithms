/**
Square Root 
https://www.geeksforgeeks.org/dsa/square-root-of-an-integer/
 */

public class SquareRoot {
    public static int sqrt(int n){
        int sq=-1;
        int product=1;
        int k=0;

        if(n==0||n==1){return n;}

        for(int i=0;i<n;i++){
            // System.out.println(".");
            // for(int j=0;j<2;j++){           
            //     product *= k;
            // }
            if(k*k == n){           // System.out.println(".");
                return k;
            }
            if(k*k >n){         // System.out.println(".");
                return k-1;
            }
            k++;
            product=1;
        }
        return sq;
    }

    public static void main(String[] args) {
        int n=8;
        System.out.println("Square root: " + sqrt(n));
    }
}

/**
Input: n = 4
Output: 2
Explanation: The square root of 4 is 2.

Input: n = 11
Output: 3
Explanation: The square root of 11 lies in between 3 and 4 so floor of the square root is 3.
 */

/*                    mistakes for finding square root of 11
// int sq=-1;
        // int sq2=-1;
        // int k=1;
        // int product=1;
        // for(int i=1;i<=n/2;i++){
        //     int m = 0;
        //     m=n/i;
        //     System.out.println("m: "+m);
        //     if(i==m){return m;}
        // }

        // while(sq2<n){
        //     for(int j=0;j<2;j++){
        //         product *=k;
        //     }
        //     k++;
        // }
 */

/*
    static int squareRootInteger(int n) {

        int ans = 1;

        for(int i=0; i<=n; i++) {
            if((ans * ans) == n) {
                return ans;
            } else if((ans * ans) > n) {        // 3 = 9 < 11 && 4 = 16 > 11
                return ans - 1;                 // so ans = 4 , 4 - 1 = 3, floor is 3
            }
            ans++;
        }


        return ans;
    } */