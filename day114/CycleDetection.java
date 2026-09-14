/**
Day 114 – Detect Cycle (Undirected Graph)
Problem: Cycle Detection – GFG
Goal: Apply visited array logic.
 */

import java.util.*;
public class CycleDetection {
    int vertices;
    ArrayList<ArrayList<Integer>> adj;

    CycleDetection(int vertices) {
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

    public boolean DFS(int node, int parent, boolean[] visited) {
        visited[node] = true;

        for(int neighbor : adj.get(node)) {
            if(!visited[neighbor]) {
                if(DFS(neighbor, node, visited)) {
                    return true;
                }
            } else if(neighbor != parent) {
                return true;
            }
        }return false;
    }

    public boolean hasCycle() {
        boolean[] visited = new boolean[vertices];
        for(int i = 0; i < vertices; i++) {
            if(!visited[i]) {
                if(DFS(i, -1, visited)) {
                    return true;
                }
            }
        }return false;
    }

    public static void main(String[] args) {

        CycleDetection graph = new CycleDetection(3);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);

        System.out.println(graph.hasCycle());
    }
}