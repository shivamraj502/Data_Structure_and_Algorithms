/**
Day 68 – Mini Project #9
Task: Implement a Recursive Maze Path Finder (like Rat in a Maze).
Problem: Rat in a Maze – GFG
Goal: Apply recursion to a real path-finding problem.
 */
import java.util.*;
public class MiniProject9 {

    public static boolean ratNmaze(int [][] arr, int i, int j){       
      if(i == arr.length-1 && j == arr[0].length-1){
         return true;
      }
      
      if(i >= arr.length || j >= arr[0].length){
         return false;
      }

      if(arr[i][j] == 0){
         return false;
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

    public static void main(String[] args) {

        int[][] arr = {
            {1,1,0},
            {1,1,0},
            {0,0,0}
        };

        System.out.println(ratNmaze(arr, 0, 0));
    }
}
