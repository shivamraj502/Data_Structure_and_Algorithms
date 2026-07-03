// package HRDRoadmap.HRDvtp7.day5;
public class LC206 {
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
    public static Node reverseList(Node head) {
        Node curr = head;
        Node pre = null;
        Node next;
        while(curr != null){    // 1 -> 2 -> 3
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }return pre;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        Node res = reverseList(n1);

        while (res != null) {
            System.out.println(res.data);
            res=res.next;
        }
    }
}
