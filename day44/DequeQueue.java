import java.util.LinkedList;
import java.util.Queue;

public class DequeQueue {
    
    private Queue<Integer> q1;  // Main queue
    private Queue<Integer> q2;  // Helper queue
    
    public DequeQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    // Add element to the front (push_front) - O(n)
    public void addFront(int x) {
        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        
        // Add new element to front (now first in q1)
        q1.add(x);
        
        // Move back all elements from q2 to q1
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
    }
    
    // Add element to the rear (push_back) - O(1)
    public void addRear(int x) {
        q1.add(x);
    }
    
    // Remove element from front (pop_front) - O(1)
    public int removeFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        return q1.poll();
    }
    
    // Remove element from rear (pop_rear) - O(n)
    public int removeRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        
        // Move all elements except the last one to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        
        // Remove the last element (rear)
        int rear = q1.poll();
        
        // Move elements back to q1
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
        
        return rear;
    }
    
    // Get front element - O(1)
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        return q1.peek();
    }
    
    // Get rear element - O(n)
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        
        // Move all to q2 to access the last element
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        
        int rear = q2.peek();
        
        // Move back to q1
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
        
        return rear;
    }
    
    public boolean isEmpty() {
        return q1.isEmpty();
    }
    
    public int size() {
        return q1.size();
    }
    
    // Test the Deque
    public static void main(String[] args) {
        DequeQueue dq = new DequeQueue();
        
        dq.addRear(10);
        dq.addRear(20);
        dq.addFront(5);
        dq.addFront(1);
        
        System.out.println("Front: " + dq.getFront());   // Output: 1
        System.out.println("Rear: " + dq.getRear());     // Output: 20
        
        System.out.println("Removed Front: " + dq.removeFront()); // 1
        System.out.println("Removed Rear: " + dq.removeRear());   // 20
        
        System.out.println("Current Size: " + dq.size());
    }
}