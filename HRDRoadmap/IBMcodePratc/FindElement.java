import java.util.*;
public class FindElement{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("left", "right", "up", "down");
        System.out.println(matrix(list, 5));
    }

    public static int matrix(List<String> mat, int n) {
        int[][] ans = new int[n][n];
        int count = 1;

        int row = 0;
        int col = 0;

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j] = count++;
            }
        }

        for (String direction : mat) {

            if (direction.equals("right") && col < n - 1) {
                col++;
            }
            else if (direction.equals("left") && col > 0) {
                col--;
            }
            else if (direction.equals("down") && row < n - 1) {
                row++;
            }
            else if (direction.equals("up") && row > 0) {
                row--;
            }
        }

        System.out.println(Arrays.deepToString(ans));
        return ans[row][col];
    }
}