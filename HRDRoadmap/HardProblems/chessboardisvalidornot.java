/* Check if the given chessboard is valid or not
https://www.geeksforgeeks.org/dsa/check-if-the-given-chessboard-is-validor-not/ */

public class chessboardisvalidornot {
    public static boolean isValid(int n,int [][] c){
        boolean bool=true;
        

        return bool;
    }
    public static void main(String[] args) {
        
        int n = 2;
        int [][]c = {
            { 1, 0 },
            {0, 1}};
        System.out.println(isValid(n, c));
    }
}

/**
Input : n = 2, C = [ [ 1, 0 ], [ 0, 1 ] ]
Output : Yes
Explanation: All adjacent cells are painted differently hence a valid chessboard. 

Input : n = 2,  C = [ [ 1, 0 ], [ 0, 0 ]]  
Output : No
Explanation: All adjacent cells are not painted differently hence not a valid chessboard. 

The first chessboard is valid, whereas the second is invalid.
 */