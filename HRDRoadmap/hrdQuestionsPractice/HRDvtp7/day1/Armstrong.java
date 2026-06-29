public class Armstrong {
    public static int isArm(int n,int z){
        int total = 0;

        for(int k=n;k<=z;k++){
        int count =(""+n).length();
        
        // int m = n;
        // while(m>0){
        //      m = m /10;
        //      count++;
        // }

        //int length = (""+n).length();
        //int length = (int)(Math.log10(n)+1);
        // int length = Integer.toString(n).length();
        // System.out.println("length: "+length);

        int p = k;
        int sum = 0;
        while(p>0){
            int rem = p%10;
            p = p/10;
            int product = 1;
            
            for(int j=0;j<count;j++){
                product *= rem;
            }sum += product;

        }if(sum == k){ System.out.println(sum); total++;}
        
        // return sum == n; //for is armstrong
        }return total;      //for range armstrong
    }

    public static void main(String[] args) {
        int a =153; //370,371,153
        int b =372;
        System.out.println(isArm(a,b)+"\n");
    }
}
