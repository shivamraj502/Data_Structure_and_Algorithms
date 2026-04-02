// Doubly Linked List
// Problem 1:
// How will you traverse a doubly linked list backward?

import java.util.*;
public class doubleylinkedlist1 {

    static class Node {
        int data;
        Node next;
        Node pre;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.pre = null;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(15);
        Node third = new Node(16);
        Node fourth = new Node(17);
        Node fifth = new Node(18);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        second.pre = first;
        third.pre = second;
        fourth.pre = third;
        fifth.pre = fourth;

        Node tail = first;

        while (tail.next != null) {
            tail = tail.next;
        }

        while (tail != null) {
            System.out.println(tail.data);
            tail = tail.pre;
        }
    }
}
