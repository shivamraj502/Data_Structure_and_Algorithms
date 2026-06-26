// Day 31 – Introduction to Linked Lists
// Concept: Why linked lists? Nodes, pointers, advantages over arrays.
// Task: Create Node class and LinkedList class with insertAtEnd(), printList().
// Problem: Introduction to Linked List – GFG
// Goal: Understand structure and traversal.

import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
public class myLinkedList {
    public class Node{
        int data;
        Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }}
    
    public static void main(String [] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(4);
        list.addLast(5);
        System.out.println(list);
        list.remove(Integer.valueOf(5));
        System.out.println(list);
        list.addFirst(3);
        System.out.println(list);
        list.addFirst(8);
        System.out.println(list);
        list.addLast(82);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list = list.reversed();
        System.out.println(list);
    }


    static class Node2{
        int data;
        Node2 next;
        Node2(int data){
            this.data=data;   //5->6->null
            this.next=null;
        }
    }
    
    public static void main2(String[] args) {
        Node2 head = new Node2(5);
        Node2 second = new Node2(71);
        Node2 tail = new Node2(6);

        head.next=second;
        head.next.next=tail;
        
        // head.next=second;
        // second.next=tail;

        insertAtEnd(head,55);
        insertAtEnd(head,56);
        insertAtEnd(head,57);
        printList(head);
    }

    public static void insertAtEnd(Node2 head,int n){
        Node2 newNode = new Node2(n);

        Node2 temp = head;
        while(temp.next != null){
            temp=temp.next;
        }temp.next=newNode;
    }

    public static void printList(Node2 head){
    Node2 temp = head;
        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


// Mistakes
/*
public static Node{
        int data;
        Node next;
    public static Node(int data){
        this.next = data;
        Node.next = null;
    }}


public static void main(String [] args){
        LinkedList list = new LinkedList();
        list.add(4);
        list.add(5);
        list.delete(5);
    }


public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.remove(Integer.valueOf(5));
        System.out.println(list);
}


public static void main(String [] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(4);
        list.addLast(5);
        System.out.println(list);
        list.remove(Integer.valueOf(5));
        System.out.println(list);
}
 */