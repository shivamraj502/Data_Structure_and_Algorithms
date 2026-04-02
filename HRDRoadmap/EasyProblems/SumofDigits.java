// Sum of Digits

// package HRDRoadmap.EasyProblems;
public class SumofDigits {
    public static void sumOfDigits(int n){
        int rem,sum=0;
        if(n>=0){
            while(n>0){
                rem=n%10;
                sum+=rem;
                n=n/10;
            }System.out.println("sumOfDigits is: "+sum);
        }else System.out.println("Invalid number");;
    }
    public static void main(String[] args) {
        int n=123456;
        sumOfDigits(n);
    }
}
