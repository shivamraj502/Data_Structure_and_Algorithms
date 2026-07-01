//  "2d array addition"
public class TwoDArray {
    public static void main(String[] args) {
        int [][] arr1 ={
            {1,2},
            {4,5},
            {6,7}
        };
        
        int [][] arr2 ={
            {1,2,3},
            {4,5,6}
        };

        int r1 = arr1.length;
        int r2 = arr2.length;
        int c1 = arr1[0].length;
        int c2 = arr2[0].length;
        int [][] res = new int[r1][c2];

        if(c1 == r2){
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        res[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(res[i][j] + " ");
                }System.out.println();
        }}else{
            return;
        }
    }
}

// Matrix multiplication revision needed ,it is a good question