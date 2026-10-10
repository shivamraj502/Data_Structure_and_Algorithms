import java.util.Arrays;

/**
Day 70 – Sudoku Solver
Concept: Recursive filling with constraints.
Problem: Sudoku Solver – LeetCode 37
Goal: Learn constraint satisfaction via backtracking.
 */

public class LeetCode37 {
    public static char[][] solveSudoku(char[][] board) {
        solve(board);
        return board;
    }
    public static boolean solve(char[][] board){
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(board[row][col] == '.'){
                    for(char digit = '1'; digit <= '9'; digit++){
                        if(isValid(board, row, col, digit)){
                            board[row][col] = digit;
                            if(solve(board)) return true;
                            board[row][col] = '.'; // backtrack
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isValid(char[][] board, int row, int col, char digit){
        for(int c = 0; c < 9; c++){
            if(board[row][c] == digit) return false;
        }
        for(int r = 0; r < 9; r++){
            if(board[r][col] == digit) return false;
        }
        int boxRowStart = (row / 3) * 3;
        int boxColStart = (col / 3) * 3;
        for(int r = boxRowStart; r < boxRowStart + 3; r++){
            for(int c = boxColStart; c < boxColStart + 3; c++){
                if(board[r][c] == digit) return false;
            }
        }
        return true;
    }
    // Prints board in LeetCode's array-of-arrays string format
    public static void printBoard(char[][] board){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < board.length; i++){
            sb.append("[");
            for(int j = 0; j < board[i].length; j++){
                sb.append("\"").append(board[i][j]).append("\"");
                if(j != board[i].length - 1) sb.append(",");
            }
            sb.append("]");
            if(i != board.length - 1) sb.append(",");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    public static void solve2(char[][] board){
        helper2(board);
    }
    public static boolean helper2(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

            if(board[i][j]=='.') {
                for(char k='1';k<='9';k++){
                   if(isValid2(board, i, j, k)){
                    board[i][j]=k;
                    if(helper2(board)) return true;
                    board[i][j]='.';
                    }
                }return false;
            }
            }
        }return true;
    }
    public static boolean isValid2(char[][] board,int r, int c, char n){
        // row
        for(int i=0;i<board[0].length;i++){
            if(board[r][i]==n) return false;
        }

        //column
        for(int i=0;i<board[0].length;i++){
            if(board[i][c]==n) return false;
        }

        //3x3 box 
        for(int i=r/3*3;i<(r/3)*3+3;i++){
            for(int j=c/3*3;j<(c/3)*3+3;j++){
            if(board[i][j]==n) return false;
            }
        }

        return true;
    }
    public static void print2(char[][] board){
        for(char [] c : board){
            System.out.print(Arrays.toString(c));   System.out.println();
            // System.out.print(c); // System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        // System.out.print("Input: board = ");
        // printBoard(board);

        // char [][] result =solveSudoku(board);
        // for(char [] c : result){
        //     System.out.println(c);
        // }System.out.println();

        solveSudoku(board);
        System.out.print("Output: ");
        printBoard(board);

        // solve2(board);
        // // print2(board);
        // char [][] result2 =solve2(board);
        // for(char [] c : result2){
        //     System.out.println(c);
        // }System.out.println();
        // 
        solve2(board);
        print2(board);
        // char [][] result2 =solve2(board);
        // for(char [] c : result2){
        //     System.out.println(c);
        // }System.out.println();
    }
}