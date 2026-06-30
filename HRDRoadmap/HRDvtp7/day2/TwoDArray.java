import java.util.Arrays;
public class TwoDArray {
    public static void main(String[] args) {
        int [][] arr1 ={
            {1,2,3},
            {4,5,6}
        };
        
        int [][] arr2 ={
            {1,2,3},
            {4,5,6}
        };

        if(arr1.length ==arr2.length){
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr1.length;j++){
                    arr1[i][j] = arr1[i][j]+arr2[i][j];
                }
            }
        }else {System.out.println("invalid"); }
        
        for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr1.length;j++){
                    System.out.println(arr1[i][j]);
                }
        }
    }
}

// Matrix multiplication