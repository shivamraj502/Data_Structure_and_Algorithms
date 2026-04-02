/**
 3 Divisors 
 https://www.geeksforgeeks.org/dsa/numbers-exactly-3-divisors/
 */

public class threeDivisors {
    public static int findNum(int n){
        int count=0,count2=0;

        if(n>0){
        for(int i=4;i<=n;i++){      //System.out.println(".");
            for(int j=1;j<=i;j++){    //System.out.println(".");
                if(i%j==0){          System.out.println(i +" " +j);
                    count2++;
                }
            }
            if(count2==3){
                count++;
            }count2=0;
          }
        }
        else {System.out.println("Invalid range!"); return -1; }

        return count;
    }
    public static void main(String[] args) {
        int n =16;
        System.out.println("Count: "+ findNum(n));
    }
}


/**
Input: n = 16
Output: 2
Explanation: Only 4 and 9 have exactly three divisors.

Input: n = 100
Output: 4
Explanation: 4, 9, 25 and 49 have exactly three divisors.
 */