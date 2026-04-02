// Check Power Input: n=10 m=1000 Output: true

// package HRDRoadmap.EasyProblems;
public class checkPower {
    public static boolean checkPow(int n, int m){
        int p=1;
        for(int i=0;i<n;i++){
            p = p*n;
            System.out.println("p "+p);
            if(p==m){
                return true;
            }

            // double q = Math.pow(n,i);
            // System.out.println("q "+q);
            // if(q==m){
            //     return true;
            // }q=1;
            
        }
        return false;
    }
    public static void main(String[] args) {
        int n=10,m=1000;
        boolean bool = checkPow(n,m);
        System.out.println("check power? "+bool);
    }
}

