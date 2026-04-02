public class LinkedList_2 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;   // head stored inside LinkedList

    public void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void printList() {

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        LinkedList_2 list = new LinkedList_2();

        list.insertAtEnd(5);
        list.insertAtEnd(71);
        list.insertAtEnd(6);
        list.insertAtEnd(45);

        list.printList();
    }
}
