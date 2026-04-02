/**
Program to calculate value of nCr */

public class Combination {
    public static int calcComb(int n,int r){
        int result=0;
        int temp=1;
        int temp2=1;

        if(r>n || n<0 || r<0){return result;}
        
        for(int i=n;i>n-r;i--){
            temp=temp*i;
            // System.out.println(temp);
        }
        
        if(r==0){temp2 = 1;}
        for(int i=1;i<=r;i++){
            temp2=temp2*i;
            // System.out.println(temp2);
        }
        result = temp/temp2;

        return result;
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        System.out.println(calcComb(n,r));
    }
}

/**
Input: n = 5, r = 2
Output: 10 
Explanation: The value of  5C2 is calculated as 5! / ((5−2)! * 2!​)= 10.

Input: n = 2, r = 4
Output: 0
Explanation: Since r is greater than n, thus 2C4 = 0

Input: n = 5, r = 0
Output: 1
Explanation:  The value of  5C0 is calculated as 5!/(5−0)!*0! = 5!/5!*0! = 1.
 */