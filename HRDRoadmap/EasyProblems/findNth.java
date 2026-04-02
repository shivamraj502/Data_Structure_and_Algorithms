/**
 N-th term of 1, 3, 6, 10, 15, 21…
                2  3  4   5   6
              a=1, d=n+1
 https://www.geeksforgeeks.org/dsa/find-nth-term-series-136101521/
 */

class findNth{
    public static int find(int n){
        int a=1,d=2;
        if(n<1)return -1;
        if(n==1)return 1;

        if(n>1){ 
        for(int i=0;i<n-1;i++){
            a+=d;
            d++;
        }}
    return a;
    }
    public static void main(String[] args) {
        int n=1;
        int result = find(n);
        System.out.println("Nth term is: "+ result);
    }
}