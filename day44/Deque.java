/**
Day 44 – Deque & Priority Queue
Concept: Double-ended queue (ArrayDeque), intro to PriorityQueue (heap-based).
Problem: Priority Queue in Java – GFG
Goal: Use built-in Java utilities.
 */

public class Deque {
    public static void main(String[] args) {
        
        // Creating a Deque using ArrayDeque (Recommended)
        java.util.ArrayDeque<Integer> dq = new java.util.ArrayDeque<>();

        // Adding elements from both ends
        dq.addLast(10);     // add at back
        dq.addLast(20);
        dq.addFirst(5);     // add at front
        dq.addFirst(1);

        System.out.println("Deque elements: " + dq);

        // Removing from both ends
        System.out.println("Remove from front: " + dq.removeFirst());
        System.out.println("Remove from back: " + dq.removeLast());

        // Peek operations
        System.out.println("Front element: " + dq.peekFirst());
        System.out.println("Back element: " + dq.peekLast());

        // Check if empty
        System.out.println("Is Deque empty? " + dq.isEmpty());

        // Size of Deque
        System.out.println("Size of Deque: " + dq.size());
    }
}