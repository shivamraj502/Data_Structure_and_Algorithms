// Day 41 – Queue Basics: Enqueue,Dequeue,IsEmpty,Size,Peek
// Concept: FIFO structure, enqueue/dequeue using array.
// Problem: Queue Implementation – GFG
// Goal: Learn queue mechanics.

public class QueueArray{
    static int arr[] = new int[5];
    static int front=-1;
    static int rear=-1;

    public static void Enqueue(int n){
        if(rear==arr.length-1){
            System.out.println("Queue Overflow");
            return;
        }else if(front==-1 && rear==-1){
            front=0;rear=0;
            arr[rear]=n;
            // System.out.println(arr[rear]);
        }else{
            rear+=1;
            arr[rear]=n;
            // System.out.println(arr[rear]);
        }
    }

    public static void Dequeue(){    // can also do front++ at the plece of element shifting
        if(rear==-1){
            System.out.println("Queue Underflow");
        }else{
            for(int i=0;i<=rear-1;i++){
                arr[i]=arr[i+1];
            }rear-=1;

            // System.out.println();
            // for(int i=0;i<=rear;i++){
            //     System.out.println(arr[i]);
            // }
        }
    }

    public static boolean IsEmpty(){
        if(rear==-1)return true;
        else return false;
    }
    
    public static int Size(){
        if(rear==-1)return -1;
        else return rear+1;
    }
    
    public static void Peek(){
        if(front==-1)System.out.println("Empty Queue");
        else System.out.println("Peek: "+arr[front]);
    }

    public static void main(String[] args) {
        Enqueue(5);
        Enqueue(4);
        Enqueue(3);
        Enqueue(2);
        System.out.println();
        for(int i=0;i<=rear;i++){
                System.out.println(arr[i]);
        }

        Dequeue();
        // Dequeue();
        // Dequeue();
        // Dequeue();
        System.out.println();
            for(int i=0;i<=rear;i++){
                System.out.println(arr[i]);
            }

        System.out.println("isEmpty: "+IsEmpty());
        System.out.println("size: "+Size());

        Peek();

    }
}






























































/*  
public class QueueArray {
    int[] arr = new int[5];
    int front = -1;
    int rear = -1;

    // Enqueue
    public void enqueue(int x) {
        if (rear == arr.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) front = 0;
        rear++;
        arr[rear] = x;
    }

    // Dequeue
    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Removed: " + arr[front]);
        front++;
    }

    // Peek
    public void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
  
        System.out.println("Front: " + arr[front]);
    }

    // isEmpty
    public void isEmpty() {
        if (front == -1 || front > rear) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }
    }

    // Size
    public void size() {
        if (front == -1) {
            System.out.println("Size: 0");
        } else {
            System.out.println("Size: " + (rear - front + 1));
        }
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.peek();
        q.dequeue();
        q.isEmpty();
        q.size();
    }
}

*/