/**
Day 118 – Mini Project #16
Task: Build a Social Network Connection Finder
Users = graph nodes; find degrees of connection using BFS.
Goal: Apply graphs to real-world context.
 */
import java.util.*;
public class MiniProject16 {
    HashMap<String, ArrayList<String>> graph;

    MiniProject16() {
        graph = new HashMap<>();
    }

    // Add a new user
    public void addUser(String user) {

        if(!graph.containsKey(user)) {
            graph.put(user, new ArrayList<>());
        }
    }

    // Add friendship
    public void addFriend(String user1, String user2) {

        addUser(user1);
        addUser(user2);

        graph.get(user1).add(user2);
        graph.get(user2).add(user1);
    }

    // Display network
    public void displayNetwork() {

        for(String user : graph.keySet()) {

            System.out.print(user + " → ");

            for(String friend : graph.get(user)) {
                System.out.print(friend + " ");
            }

            System.out.println();
        }
    }

    // Find minimum connection degree
    public int connectionDegree(String start, String target) {

        if(!graph.containsKey(start) ||
           !graph.containsKey(target)) {

            return -1;
        }

        Queue<String> queue = new LinkedList<>();

        HashMap<String, Integer> distance = new HashMap<>();

        queue.add(start);
        distance.put(start, 0);

        while(!queue.isEmpty()) {

            String user = queue.poll();

            if(user.equals(target)) {
                return distance.get(user);
            }

            for(String friend : graph.get(user)) {

                if(!distance.containsKey(friend)) {

                    distance.put(
                        friend,
                        distance.get(user) + 1
                    );

                    queue.add(friend);
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        MiniProject16 network = new MiniProject16();

        network.addFriend("Alice", "Bob");
        network.addFriend("Bob", "Charlie");
        network.addFriend("Charlie", "David");
        network.addFriend("Alice", "Eve");

        System.out.println("Social Network:");

        network.displayNetwork();

        int degree =
            network.connectionDegree("Alice", "David");

        System.out.println(
            "\nConnection degree: " + degree
        );
    }
}