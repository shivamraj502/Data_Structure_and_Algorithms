/**
Day 68 – Mini Project #9
Task: Implement a Recursive Maze Path Finder (like Rat in a Maze).
Problem: Rat in a Maze – GFG
Goal: Apply recursion to a real path-finding problem.
 */
import java.util.*;
public class MiniProject9 {

   public static boolean ratNmaze(int [][] arr, int i, int j){       
            
      if(i >= arr.length || j >= arr[0].length){
         return false;
      }

      if(arr[i][j] == 0){
         return false;
      }

      if(i == arr.length-1 && j == arr[0].length-1){
         return true;
      }

      arr[i][j] = 0;

      if(ratNmaze(arr,i+1,j)){
         return true;
      }
      
      if(ratNmaze(arr,i,j+1)){
         return true;
      }

      arr[i][j]=1;

       return false;
   }

   public static boolean ratINmaze(int n, int [][] maze, int x, int y, int [][] solution){

      if(x == n-1 && y == n-1 && maze[x][y] == 1){
         solution[x][y] = 1;
         return true;
      }

      if(isSafe(n, maze, x, y, solution)){ 
      solution[x][y]=1;
      if(ratINmaze(n, maze, x+1, y, solution)) return true;
      if(ratINmaze(n, maze, x, y+1, solution)) return true;
      solution[x][y]=0;
      }

      return false;
   }
   public static boolean isSafe(int n, int [][] maze, int x, int y, int [][] solution){
      if(x >= 0 && y >= 0 && x < n && y < n && maze[x][y] ==1 && solution[x][y] == 0){
         return true;
      }else return false;
   }

    public static void main(String[] args) {

        int[][] arr = {
            {1,1,0},
            {1,1,1},
            {0,0,1}
        };

      //   System.out.println(ratNmaze(arr, 0, 0));

      int n= arr.length;
      int [][] solution = new int[n][n];
      System.out.println(ratINmaze(n,arr, 0, 0,solution));

      for(int x=0;x<arr.length;x++){
         for(int y=0;y<arr.length;y++){
            System.out.print(solution[x][y]+" ");
         }System.out.println();
      }
    }
}
