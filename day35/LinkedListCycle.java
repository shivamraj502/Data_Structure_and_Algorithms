// Day 35 – Middle & Cycle Detection
// Concept: Fast/slow pointer approach (Floyd’s Cycle).
// Problems: 
// Middle of the Linked List – LeetCode 876
// Linked List Cycle – LeetCode 141
// Goal: Master two-pointer technique.

// package day35;
public class LinkedListCycle {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean linkedListCycle(Node head){
        Node temp = head.next;
        while(temp != null){
            temp=temp.next;
            while(temp == head){return true;}
            
        }return false;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node newNode = new Node(6);
        Node tail = new Node(5);

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=tail;
        // tail.next=head;

        boolean isCycle = linkedListCycle(head);
        System.out.println("isCycle? "+isCycle);
    }
}
