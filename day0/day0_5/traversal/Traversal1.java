// Traversal
// Problem 1:// How will you print only even numbers from a linked list?

public class Traversal1 {
    static class Node{
            int data;
            Node next;
            Node(int data){
                this.data= data;
                this.next=null;
            }
        }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(11);
        head.next.next = new Node(17);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(14);
        // head.next.next.next.next = head;

        Node temp = head;
        do{
            if(temp.data % 2 ==0){
                System.out.print(temp.data +" ");
            }temp=temp.next;
        }while(temp != null);
    }
}
