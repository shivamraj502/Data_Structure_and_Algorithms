// Problem 1:
// Create a singly linked list with 5 numbers.
// How will you print the 3rd node?

public class singlylinkedlist_2 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        int count = 1;
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(16);
        head.next.next.next = new Node(17);
        head.next.next.next.next = new Node(18);

        Node temp = head;

        while (temp != null) {
            if(count == 3){
                System.out.println(temp.data);
                return;
            }else {count++;
            // System.out.println(temp.data);
            temp = temp.next;}
        }
    }
}
