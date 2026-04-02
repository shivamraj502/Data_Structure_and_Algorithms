// Decimal to Binary 
// https://www.geeksforgeeks.org/dsa/program-decimal-binary-conversion/ 

// package HRDRoadmap.EasyProblems;
public class DecimaltoBinary {
    public static int [] decToBinary(int a){
        int []arr = new int[10];
        int i=0,count=0;
        while(a>0){ 
        if(a%2==0){
            arr[i]=0;         // System.out.println(arr[i]);
            i++;              // System.out.println(".");
            a=a/2;
            count++;          // System.out.println(count+"c");
        }else{
            arr[i]=1;       // System.out.println(arr[i]);
            i++;              // System.out.println("_");
            a=a/2;
            count++;          // System.out.println(count+"c");
        }
    }

    int arr2[] = new int[count];
        for(int j=0;j<count;j++){
            arr2[j]=arr[count-j-1];
        }

    return arr2;
    }
    public static void main(String[] args) {
        int[] res = decToBinary(12);
        System.out.println("Decimal to binary: ");

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }System.out.println();
    }
}

/**
Input: n = 12
Output: "1100"
Explanation: the binary representation of 12 is "1100", since 12 = 1×23 + 1×22 + 0×21+ 0×20 = 12

Input: n = 33
Output: "100001"
Explanation: the binary representation of 33 is "100001", since  1×25 + 0×24 + 0×23 + 0×22 + 0×21 + 1×20  = 33
 */