/**
Day 68 – Mini Project #9
Task: Implement a Recursive Maze Path Finder (like Rat in a Maze).
Problem: Rat in a Maze – GFG
Goal: Apply recursion to a real path-finding problem.
 */
import java.util.*;
public class MiniProject9 {

    // function to find path
    public static boolean maze(int[][] arr, int i, int j) {

        // reached destination
        if(i == arr.length-1 && j == arr[0].length-1) {
            System.out.println("Path Found");
            return true;
        }

        // out of boundary
        if(i >= arr.length || j >= arr[0].length) {
            return false;
        }

        // blocked cell
        if(arr[i][j] == 0) {
            return false;
        }

        // move DOWN
        if(maze(arr, i+1, j)) {
            return true;
        }

        // move RIGHT
        if(maze(arr, i, j+1)) {
            return true;
        }

        return false; // no path found
    }

    public static void main(String[] args) {

        int[][] arr = {
            {1,1,0},
            {1,1,1},
            {0,1,1}
        };

        System.out.println(maze(arr, 0, 0));
    }
}
