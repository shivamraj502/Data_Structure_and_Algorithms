// Day 31 – Introduction to Linked Lists
// Concept: Why linked lists? Nodes, pointers, advantages over arrays.
// Task: Create Node class and LinkedList class with insertAtEnd(), printList().
// Problem: Introduction to Linked List – GFG
// Goal: Understand structure and traversal.

public class LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;   //5->6->null
            this.next=null;
        }
    }
    
    public static void main(String[] args) {
        Node head = new Node(5);
        Node second = new Node(71);
        Node tail = new Node(6);

        head.next=second;
        head.next.next=tail;
        
        // head.next=second;
        // second.next=tail;

        insertAtEnd(head,55);
        insertAtEnd(head,56);
        insertAtEnd(head,57);
        printList(head);
    }

    public static void insertAtEnd(Node head,int n){
        Node newNode = new Node(n);

        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }temp.next=newNode;
    }

    public static void printList(Node head){
    Node temp = head;
        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
