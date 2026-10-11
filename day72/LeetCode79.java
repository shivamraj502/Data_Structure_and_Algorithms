// Day 72 – Word Search
// Concept: Grid traversal recursion with visited matrix.
// Problem: Word Search – LeetCode 79
// Goal: Understand recursion on 2D arrays.

// package day72;
public class LeetCode79 {
    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(dfs(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(char[][] board, String word, int row, int col, int index){
        if(index == word.length()){
            return true;
        }

        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length){
            return false;
        }

        if(board[row][col] != word.charAt(index)){
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#'; // mark visited

        boolean found = dfs(board, word, row+1, col, index+1) ||
                         dfs(board, word, row-1, col, index+1) ||
                         dfs(board, word, row, col+1, index+1) ||
                         dfs(board, word, row, col-1, index+1);

        board[row][col] = temp; // backtrack (restore)

        return found;
    }

    public static boolean exist2(char[][] board, String word){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs2(board, word, i, j, 0)){ return true; }
            }
        }return false;
    }
    public static boolean dfs2(char[][] board,String word,int r,int c,int i){
        if(i==word.length()){return true;}
        if(r<0 || c<0 || r>=board.length || c>=board[0].length){return false;}
        if(board[r][c]!=word.charAt(i)){return false;}

        char temp = board[r][c];
        board[r][c]='.';
        boolean res =dfs2(board, word, r+1, c, i+1)||
                    dfs2(board, word, r-1, c, i+1)||
                    dfs2(board, word, r, c+1, i+1)||
                    dfs2(board, word, r, c-1, i+1);

        board[r][c]=temp;
        return res;
    }
    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        // System.out.println(exist(board, "ABCCED")); // true
        // System.out.println(exist(board, "SEE"));     // true
        // System.out.println(exist(board, "ABCB"));    // false

        System.out.println(exist2(board,"A"));
    }
}