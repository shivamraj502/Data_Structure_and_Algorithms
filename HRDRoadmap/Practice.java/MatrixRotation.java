public class MatrixRotation {
    public static void rotateMatrix(int[][] mat,int degree) {
        if(degree % 90 != 0) return;
        int c = degree / 90;    System.out.println(c);
        for(int i=0;i<c;i++){
            rotateHelper(mat);
        }

        for(int i=0;i<mat.length;i++){   //Output
            for(int j=0;j<mat.length;j++){
                System.out.print(mat[i][j]+" ");
            }System.out.println();
        }
    }

    public static void rotateHelper(int[][] mat) {
        int n = mat.length;
        
        for(int i=0;i<n;i++){   //Transpose
            for(int j=i;j<n;j++){
                int temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        
        for(int i=0;i<n;i++){   //reverse
            for(int j=0;j<n/2;j++){
                int temp = mat[i][j];
                mat[i][j]=mat[i][n-j-1];
                mat[i][n-j-1]=temp;
            }
        }
        
        // for(int i=0;i<n;i++){   //tracking
        //     for(int j=0;j<n;j++){
        //         System.out.print(mat[i][j]+" ");
        //     }System.out.println();
        // }
    }
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int degree=3600;
        
        rotateMatrix(arr,degree);
    }
}