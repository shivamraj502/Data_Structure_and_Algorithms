/**
Day 115 – Topological Sort (DAG)
Problem: Topological Sort – GFG
Goal: Learn ordering in dependency graphs.
 */

import java.util.*;
public class TopologicalSort{
    int vertices;
    ArrayList<ArrayList<Integer>> adj;
    TopologicalSort(int vertices) {
        this.vertices = vertices;
        adj = new ArrayList<>();

        for(int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
    }

    public void DFS(int node, boolean[] visited, Stack<Integer> stack) {
        visited[node] = true;

        for(int neighbor : adj.get(node)) {
            if(!visited[neighbor]) {
                DFS(neighbor, visited, stack);
            }
        }stack.push(node);
    }

    public void topologicalSort() {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < vertices; i++) {
            if(!visited[i]) {
                DFS(i, visited, stack);
            }
        }

        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        TopologicalSort graph = new TopologicalSort(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);

        graph.topologicalSort();
    }
}
/**
Time & Space Complexity
For an adjacency-list graph:
Time
O(V + E)
Every vertex and edge is processed.

Space
O(V)
For:
visited[]
stack
recursion stack
 */

/**
Topological Sort
        ↓
Directed Acyclic Graph (DAG)
        ↓
Dependency ordering
 */