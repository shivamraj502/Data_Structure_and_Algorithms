public class IsPrime {
    public static boolean isPrime(int n){
        if(n<=1) return false;

        // int divs = 0;
        // for(int i=1;i<=n;i++){
        //     if(n % i == 0){divs++;}
        // }

        // int divs = 0;
        // for(int i=2;i<=Math.sqrt(n);i++){
        //     if(n % i == 0){divs++;}
        // }

        int divs = 0;
        for(int i=2;i*i<=n;i++){
            if(n % i == 0){divs++;}
        }

        return divs==0;
    }
    public static void isPrimeRange(int st, int ed){

        for(int i= st+1;i<=ed;i++){ 
        if(i<1) return;

        int divs = 0;
        for(int j=2;j*j<=i;j++){
            if(i % j == 0){divs++;}
        }

        if(divs==0) System.out.println(i);;
        }
    }
    public static void isPrimeRange2(int n){
        int [] prime = new int[n+1]; // why n+1

        for(int i= 2;i<n;i++){ 
            prime[i]=1;
        }

        for(int i=2;i*i<=n;i++){
            if(prime[i]==1){ 
            for(int j=i*i;j<=n;j+=i){
                prime[j]=0;
            }}
        }

        for(int i=2;i<n;i++){
            if(prime[i]==1) System.out.println(i);
        }
    }

    
    public static void main(String[] args) {
        // int n = 15661;
        // System.out.println(isPrime(n));

        int st = 1; int end = 11;
        isPrimeRange2(end);
    }
}


// find all primes from 1 to m :> sieve of erathosnese