// Day 33 – Search and Length in Linked List
// Concept: Iterative & recursive search; count nodes.
// Problem: Search an element in a Linked List – GFG
// Goal: Work with traversal logic.

package day33;
public class SearchAnElement {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next= null;
        }
    }

    public static boolean isFound(Node head, int target){
        Node temp = head;
        while(temp != null){
            if(temp.data== target){ return true;}
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node tail = new Node(5);

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=tail;

        // head.next=second;
        // head.next.next=third;
        // head.next.next.next=fourth;
        // head.next.next.next.next=tail;

        int target = 2;
        boolean result = isFound(head,target);
        System.out.println("isFound? "+result); 
    }
}
