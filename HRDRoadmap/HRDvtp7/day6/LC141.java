// package HRDRoadmap.HRDvtp7.day6;
public class LC141 {
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
    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        
        if(head == null){return false;}
        while(fast != null && fast.next != null){   // dont use slow because it cant reach before fast so, only use fast to compare with null
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){   // slow.val == fast.val will error because it will compare object
                return true;
            }
        }return false;
        
        // ListNode slow = head;
        // ListNode fast = head;
        
        // while(fast != null && fast.next != null){ // running
        //     slow = slow.next;
        //     fast = fast.next.next;
        //     if(slow == fast){return true;}
        // }return false;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(43);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        System.out.println(hasCycle(head));
    }
}

/* Mistekes:
    1. dont use slow because it cant reach before fast so, only use fast to compare with null
    2. slow.val == fast.val will give error because it will compare like object

    */