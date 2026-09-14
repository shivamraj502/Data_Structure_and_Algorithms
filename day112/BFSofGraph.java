/**
Day 112 – BFS Traversal
Concept: Use Queue for level-wise traversal.
Problem: BFS of Graph – GFG
Goal: Learn connected component traversal.
 */
import java.util.*;
public class BFSofGraph{
    int vertices;
    ArrayList<ArrayList<Integer>> adj;

    BFSofGraph(int vertices) {
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

    public void BFS(int start) {

        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()) {

            int node = queue.poll();

            System.out.print(node + " ");

            for(int neighbor : adj.get(node)) {

                if(!visited[neighbor]) {

                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        BFSofGraph graph = new BFSofGraph(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        graph.BFS(0);
    }
}