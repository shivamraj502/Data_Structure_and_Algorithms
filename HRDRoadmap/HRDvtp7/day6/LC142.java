// package HRDRoadmap.HRDvtp7.day6;
public class LC142 {
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
    public static Node hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){   // dont use slow because it cant reach before fast so, only use fast to compare with null
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){   // slow.val == fast.val will error because it will compare object
                fast = head;
                // System.out.println(".");
                break;
            }

            // while(slow != fast){     //Mistakes
            //     slow = slow.next;
            //     fast = fast.next;
            //     if(slow==fast){return slow;}
            // }
        }
        while(slow != fast){
                slow = slow.next;
                fast = fast.next;
                if(slow==fast){return slow;}
        }
        return null;
    }
    public static Node hasCycle2(Node head) {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){   // dont use slow because it cant reach before fast so, only use fast to compare with null
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){   // slow.val == fast.val will error because it will compare object
                fast = head;
                // System.out.println(".");
                break;
            }

            // while(slow != fast){     //Mistakes
            //     slow = slow.next;
            //     fast = fast.next;
            //     if(slow==fast){return slow;}
            // }
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
                if(slow==fast){return slow;}
        }
    }return null;
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

        Node res = hasCycle(head);
        System.out.println(res.data);
    }
}


// 2,19 LC HOMEWORK