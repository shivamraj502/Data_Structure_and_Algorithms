/**
Day 117 – Union-Find / Disjoint Set
Problem: Graph Valid Tree – LeetCode 261
Goal: Learn efficient component detection.
 */

import java.util.*;
public class LeetCode261 {
    public static boolean validTree(int n, int[][] edges) {
        if(edges.length != n - 1) {
            return false;
        }

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        DFS(0, graph, visited);

        for(int i = 0; i < n; i++) {

            if(!visited[i]) {
                return false;
            }
        }return true;
    }

    public static void DFS(
        int node,
        ArrayList<ArrayList<Integer>> graph,
        boolean[] visited) {

        visited[node] = true;

        for(int neighbor : graph.get(node)) {

            if(!visited[neighbor]) {

                DFS(neighbor, graph, visited);
            }
        }
    }
    public static void main(String[] args) {
        LeetCode261 obj = new LeetCode261();
        int n = 5;

        int[][] edges = {
            {0, 1},
            {0, 2},
            {0, 3},
            {1, 4}
        };
        boolean result = obj.validTree(n, edges);
        System.out.println(result);
    }

}
/**
Complexity
Building the adjacency list:
O(E)

DFS:
O(V + E)

Overall:
Time
O(V + E)
Space
O(V + E)

for the adjacency list, plus:
O(V)
for visited/recursion.
 */