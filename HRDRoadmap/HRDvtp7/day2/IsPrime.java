public class IsPrime {
    
    public static void isPrimeRange2(int st,int end){
        int [] prime = new int[end+1]; // why n+1

        for(int i= 2;i<=end;i++){ 
            prime[i]=1;
        }
        
        // print 
        // for(int i= 0;i<=end;i++){ 
        //     System.out.print(prime[i]+" "+i+" ");
        // }System.out.println();

        for(int i=2;i*i<end;i++){
            if(prime[i]==1){
            for(int j=i*i;j<=end;j+=i){
                prime[j]=0;
            }}
        }System.out.println();

        for(int i=st;i<=end;i++){
            if(prime[i]==1) System.out.println(i);
        }
    }
    public static void isPrimeRange(int st, int ed){

        for(int i= st;i<=ed;i++){ 
        if(ed<=1) return;
        if(i==1) continue;

        int divs = 0;
        for(int j=2;j*j<=i;j++){
            if(i % j == 0){divs++;}
        }

        if(divs==0) System.out.print(i +" ");;
        }
    }

    
    public static void main(String[] args) {
        int st = 5; int end = 23;
        isPrimeRange2(st,end);
    }
}


// find all primes from 1 to m :> sieve of erathosnese