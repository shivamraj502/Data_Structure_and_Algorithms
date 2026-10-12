import java.io.*;
import java.util.*;
import java.util.PriorityQueue;
public class c1 {
    static class Pair {
        int node, cost;

        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    static int[] dijkstra(List<List<Pair>> graph, int src, int n) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.cost, b.cost));
        pq.offer(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            int u = cur.node;
            int cost = cur.cost;

            if (cost != dist[u]) continue;

            for (Pair next : graph.get(u)) {
                int v = next.node;
                int newCost = cost + next.cost;

                if (newCost < dist[v]) {
                    dist[v] = newCost;
                    pq.offer(new Pair(v, newCost));
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(first[0]);
        int m = Integer.parseInt(first[1]);

        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] edge = br.readLine().trim().split("\\s+");
            int a = Integer.parseInt(edge[0]);
            int b = Integer.parseInt(edge[1]);
            int c = Integer.parseInt(edge[2]);

            graph.get(a).add(new Pair(b, c));
        }

        int q = Integer.parseInt(br.readLine().trim());

        while (q-- > 0) {
            String[] query = br.readLine().trim().split("\\s+");
            int src = Integer.parseInt(query[0]);
            int dest = Integer.parseInt(query[1]);

            int[] dist = dijkstra(graph, src, n);

            System.out.println(dist[dest] == Integer.MAX_VALUE ? -1 : dist[dest]);
        }
    }
}

/*
Problem Name: Shortest Path in a Directed Weighted Graph
Problem Statement:
You are given a directed weighted graph containing N nodes and M edges.
Each edge connects a source node A to a destination node B with a cost C.

You are also given Q queries. Each query contains a source node S and a destination node D.

For every query, find the minimum cost required to travel from S to D.
If there is no path from S to D, print -1.

Input Format:
- The first line contains two integers N and M.
- The next M lines contain three integers A, B, and C,
  representing a directed edge from A to B with cost C.
- The next line contains an integer Q.
- The next Q lines contain two integers S and D,
  representing the source and destination of each query.

Output Format:
For each query, print the minimum path cost on a new line.
If no path exists, print -1.

Constraints:
- 1 <= N <= 100000
- 0 <= M <= 200000
- 1 <= A, B, S, D <= N
- Edge costs are non-negative integers.

Sample Input 1:
4 4
1 2 1
1 3 4
2 3 1
3 4 2
3
1 4
1 3
4 1

Sample Output 1:
4
2
-1

Explanation:
The shortest path from 1 to 4 is 1 -> 2 -> 3 -> 4.
Total cost = 1 + 1 + 2 = 4.
The shortest path from 1 to 3 costs 2.
There is no path from 4 to 1.


Test Case 1:
Input:
3 2
1 2 5
2 3 7
2
1 3
3 1

Output:
12
-1


Test Case 2:
Input:
4 4
1 2 1
1 3 4
2 3 1
3 4 2
3
1 4
1 3
2 4

Output:
4
2
3


Test Case 3:
Input:
3 3
1 2 0
2 3 0
1 3 5
2
1 3
2 1

Output:
0
-1


Test Case 4:
Input:
5 3
1 2 4
2 3 6
4 5 2
3
1 3
4 5
1 5

Output:
10
2
-1


Test Case 5:
Input:
4 5
1 2 10
1 3 2
3 2 1
2 4 3
3 4 10
3
1 4
1 2
3 4

Output:
6
3
4


Algorithm:
Dijkstra's Shortest Path Algorithm using a PriorityQueue.

Time Complexity:
O((N + M) log N) per query.

Space Complexity:
O(N + M).
*/