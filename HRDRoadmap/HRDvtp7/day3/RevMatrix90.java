import java.util.Scanner;
public class RevMatrix90 {
    public static int[][] revMatrix(int[][] arr1){
        int [][] res = new int[arr1.length][arr1.length];
        
        for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr1.length;j++){
                        res[i][j] = arr1[j][i];
                }
        }
        
        for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr1.length/2;j++){
                        int temp2 = res[i][j] ;
                        res[i][j] = res[i][arr1[0].length-j-1];
                        res [i][arr1[0].length-j-1] = temp2;
                }
        }

        for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr1.length;j++){
                    System.out.print(res[i][j]+" ") ;
                }System.out.println();
        }return res;
    }
    public static void main(String[] args) {    // can be done it using reversal of each one-D array of Result. for(int[] row: matrix){Array.reverse(row)}
        int [][] arr1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // int [][] res = transpose(arr1);
        Scanner sc = new Scanner(System.in);
        int degree = sc.nextInt();
        int rot = degree % 90;

        if(rot == 0){
            if(rot % 4 != 0){ 
                if(rot % 4 == 1){
                    arr1 = revMatrix(arr1);
                }
                if(rot % 4 == 2){
                    arr1 = revMatrix(arr1);
                    arr1 = revMatrix(arr1);
                }
                if(rot % 4 == 3){
                    arr1 = revMatrix(arr1);
                    arr1 = revMatrix(arr1);
                    arr1 = revMatrix(arr1);
                }
            }else System.out.println("no rotation");
            
        }else System.out.println("invalid degree");
    }
}