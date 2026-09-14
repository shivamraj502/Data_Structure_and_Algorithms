/**
🕸️ WEEK 16 — Graphs (Fundamentals)
Day 111 – Introduction to Graphs
Concept: Types of graphs, adjacency list & matrix.
Problem: Graph Representation – GFG
Goal: Build Graph class manually in Java.
 */

import java.util.*;
public class Graph{
    int vertices;
    ArrayList<ArrayList<Integer>> adj;

    Graph(int vertices) {
        this.vertices = vertices;

        adj = new ArrayList<>();

        for(int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add an undirected edge
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // Print graph
    public void printGraph() {

        for(int i = 0; i < vertices; i++) {
            System.out.print(i + " → ");
            for(int node : adj.get(i)) {
                System.out.print(node + " ");
            }System.out.println();
        }
    }

    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.printGraph();
    }
}

/**
Cheat Sheet :

Graph
Graph = Vertices + Edges

Undirected
A ─── B

Directed
A ───→ B

Weighted
A ──5── B

Matrix
int[][] graph;
List
ArrayList<ArrayList<Integer>> adj;

Undirected edge
adj.get(u).add(v);
adj.get(v).add(u);

Directed edge
adj.get(u).add(v);

🎯 Day 111 Practice
Build this graph manually:
        0
       / \
      1   2
     / \   \
    3   4   5

Your edges should be:
0 - 1
0 - 2
1 - 3
1 - 4
2 - 5

Then print:
0 → 1 2
1 → 0 3 4
2 → 0 5
3 → 1
4 → 1
5 → 2
 */