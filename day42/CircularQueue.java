/**
Day 42 – Circular & Linked Queue
Concept: Circular queue, queue using linked list.
Problem: Circular Queue Implementation – GFG
Goal: Handle overflow efficiently.
 */

public class CircularQueue {
    static int arr[] = new int[5];
    static int front=-1;
    static int rear=-1;
    static int size=0;

    public static void Enqueue(int n){
        if(size == arr.length){
            // System.out.println("rear: "+rear);
            System.out.println("Queue Overflow");
            // System.out.println(".");
        }else if(front==-1 && rear==-1){
            front=0;rear=0;
            arr[rear]=n;
            size++;
            System.out.println("Enqued: "+n);
            System.out.println("\nEnqued front: "+front);
            System.out.println("\nEnqued rear: "+rear);
            // System.out.println("..");
        }else{
            rear=((rear+1)%arr.length);
            arr[rear]=n;
            size++;
            System.out.println("Enqued: "+n);
            System.out.println("\nEnqued front: "+front);
            System.out.println("\nEnqued rear: "+rear);
            // System.out.println("...");
        }
    }

    public static void Dequeue(){    // can also do front++ at the plece of element shifting
        if(size==0){
            System.out.println("Queue Underflow");
        }else{
            System.out.println("\ndequeue element: "+ arr[front]);
            front = ((front+1) % arr.length);         // front = (front % arr.length)+1; and front = ((front+1) % arr.length); are different
            size--;
            System.out.println("\ndequeue front: "+front);
        }
    }

    public static boolean IsEmpty(){
        if(size == 0)return true;
        else return false;
    }
    
    public static int Size(){
        return size;
    }
    
    public static void Peek(){
        if(size==0)System.out.println("Empty Queue");
        else System.out.println("Peek: "+arr[front]);
    }

    public static void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[front]+" ");
            front = ((front+1) % arr.length);
        }System.out.println();
    }

    public static void main(String[] args) {
        Enqueue(5);
        Enqueue(4);
        Enqueue(3);
        Enqueue(2);
        Enqueue(1);
        Enqueue(66);
        System.out.println("Display:");
        display();

        Dequeue();
        Dequeue();
        // Dequeue();
        // Dequeue();
        System.out.println("Display:");
        display();
        
        Enqueue(6);
        System.out.println("Display:");
        display();
        
        System.out.println("\nisEmpty: "+IsEmpty());
        System.out.println("size: "+Size());

        Peek();

    }
}


