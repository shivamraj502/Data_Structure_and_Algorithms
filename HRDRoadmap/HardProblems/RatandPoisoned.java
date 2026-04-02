//  Rat and Poisoned https://www.geeksforgeeks.org/dsa/rat-and-poisoned-bottle-problem/

public class RatandPoisoned {
    public static int calc(int n){
        int result=1;
        int i;
        for(i=0;i<n;i++){
            if(result>=n){return i;}
            result *= 2;
        }
        return i;
    }
    public static void main(String[] args) {
        int n=1000;
        System.out.println(calc(n));
    }
    
}

/**
Input: N = 4
Output: 2
Explanation: The minimum number of rats needed to find the poisoned bottle among 4 bottles is 2, using binary representation.

Input: N = 100
Output: 7
Explanation: Since 2⁷ = 128 can cover up to 100 bottles, a minimum of 7 rats is required for identification.

Input: N = 1000
Output: 10
Explanation: The minimum number of rats required is 10, as 210 = 1024 can uniquely identify one poisoned bottle among 1000.

Approach: 
 */