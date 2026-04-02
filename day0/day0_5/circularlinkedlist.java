// Circular Linked List
// Problem 1:
// How will you stop traversal in a circular linked list without infinite loop?

public class circularlinkedlist {
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

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = head;

        Node temp = head;
        int count=0;
        do {    
             System.out.println(temp.data);        
             temp = temp.next;
             count++;
        }while (count != 7);

        // do {
        //      System.out.println(temp.data);
        //      temp = temp.next;
        //      count++;
        // }while (temp != head);
    }
}

