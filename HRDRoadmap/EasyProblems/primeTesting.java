// prime Testing Output: true / false

// package HRDRoadmap.EasyProblems;
public class primeTesting {
    public static boolean isPrime(int n){
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i == 0){return false;}
        }return true;
    }
    public static void main(String[] args) {
        int n=10;
        boolean isPrime= isPrime(n);
        System.out.println("isPrime? "+ isPrime);
    }
}
