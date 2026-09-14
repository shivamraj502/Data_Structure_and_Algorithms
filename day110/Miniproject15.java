/**
Day 110 – Mini Project #15
Task: Build a Job Scheduler using Min Heap (by priority).
Goal: Combine heap logic + Java PriorityQueue.
 */

import java.util.PriorityQueue;
public class Miniproject15 {
    static class Job {
        int id;
        String name;
        int priority;

        Job(int id, String name, int priority) {
            this.id = id;
            this.name = name;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {

        // Min Heap based on priority
        PriorityQueue<Job> pq =
            new PriorityQueue<>(
                (a, b) -> Integer.compare(a.priority, b.priority)
            );

        // Add jobs
        pq.add(new Job(101, "Backup", 3));
        pq.add(new Job(102, "Database", 1));
        pq.add(new Job(103, "Email", 2));
        pq.add(new Job(104, "Security", 1));

        System.out.println("Job Execution Order:");

        // Execute jobs
        while(!pq.isEmpty()) {

            Job job = pq.poll();

            System.out.println(
                "ID: " + job.id +
                ", Name: " + job.name +
                ", Priority: " + job.priority
            );
        }
    }
}