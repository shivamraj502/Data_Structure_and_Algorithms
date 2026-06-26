// Day 34 – Reverse a Linked List
// Concept: Iterative vs. recursive reversal.
// Problem: Reverse Linked List – LeetCode 206
// Goal: Build confidence in pointer re-linking.

// package day34;
import java.util.LinkedList;
public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original:"+list);
        list = list.reversed();
        System.out.println("Reversed:"+list);
    }


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public static Node reverseLinkedList(Node head) {
        Node curr = head;
        Node pre = null;

        while (curr != null) {
            Node nxt = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nxt;
        }
        return pre;
    }

    public static void main2(String[] args) {
        Node head = new Node(1);
        Node second = new Node(11);
        Node tail = new Node(13);

        head.next = second;
        head.next.next = tail;

        System.out.print("Original Linkedlist: \n");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        System.out.print("Reversed Linkedlist: \n");
        Node head2 = reverseLinkedList(head);
        Node temp2 = head2;
        while (temp2 != null) {
            System.out.print(temp2.data + " ");
            temp2 = temp2.next;
        }
        System.out.println();
    }
}
