
 import java.util.Stack;
public class DequeStack {
    
    private Stack<Integer> stack1;  // Main stack (for front operations)
    private Stack<Integer> stack2;  // Helper stack (for rear operations)
    
    public DequeStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    // Add element to the front (push_front)
    public void addFront(int x) {
        // Move all elements from stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        
        // Add new element to stack1 (now at front)
        stack1.push(x);
        
        // Move back all elements from stack2 to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
    
    // Add element to the rear (push_back)
    public void addRear(int x) {
        stack1.push(x);   // Simple push to main stack
    }
    
    // Remove element from front (pop_front)
    public int removeFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        return stack1.pop();
    }
    
    // Remove element from rear (pop_rear)
    public int removeRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        
        // Move all elements except last one to stack2
        while (stack1.size() > 1) {
            stack2.push(stack1.pop());
        }
        
        // Remove the last element (rear)
        int rear = stack1.pop();
        
        // Move elements back to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        
        return rear;
    }
    
    // Get front element
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        return stack1.peek();
    }
    
    // Get rear element
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        
        // Move all to stack2 to access last element
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        
        int rear = stack2.peek();
        
        // Move back to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        
        return rear;
    }
    
    public boolean isEmpty() {
        return stack1.isEmpty();
    }
    
    public int size() {
        return stack1.size();
    }
    
    // For testing
    public static void main(String[] args) {
        DequeStack dq = new DequeStack();
        
        dq.addRear(10);
        dq.addRear(20);
        dq.addFront(5);
        dq.addFront(1);
        
        System.out.println("Front: " + dq.getFront());  // 1
        System.out.println("Rear: " + dq.getRear());    // 20
        
        System.out.println("Removed Front: " + dq.removeFront()); // 1
        System.out.println("Removed Rear: " + dq.removeRear());   // 20
        
        System.out.println("Current Size: " + dq.size());
    }
}
