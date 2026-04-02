/**
Day 39 – Stack using Linked List
Concept: Implement dynamic stack using linked list nodes.
Problem: Implement Stack using Linked List – GFG
Goal: Reinforce pointer logic with stack behavior.
 */

import java.util.*;
public class ImplementStackusingLinkedList{
    
    public static Node head;

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node Push(int n){
        Node newNode = new Node(n);                //System.out.println(".");
        newNode.next=head;
        head=newNode;
        
        return head;
    }
    public static Node Pop(){                      //System.out.println("..");
    System.out.println("Pop:"+head.data);    
    head = head.next;
        return head;
    }
    public static void Peek(){
        System.out.println("Peek: "+head.data);
        
    }
    public static void Display(){
        System.out.println("Display: ");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }System.out.println();
    }

    public static void main(String[] args) {

        head = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node tail = new Node(4);

        head.next=b;
        b.next=c;
        c.next=tail;

        Push(5);
        Push(6);
        Push(7);
        Display();
        Peek();
        Pop();
        Peek();
        Display();
        Pop();
        Display();
    }
}
