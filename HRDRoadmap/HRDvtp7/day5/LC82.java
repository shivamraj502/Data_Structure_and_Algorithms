// package HRDRoadmap.HRDvtp7.day5;
public class LC82 {
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
    public static Node deleteDuplicates(Node head) {
        if(head == null || head.next == null)return head;
        
        Node temp = head;
        while(temp != null && temp.next != null){
            if(temp.next.data == temp.data){
                temp.data = temp.next.data;
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }return head;

    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);

        deleteDuplicates(head);
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

/**
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]
 */