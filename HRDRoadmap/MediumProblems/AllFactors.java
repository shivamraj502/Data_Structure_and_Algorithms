/** Find all factors of a Positive Number */

public class AllFactors {
    public static void allDivisor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+", ");
            }
        }
    }
    public static void main(String[] args) {
        int n=100;
        allDivisor(n);
    }
}

/*
Given a positive integer n, find all the distinct divisors of n.

Examples:
Input: n = 10       
Output: [1, 2, 5, 10]
Explanation: 1, 2, 5 and 10 are the divisors of 10. 

Input: n = 100
Output: [1, 2, 4, 5, 10, 20, 25, 50, 100]
Explanation: 1, 2, 4, 5, 10, 20, 25, 50 and 100 are divisors of 100.
 */