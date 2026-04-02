/**
Day 36 – Doubly Linked List
Concept: prev pointer, insertion/deletion both sides.
Problem: Doubly Linked List Implementation – GFG
Goal: Learn bidirectional traversal.
 */

// package day36;
public class doubleLL {
    public static class Node{
        int data;
        Node next;
        Node pre;
        Node(int data){
            this.data= data;
            this.next=null;
            this.pre=null;
        }
    }

    public static void iterate(Node head, Node tail){
        Node temp = tail;
        System.out.println("Reverse:");
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.pre;
        }System.out.println();

        System.out.println("Original:");
        Node temp2 = head;
        while(temp2 != null){
            System.out.print(temp2.data +" ");
            temp2 = temp2.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node tail = new Node(5);

        head.next=b;
        b.next=c;
        c.next=d;
        d.next=tail;

        tail.pre=d;
        d.pre=c;
        c.pre=b;
        b.pre=head;

        iterate(head,tail);
    }
}
