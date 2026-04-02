// Singly Linked List
// Problem 1:
// Create a singly linked list with 5 numbers.
// How will you print the 3rd node?

// wrong
// import java.util.*;
// public class Singlylinkedlist {
//     public static class Node{
//         int data;
//         Node next;
//     Node(int data){
//         this.data=data;
//         this.next= null;
//     }
// }
//     public static void main(String[] args) {
//         Node head = new Node(10);
//         Node second = new Node(15);
//         Node third = new Node(16);
//         Node fourth = new Node(17);
//         Node fifth = new Node(18);

//         head.next = second;
//         second.next = third;
//         third.next = fourth;
//         fourth.next = fifth;

//         Node temp = head;
//         while(temp.next!=null){
//             System.out.println(temp.data);
//             temp = temp.next;
//         }
//     }
// }


import java.util.*;
public class singlylinkedlist {

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
        Node second = new Node(15);
        Node third = new Node(16);
        Node fourth = new Node(17);
        Node fifth = new Node(18);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Node temp = head;

        while (temp != null) {
            if(count == 3){
                System.out.println(temp.data);
                return;
            }else count++;
            // System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
