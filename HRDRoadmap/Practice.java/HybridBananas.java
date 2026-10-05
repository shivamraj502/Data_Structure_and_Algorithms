import java.util.*;
public class HybridBananas {
    static class Edge {
        String node;
        int cost;
        Edge(String node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    public static int findMinimumEnergy(List<List<String>> trees, String start, String destination) {
        Map<String, List<Edge>> graph = new HashMap<>();
        Map<String, List<String>> spotTrees = new HashMap<>();

        for (int i = 0; i < trees.size(); i++) {
            List<String> treeLines = trees.get(i);
            for (String line : treeLines) {
                String[] parts = line.split(" ");
                String parent = i + "#" + parts[0];

                if (!graph.containsKey(parent)) {
                    graph.put(parent, new ArrayList<>());
                }
                if (!spotTrees.containsKey(parts[0])) {
                    spotTrees.put(parts[0], new ArrayList<>());
                }spotTrees.get(parts[0]).add(parent);

                for (int j = 1; j < parts.length; j++) {
                    String child = i + "#" + parts[j];

                    if (!graph.containsKey(child)) {
                        graph.put(child, new ArrayList<>());
                    }

                    graph.get(parent).add(new Edge(child, 0));
                    graph.get(child).add(new Edge(parent, 1));

                    if (!spotTrees.containsKey(parts[j])) {
                        spotTrees.put(parts[j], new ArrayList<>());
                    }spotTrees.get(parts[j]).add(child);
                }
            }
        }

        for (String spot : spotTrees.keySet()) {
            List<String> occurrences = spotTrees.get(spot);
            for (int i = 0; i < occurrences.size(); i++) {
                for (int j = i + 1; j < occurrences.size(); j++) {
                    String n1 = occurrences.get(i);
                    String n2 = occurrences.get(j);
                    graph.get(n1).add(new Edge(n2, 1));
                    graph.get(n2).add(new Edge(n1, 1));
                }
            }
        }

        Map<String, Integer> dist = new HashMap<>();
        for (String k : graph.keySet()) {
            dist.put(k, Integer.MAX_VALUE);
        }
        Deque<String> q = new ArrayDeque<>();
        List<String> startList = spotTrees.get(start);
        if (startList == null || startList.size() == 0) return -1;
        
        String src = startList.get(0);
        dist.put(src, 0);
        q.addFirst(src);

        while (!q.isEmpty()) {
            String curr = q.pollFirst();
            int curDist = dist.get(curr);
            List<Edge> neighbors = graph.get(curr);
            if (neighbors == null) continue;

            for (Edge e : neighbors) {
                int alt = curDist + e.cost;
                if (alt < dist.get(e.node)) {
                    dist.put(e.node, alt);
                    if (e.cost == 0) {
                        q.addFirst(e.node);
                    } else {
                        q.addLast(e.node);
                    }
                }
            }
        }

        int minCost = Integer.MAX_VALUE;
        List<String> destList = spotTrees.get(destination);
        if (destList != null) {
            for (String targetNode : destList) {
                if (dist.get(targetNode) < minCost) {
                    minCost = dist.get(targetNode);
                }
            }
        }return minCost == Integer.MAX_VALUE ? -1 : minCost;
    }

    public static void main(String[] args) {
        List<List<String>> trees = new ArrayList<>();
        trees.add(Arrays.asList("1 3","3 2 4","4 5 6"));
        trees.add(Arrays.asList("7 9","9 4 8","4 5"));
        int res = findMinimumEnergy(trees, "2", "8");
        System.out.println(res);
    }
}