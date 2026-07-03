// package HRDRoadmap.HRDvtp7.day5;
public class LC82 {             // not Done
    Node head;
    public static class Node{
        int val;
        Node next;
        Node(int val,Node next){
            this.val = val;
            this.next = null;
        }
        Node(int val){
            this.val = val;
        }
    }
    public static Node deleteDuplicates2(Node head) {
        Node dummy= new Node(0);
        dummy.next = head;

        Node pre = dummy;
        Node curr = head;

        while(curr != null){
            if(curr.next != null && curr.val == curr.next.val){
                while(curr.next != null && curr.val == curr.next.val){
                    curr = curr.next;
                }pre.next= curr.next;
            }else{
                pre=pre.next;
            }curr = curr.next;
        }return dummy.next;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);

        deleteDuplicates2(head);
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}

/**
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]
 */

/**     DOUBT
why its time complexity is O(n), i think n^2
 */