// package HRDRoadmap.HRDvtp7.day5;
public class LC876 {        // can do it using slow and fast pointers
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
    public static Node middle(Node head){
        Node temp = head;
        int count = 0;
        
        if(head.next==null) return head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        int i =0;
        Node temp2 = head;
        while(i <= count/2){
            i++;
            temp2 = temp2.next;
            if(i==count/2) {return temp2;}
        }
        return null;
    }
    public static void main(String[] args) {
        // Node n1 = new Node(1,n2);    // Mistakes: created nodes of links to next node
        // Node n2 = new Node(2,n3);
        // Node n3 = new Node(3,null);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        Node res = middle(n1);
        System.out.println(res.data);
    }
}
