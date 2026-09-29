/**Day 139 – Unique Paths
Concept: Combinatorial DP on 2D grid.
Problem: Unique Paths – LeetCode 62
Goal: Simplify recursion → tabulation. */

public class LC62 {
    static int path=0;
    public static int paths(int fr,int fc){
        int r=0, c=0;

        helper(fr,fc,r,c, path);
        return path;
    }
    public static void helper(int fr,int fc,int r, int c, int path){
        if(r==fr-1 && c==fc-1){
            path++;return;}

        if(r <= fr-1 && c <= fc-1){
            helper(fr, fc,r+1,c, path);
            helper(fr, fc,r,c+1, path);
        }else return;
    }
    
    public static int paths2(int fr,int fc){
        return helper2(fr,fc,0,0);
    }
    public static int helper2(int fr,int fc,int r, int c){

        if(r==fr-1 && c==fc-1){   return 1;   }
        if(r > fr-1 || c > fc-1){ return 0;}

            int down = helper2(fr, fc,r+1,c);
            int right = helper2(fr, fc,r,c+1);
        return down + right;
    }
    
    public static int paths3(int fr,int fc){
        path = 0;
        helper3(fr,fc,0,0);
        return path;
    }
    public static void helper3(int fr,int fc,int r, int c){
        if(r==fr-1 && c==fc-1){ path++; return;   }

        if(r <= fr-1 && c <= fc-1){
            helper3(fr, fc,r+1,c);
            helper3(fr, fc,r,c+1);
        }else return;
    }
    
    public static int paths4(int fr,int fc){        // DP
        path = 0;
        

        return path;
    }
    public static void main(String[] args) {
        int m =3,n=7;
        System.out.println(paths(m,n));
        System.out.println(paths2(m,n));
        System.out.println(paths3(m,n));
        System.out.println(paths4(m,n));
    }
}

/**Example 1:
Input: m = 3, n = 7
Output: 28

Example 2:
Input: m = 3, n = 2 // row  x column
Output: 3
Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Down -> Down  //done now count go to 0 , 0
2. Down -> Down -> Right
3. Down -> Right -> Down
  */