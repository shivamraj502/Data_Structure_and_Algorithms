// Reverse Digits Ex: 123456

// package HRDRoadmap.EasyProblems;
public class ReverseDigits {
    public static void reverseDigits(int n){
        int count =0,temp=n,rem,revNum=0;

        while(temp>0){temp=temp/10;count++;}

        int []arr = new int[count];
        for(int i=0;i<count;i++){
            rem=n%10;arr[i]=rem;n=n/10;
            revNum = revNum*10+arr[i];
        }
        
        System.out.println("Reverse num: "+revNum);
    }
    public static void main(String[] args) {
        int n= 120456;
        System.out.println("Original num: "+ n);
        reverseDigits(n);
    }
}
