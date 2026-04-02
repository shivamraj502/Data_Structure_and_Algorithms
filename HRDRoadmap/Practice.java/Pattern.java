public class Pattern {
    public static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int k=0;k<n-1-i ;k++){
                System.out.print("-");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int k=0;k<n-1-i ;k++){
                System.out.print("-");
            }System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i ;j++){
                System.out.print("-");
            }
            for(int k=0;k<2*(n-i)-1 ;k++){
                System.out.print("*");
            }
            for(int l=0;l<i;l++){
                System.out.print("-");
            }System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i ;j++){
                System.out.print("-");
            }
            for(int k=0;k<2*(n-i)-1 ;k++){
                System.out.print("*");
            }
            for(int l=0;l<i;l++){
                System.out.print("-");
            }System.out.println();
        }
    }
    public static void pattern4(int n){
        
        for(int i=1;i<=n;i++){int k;
            if(i%2==1){k=0;}
            else{k=1;}
            
            for(int j=1;j<=i ;j++){
                k++;
                System.out.print(k%2);
            }System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i ;j++){
                System.out.print(j);
            }
            for(int k=1;k<=n-i ;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=n-i ;l++){
                System.out.print(" ");
            }
            for(int m=i;m>0 ;m--){
                System.out.print(m);
            }System.out.println();
        }
    }
    public static void pattern6(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i ;j++){
                count++;
                System.out.print(count+"  ");
            }System.out.println();
        }
    }
    public static void pattern7(int n){
        for(int i=1;i<=n;i++){
            char k='@';
            for(int j=1;j<=i ;j++){
                k++;
                System.out.print(k);
            }System.out.println();
        }
    }
    public static void pattern8(int n){
        for(int i=1;i<=n;i++){
            char k='@';
            for(int j=1;j<=n-i+1;j++){
                k++;
                System.out.print(k);
            }System.out.println();
        }
    }
    public static void pattern9(int n){
        char k='@';
        for(int i=1;i<=n;i++){
            k++;
            for(int j=1;j<=i;j++){
                System.out.print(k);
            }System.out.println();
        }
    }
    public static void pattern10(int n){
        for(int i=1;i<=n;i++){
            char k='@';
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int l=1;l<=2*i-1;l++){
                if(l<=i){ 
                k++;
                System.out.print(k);
            }
                else{k--;
                System.out.print(k);}
            }System.out.println();
            }
    }
    public static void pattern11(int n,char k){
        // C
        // BC
        // ABC
        for(int i=1;i<=n;i++){
            
            for(int l=1;l<=i;l++){
                System.out.print(k);
                k++;
            }
            for(int l=0;l<=i;l++){      //System.out.print("-");
                k--;
                                        //System.out.print(k);
            }System.out.println();
            }
    }
    public static void pattern12(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){      
                System.out.print("*");                     
            }
            for(int k=1;k<=i-1;k++){      
                System.out.print(" ");                     
            }
            for(int l=1;l<=i-1;l++){      
                System.out.print(" ");                     
            }
            for(int m=1;m<=n+1-i;m++){      
                System.out.print("*");                     
            }System.out.println();
        }
        
        for(int i=1;i<=n;i++){
            for(int l=1;l<=i;l++){      
                System.out.print("*");                     
            }
            for(int l=1;l<=n-i;l++){      
                System.out.print(" ");                     
            }
            for(int l=1;l<=n-i;l++){      
                System.out.print(" ");                     
            }
            for(int l=1;l<=i;l++){      
                System.out.print("*");                     
            }System.out.println();
        }
    }
    public static void pattern13(int n){
        int space=2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int star;
            if(i>n){
                star=2*n-i;
            }else{ star =i;}

            for(int j=1;j<=star;j++){      
                System.out.print("*");                     
            }
            for(int k=1;k<=space;k++){      
                System.out.print("-");                     
            }
            for(int m=1;m<=star;m++){      
                System.out.print("*");                     
            }System.out.println();

            if(i<n){
                space -=2;
                // System.out.println("space"+space);
            }else{space += 2;}
                // System.out.println("space"+space);
        }
    }
    
    public static void main(String[] args) {
        int n=3;
        pattern13(n);
    }
}
