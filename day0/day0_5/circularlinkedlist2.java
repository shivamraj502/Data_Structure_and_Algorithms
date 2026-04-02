// Circular Linked List
// Problem 2:
// How will you insert a node at the beginning of a circular linked list?

public class circularlinkedlist2 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(15);
        Node third = new Node(16);
        Node fourth = new Node(17);
        Node fifth = new Node(18);

        Node newNode = new Node(22);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = head;

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;

        Node current = head;

        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
        

    }
}