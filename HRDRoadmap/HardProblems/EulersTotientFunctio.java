public class EulersTotientFunctio {
    public static void gcd(int n,int m){
        int min,max,count=0,gcd=0;
        if(n>m){max=n;min=m;}
        else {max=m;min=n;}

        for(int i=1;i<min;i++){
            if(max%i==0){gcd=i;count++;}
        }System.out.println("gcd: "+ gcd);
    }
    public static void euler(int n){
        
        
        System.out.println();
    }
    public static void main(String[] args) {
        int n=15;
        euler(n);

        // int m=10;
        // gcd(n, m);
    }
}

/**
Euler's Totient Function
Examples:
Input: n = 11
Output: 10
Explanation: From 1 to 11, 1,2,3,4,5,6,7,8,9,10 are relatively prime to 11.

Input: n = 16
Output:  8
Explanation: From 1 to 16, 1,3,5,7,9,11,13,15  are relatively prime to 16.
 */