public class CircularQueue2 {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println("Front element: " + obj.top());   // 10
        System.out.println("Queue size: " + obj.size());     // 3
        System.out.println("Removed: " + obj.pop());         // 10
        System.out.println("Front element: " + obj.top());   // 20
        System.out.println("Queue size: " + obj.size());     // 2
        System.out.println("Is empty: " + obj.empty());      // false
    }
}
class MyQueue {
    int[] arr;
    int front;
    int rear;
    int capacity;
    public MyQueue() {
        capacity = 1000;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }
    public void push(int x) {
        if (size() == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
    }
    public int pop() {
        if (empty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = arr[front];
        if (front == rear) {
            front = 0;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return removed;
    }
    public int top() {
        if (empty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public boolean empty() {
        return rear == -1;
    }
    public int size() {
        if (empty()) {
            return 0;
        }
        if (rear >= front) {
            return rear - front + 1;
        }
        return capacity - front + rear + 1;
    }
}
