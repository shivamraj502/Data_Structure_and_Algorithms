//  Factorial of a Number

// package HRDRoadmap.EasyProblems;
public class  factorialofaNumber {
    public static int factorial(int n){
        if(n==0 || n==1){return 1;}
        if(n>1){return n*factorial(n-1);}
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("fact: "+ factorial(-6));
    }
}