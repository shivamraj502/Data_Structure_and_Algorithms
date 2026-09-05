/**
Day 87 – Practice Problems
Problems:
Happy Number – LeetCode202
Longest Consecutive Sequence – LeetCode 128
Goal: Apply hashing creatively. */

import java.util.*;
public class LeetCode202 {
    public static boolean isHappy(int n){
        int sum = 0; int l=0; int m=n; int x=n;
        while(m>0){
            l += 1;
            m /= 10;
        }

        for(int i=0;i<l;i++){
            int p =1;int rem = x/10;
            for(int j=0;j<l;j++){
                p *= rem;
            }sum += p;
        }

        if(sum == 1 && (l==1 && n==1) || l>1) return true;
        if(sum != 1 && l==1 && n!=1) return false;
        if(l==1 && n==1) return true;

        isHappy(sum);
        return false;
    }
    public static boolean isHappy2(int n){
        HashSet<Integer> set = new HashSet<>();
        // int sum = 0; int l=0; int m=n; int x=n;

        while(true){
        int sum = 0; int l=0; int m=n; int x=n;
        while(m != 0){
            l += 1;
            m /= 10;
        }

        for(int i=0;i<l;i++){
            int rem = x%10; x /= 10;
            sum += rem * rem;
        }//System.out.println(sum);

        if(sum == 1){ return true; }

        if(set.contains(sum)){ return false;}
        else{ set.add(sum);}
        n = sum;
        }
    }
    public static void main(String[] args) {
         int n = 19;  // true
        // int n = 2;   // false
        // int n = 1;   // true
        // int n = 7;  // false
        System.out.println(isHappy2(n));
        // System.out.println(isHappy(n));
    }
}

/**
Example 1:
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

Example 2:
Input: n = 2
Output: false
 */