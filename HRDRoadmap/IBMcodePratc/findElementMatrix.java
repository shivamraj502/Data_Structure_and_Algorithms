
    import java.util.*;
    public class findElementMatrix {
        public static int finalValue(int n, List<String> moves){
        // Build n x n matrix, filled 1 to n*n in row-major order
        int[][] matrix = new int[n][n];
        int val = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = val++;
            }
        }

        int row = 0, col = 0; // start at top-left

        for(String move : moves){
            int newRow = row, newCol = col;

            switch(move.toLowerCase()){
                case "up":    newRow = row - 1; break;
                case "down":  newRow = row + 1; break;
                case "left":  newCol = col - 1; break;
                case "right": newCol = col + 1; break;
            }

            // only move if the new position is within bounds; otherwise ignore this move
            if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < n){
                row = newRow;
                col = newCol;
            }
        }

        return matrix[row][col];
    }

    public static void main(String[] args) {
        List<String> moves1 = Arrays.asList("right","up", "down","left", "down", "down");
        System.out.println(finalValue(4, moves1)); // 8
    }
}