/**
🧩 WEEK 17 — Graph Practice & Integration
Day 119 – Practice Problems
Problems:
Number of Islands – LeetCode 200
Clone Graph – LeetCode 133
Course Schedule – LeetCode 207
Goal: Consolidate graph algorithms.
 */
import java.util.*;
public class LC200_133_207 {
    public int val;
    public List<LC200_133_207> neighbors;

    public LC200_133_207() {this.neighbors = new ArrayList<>();}
    public LC200_133_207(int val) {
        this.val = val;
        this.neighbors = new ArrayList<>();
    }
    public static int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int count = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    DFS(grid, i, j);
                }
            }
        }return count;
    }
    public static void DFS(char[][] grid, int row, int col) {
        if(row < 0 || row >= grid.length ||
           col < 0 || col >= grid[0].length ||
           grid[row][col] == '0') {

            return;
        }
        grid[row][col] = '0';

        DFS(grid, row - 1, col); // up
        DFS(grid, row + 1, col); // down
        DFS(grid, row, col - 1); // left
        DFS(grid, row, col + 1); // right
    }
    
    public static int numIslands2(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int count = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    BFS(grid, i, j);
                }
            }
        }return count;
    }
    public static void BFS(char[][] grid, int row, int col) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});

        grid[row][col] = '0';

        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while(!queue.isEmpty()) {

            int[] current = queue.poll();

            int r = current[0];
            int c = current[1];

            for(int[] direction : directions) {

                int newRow = r + direction[0];
                int newCol = c + direction[1];

                if(newRow >= 0 && newRow < grid.length &&
                   newCol >= 0 && newCol < grid[0].length &&
                   grid[newRow][newCol] == '1') {

                    grid[newRow][newCol] = '0';

                    queue.add(new int[]{
                        newRow,
                        newCol
                    });
                }
            }
        }
    }
    
    HashMap<LC200_133_207, LC200_133_207> map = new HashMap<>();
    public LC200_133_207 cloneGraph(LC200_133_207 node) {

        if(node == null) {
            return null;
        }

        if(map.containsKey(node)) {
            return map.get(node);
        }

        LC200_133_207 clone = new LC200_133_207(node.val);
        map.put(node, clone);

        for(LC200_133_207 neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }

        return clone;
    }
    public static void printGraph(LC200_133_207 node) {

        HashSet<LC200_133_207> visited = new HashSet<>();
        Queue<LC200_133_207> queue = new LinkedList<>();

        queue.add(node);
        visited.add(node);

        while(!queue.isEmpty()) {

            LC200_133_207 current = queue.poll();

            System.out.print(current.val + " -> ");

            for(LC200_133_207 neighbor : current.neighbors) {

                System.out.print(neighbor.val + " ");

                if(!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }System.out.println();
            }
        }
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        // Create graph
        for(int[] prerequisite : prerequisites) {

            int course = prerequisite[0];
            int preCourse = prerequisite[1];

            adj.get(preCourse).add(course);

            indegree[course]++;
        }

        // Add courses with indegree 0
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < numCourses; i++) {

            if(indegree[i] == 0) {
                queue.add(i);
            }
        }

        int count = 0;

        // BFS
        while(!queue.isEmpty()) {

            int current = queue.poll();

            count++;

            for(int neighbor : adj.get(current)) {

                indegree[neighbor]--;

                if(indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        return count == numCourses;
    }
    public static void main(String[] args) {
    // 200
    char [][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
    };
    System.out.println(numIslands(grid));
    // System.out.println(numIslands2(grid));

    // 133
    LC200_133_207 obj = new LC200_133_207(0);
    // Create nodes
    LC200_133_207 node1 = new LC200_133_207(1);
    LC200_133_207 node2 = new LC200_133_207(2);
    LC200_133_207 node3 = new LC200_133_207(3);
    LC200_133_207 node4 = new LC200_133_207(4);
    // Create connections
    node1.neighbors.add(node2);
    node1.neighbors.add(node4);
    node2.neighbors.add(node1);
    node2.neighbors.add(node3);
    node3.neighbors.add(node2);
    node3.neighbors.add(node4);
    node4.neighbors.add(node1);
    node4.neighbors.add(node3);
    // Clone the graph
    LC200_133_207 clone = obj.cloneGraph(node1);
    // Print cloned graph
    printGraph(clone);

    // 207
    LC200_133_207 obj2 = new LC200_133_207();
    int numCourses = 4;
    int[][] prerequisites = {
        {1, 0},
        {2, 1},
        {3, 2}
    };
    boolean result = obj2.canFinish(numCourses, prerequisites);
    System.out.println("Can finish all courses: " + result);
    }
}
/**
200:
Example 1:
Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1

Example 2:
Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
 */

/**
DFS:
Complexity
Let:
m = number of rows
n = number of columns

Every cell is visited at most once.
Time
O(m × n)
Space

For recursive DFS:
O(m × n)
in the worst case because the recursion stack can contain many cells.
 */

/** 207:
Complexity
Let:
V = number of courses
E = number of prerequisite relationships

Time: O(V + E)
Space: O(V + E)
 */