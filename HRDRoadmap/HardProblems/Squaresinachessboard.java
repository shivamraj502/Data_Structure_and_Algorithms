public class Squaresinachessboard {
    public static int calc(int n){
        return (n*(n+1)*(2*n+1))/6;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println("total sq: "+calc(n));
    }
    
}
