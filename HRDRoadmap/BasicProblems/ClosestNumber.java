// Closest Number 
// Ex: dv = 13 ,ds = 4 output: 12
// Ex: dv = -15, ds = 6 output: -18

public class ClosestNumber {
    public static void closestNumber(int dv, int ds){
        int n =(dv/ds)+1;
        int i=1;
        int res=0;
        int rem;
        int max;

        // while(i<=n){
        //     rem =dv - ds*i;
        //     i++;
        //     System.out.println(rem);
        // }

        if(((dv - ds* (n-1))< (dv - ds*n)) && (dv - ds* (n-1))>0 && (dv - ds*n)>0){
            System.out.println(ds*(n-1));
        }else System.out.println(ds*n);
    } 

    public static void main(String[] args) {
        int divd= -13;
        int divs= 4;
        if(divd<0){divd *= -1;}
        closestNumber(divd,divs);
    }
}
