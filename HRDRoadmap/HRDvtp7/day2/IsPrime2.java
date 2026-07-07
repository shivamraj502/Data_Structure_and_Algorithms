public class IsPrime2 {

    public static void isPrimeRange2(int st,int end){       //sieve of erathosnese
        int [] prime = new int[end+1]; // why n+1 :> to ignore prime[0]

        for(int i= 2;i<=end;i++){
            prime[i]=1;
        }

        for(int i=2;i*i<=end;i++){       // here dont start from start because it will not remove multiple of 2 to start
            if(prime[i]==1){            //and, never end with i*i <= end because it is not having any multiple so no effect
                for(int j=i*i;j<=end;j+=i){
                    prime[j]=0;
                }
            }
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
        int st = 5; int end = 25;
        isPrimeRange2(st,end);
    }
}


// find all primes from 1 to m :> sieve of erathosnese
// why O(n) = n(log(log(n))) :> for summation of n/2 + n/3 + n/4 + ... = n(1/2 + 1/3 + 1/5 + ...)
// n/2 mean
// Mistakes
/*
here :
for(int i= 2;i<=end;i++){
            prime[i]=1;
        }
                :> i was started from st which was ignoring multiple of 2 to start for elimition

here :
for(int i=st;i<=end;i++){
            if(prime[i]==1) System.out.println(i);
        }
                :> i am printing from index st to end ,and ignoring from 2 to start

here :
// print
        // for(int i= 0;i<=end;i++){
        //     System.out.print(prime[i]+" "+i+" ");
        // }System.out.println();
                :> it is to check steps are working or not
 */