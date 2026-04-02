/**Program to calculate the value of nPr */
public class Permutation {
    public static int perm(int n, int r){
        if(n<=0){return 1;}
        int result=1;
        for(int i=n;i>n-r;i--){
            result *=i;
        }

        return result;
    }
    public static void main(String[] args) {
        int n=6;
        int r=3;
        int result=perm(n,r);
        System.out.println("Output:"+result);
    }
}


// Given two numbers, n and r, the task is to compute nPr, which represents the number of ways to arrange r elements from a set of n elements. It is calculated using the formula n!/(n−r)!, where "!" denotes the factorial operation.
// Permutation - Formula, Definition ...
// Examples:
// Input: n = 5
//        r = 2
// Output: 20
// Explanation: 5P2 = 5! / (5 - 2)!  = 20
// Input: n = 6
//        r = 3
// Output: 120
// Explanation: 6P3 = 6! / (6 - 3)!  = 12