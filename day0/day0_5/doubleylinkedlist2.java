// Doubly Linked List
// Problem 2:
// How will you delete the last node in a doubly linked list?

public class doubleylinkedlist2 {
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

        Node temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.pre.next = null;

        while (temp.pre != null) {
            temp = temp.pre;
        }
        
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
