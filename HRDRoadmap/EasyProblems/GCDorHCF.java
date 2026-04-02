//  GCD or HCF

// package HRDRoadmap.EasyProblems;
public class  GCDorHCF {
    public static int gcd(int n,int m){
        int res = 0;
        int lower,greater;

        if(m<n){lower =m;greater =n;}
        else {lower =n; greater=m;}
        System.out.println(lower +" "+greater);

        for(int i=1;i<=lower;i++){
            if(greater % i==0){ res = i;}
        }

        return res;
    }
    public static void main(String[] args) {
        int res =gcd(55,10);
        System.out.println("Res: "+res);
    }
    
}

