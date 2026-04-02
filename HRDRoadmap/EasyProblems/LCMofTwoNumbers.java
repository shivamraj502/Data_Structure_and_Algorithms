//  LCM of Two Numbers
//  https://www.geeksforgeeks.org/dsa/program-to-find-lcm-of-two-numbers/

// package HRDRoadmap.EasyProblems;
public class LCMofTwoNumbers {
    public static int lcm(int a,int b){
        int hcf=0,lcm;
        int min,max;

        if(a>b){max = a;min=b;}
        else{max = b;min = a;}

        for(int i=1;i<=min;i++){  // cant start with i=0
            if(max % i == 0){
                hcf=i;
            }
        }lcm=(a*b)/hcf;

        return lcm;
    }
    public static void main(String[] args) {
        System.out.println("Lcm: "+lcm(5,11));
    }
}

/**
Input :  a = 10, b = 5
Output :  10
Explanation : 10 is the smallest number divisible by both 10 and 5

Input :  a = 5, b = 11
Output :  55
Explanation : 55 is the smallest number divisible by both 5 and 11
 */