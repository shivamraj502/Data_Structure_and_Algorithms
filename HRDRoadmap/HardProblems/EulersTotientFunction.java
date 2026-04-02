/**  Euler's Totient Function https://www.geeksforgeeks.org/dsa/eulers-totient-function/ */

public class  EulersTotientFunction {
    public static void calc(int n){
        int count=0;
        for(int i=1;i<n;i++){
            if(n%i!=0){count++;System.out.println("i"+i);}
        }System.out.println("count: "+count);
    }
    public static void main(String[] args) {
        int n=16;
        calc(n);
    }
}

/**
nput: n = 11
Output: 10
Explanation: From 1 to 11, 1,2,3,4,5,6,7,8,9,10 are relatively prime to 11.

Input: n = 16
Output:  8
Explanation: From 1 to 16, 1,3,5,7,9,11,13,15  are relatively prime to 16.
 */