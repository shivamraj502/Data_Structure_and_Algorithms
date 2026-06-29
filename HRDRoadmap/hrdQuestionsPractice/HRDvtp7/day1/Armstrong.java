public class Armstrong {
    public static boolean isArm(int n){
        int m = n;
        int count =0;
        while(m>0){
             m = m /10;
             count++;
        }

        int p = n;
        int sum = 0;
        while(p>0){
            int rem = p%10;
            p = p/10;
            int product = 1;
            
            for(int j=0;j<count;j++){
                product *= rem;
            }sum += product;
        }
        
        return sum==n;
    }

    public static void main(String[] args) {
        int a =154;
        System.out.println(isArm(a));
    }
}
