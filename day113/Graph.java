/**
Day 113 – DFS Traversal
Concept: Recursive stack-based traversal.
Problem: DFS of Graph – GFG
Goal: Learn depth-based exploration.
 */

import java.util.*;
public class Graph {
    int vertices;
    ArrayList<ArrayList<Integer>> adj;

    Graph(int vertices) {
        this.vertices = vertices;
        adj = new ArrayList<>();

        for(int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void DFS(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for(int neighbor : adj.get(node)) {
            if(!visited[neighbor]) {
                DFS(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        boolean[] visited = new boolean[6];
        graph.DFS(0, visited);
    }
}

/**
Time & Space Complexity
For an adjacency-list graph:
Time:
O(V + E)

where:
V = vertices
E = edges
Each vertex and edge is processed at most a constant number of times.

Space:
O(V)
because of:
visited[]
recursion stack / explicit stack
 */