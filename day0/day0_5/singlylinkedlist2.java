// Problem 2:
// How will you find the length of a singly linked list?

public class singlylinkedlist2 {
    static class Node{
        int data;
        Node next;
    Node(int data){
        this.data= data;
        this.next= null;
    }}
    public static void main(String[] args) {
        int count = 0;
        Node head = new Node(10);
        Node second = new Node(11);
        Node third = new Node(12);
        Node fourth = new Node(13);
        Node fifth = new Node(14);

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        Node temp= head;

        while (temp != null) {
            System.out.println(temp.data);
            temp= temp.next;
            count++;
        }System.out.println("Length of list is:"+ count);
    }
}
