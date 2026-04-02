// Day 35 – Middle & Cycle Detection
// Concept: Fast/slow pointer approach (Floyd’s Cycle).
// Problems: 
// Middle of the Linked List – LeetCode 876
// Linked List Cycle – LeetCode 141
// Goal: Master two-pointer technique.

// package day35;
public class MiddleoftheLinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node findMiddleNode(Node head){
        int count =0;
        int n=0;
        Node temp = head;
        Node temp2 = head;

        while(temp != null){
            System.out.print(temp.data+ " ");
            count++;
            temp=temp.next;
        }System.out.println();

        while(temp2 != null){
            if(n == (count/2)){
                return temp2;           
            }temp2=temp2.next;
            n++;
        }return temp2;           
    }
    
    public static void main(String[] args){
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node newNode = new Node(6);
        Node tail = new Node(5);

        head.next=second;
        second.next=third;
        third.next=fourth;
        // fourth.next=newNode;
        // newNode.next=tail;
        fourth.next=tail;

        Node middleNode = findMiddleNode(head);
        System.out.println("Middle Node is: " + middleNode.data);

        System.out.print("List: ");
        while(middleNode != null){
            System.out.print(middleNode.data +" ");
            middleNode = middleNode.next;
        }System.out.println();
    }
}