public class TransposeMatrix {
    public static void transpose(int[][] arr1){
        int [][] res = new int[arr1.length][arr1.length];
        
        for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr1.length;j++){
                        res[i][j] = arr1[j][i];
                }
        }
        for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr1.length;j++){
                    System.out.print(res[i][j]+" ") ;
                }System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] arr1 = {
            {1,2,8},
            {3,4,9},
            {18,14,19}
        };
        // int [][] res = transpose(arr1);
        transpose(arr1);
    }
}
