//  Perfect Number 
//  https://www.geeksforgeeks.org/dsa/perfect-number/

// package HRDRoadmap.EasyProblems;
public class PerfectNumber {
    public static boolean perfect(int a){
        boolean bool=false;
        int sum=0;

        for(int i=1;i<=a/2;i++){
            if(a%i==0){sum +=i;}
        }
        if(sum==a){bool=true;}
        return bool;
    }
    public static void main(String[] args) {
        System.out.println("Perfect Number: "+perfect(15));
    }
}

/**
Input: n = 15
Output: false
Explanation: Divisors of 15 are 1, 3 and 5. Sum of divisors is 9 which is not equal to 15.

Input: n = 6
Output: true
Explanation: Divisors of 6 are 1, 2 and 3. Sum of divisors is 6.
 */