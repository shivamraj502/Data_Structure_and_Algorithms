// package HRDRoadmap.HRDvtp7.day5;
public class LC237 {        // not Done
    Node head;
    public static class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data = data;
            this.next = null;
        }
        Node(int data){
            this.data = data;
        }
    }
    public static void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(43);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        deleteNode(n2);
        Node temp = n2;
        while (temp != null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

// Mistakes:
/*
Syntax error: i written both data and val for value assignment in nodes.

*/