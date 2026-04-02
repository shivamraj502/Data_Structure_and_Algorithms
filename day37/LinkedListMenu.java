/**
Day 37 – Mini-Project #5
Task: Implement a Linked List Menu
Insert, delete, search, reverse, print all elements.
Goal: Reinforce Week-5 topics in one program.
 */


//mistakes: i not created link for data1 Node

// package day37;
import java.util.Scanner;
public class LinkedListMenu {

    static Node head;          // mistakes: not declared static node head;

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void delete(int data){
        if(head == null) return;
        if(head.data == data){
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == data){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public static void search(int data){
        Node temp = head;
        boolean found = false;
        while(temp != null){
            if(temp.data == data){
                found = true;
                break;
            }
            temp = temp.next;
        }
        if(found) System.out.println("Found");
        else System.out.println("Not Found");
    }

    public static void reverse(){
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void menu(){
        Scanner in = new Scanner(System.in);
        int ch;
        do{
            System.out.print("1. Insert\n");
            System.out.print("2. Delete\n");
            System.out.print("3. Search\n");
            System.out.print("4. Reverse\n");
            System.out.print("5. Display\n");
            System.out.print("6. Exit\n");
            System.out.println("Enter choice");
            ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Insert data enter: ");
                    int n = in.nextInt();
                    insert(n);
                    break;
                case 2:
                    System.out.println("Delete data enter: ");
                    int d= in.nextInt();
                    delete(d);
                    break;
                case 3:
                    System.out.println("Search data enter: ");
                    int s= in.nextInt();
                    search(s);
                    break;
                case 4:
                    System.out.println("Reverse data: ");
                    reverse();
                    break;
                case 5:
                    System.out.println("Display data: ");
                    display();
                    break;
                case 6:
                    System.out.println("Exiting!");
                    break;
                default:
                    System.out.println("Enter valid choice.");
                    break;
            }
        }while(ch != 6);
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node tail = new Node(5);

        head.next=b;
        b.next=c;
        c.next=d;
        d.next=tail;

        menu();
    }
}


// import java.util.Scanner;
// public class LinkedListMenu {
//         public static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }

//     public static void insert(Node head,Node data1){
//         Node temp = head;
//         while(temp != null){
//             if(temp.next == null){
//                 temp.next=data1;
//                 data1.next=null;                            break;
//             }
//             temp=temp.next;
//         }

//     }

//     public static void delete(int data){
        
//     }

//     public static void search(int data){
        
//     }

//     public static void reverse(){
        
//     }

//     public static void display(Node head){
//         Node temp = head;
//         while(temp != null){
//                 // System.out.println("inserted:");
//                 System.out.print(temp.data+" ");
//             temp=temp.next;
//         }System.out.println();   
//     }

//     public static void menu(Node head){
//         Scanner in = new Scanner(System.in);
//         int ch;
//         do{
//             System.out.print("1. Insert\n");
//             System.out.print("2. Delete\n");
//             System.out.print("3. Search\n");
//             System.out.print("4. Reverse\n");
//             System.out.print("5. Display\n");
//             System.out.print("6. Exit\n");
//             System.out.println("Enter choice");
//             ch = in.nextInt();

//             switch (ch) {
//                 case 1:
//                     System.out.print("Insert data enter: ");
//                     int n = in.nextInt();
//                     Node i= new Node(n);
//                     insert( head,i);
//                     break;
//                 case 2:
//                     System.out.println("Delete data enter: ");
//                     int d= in.nextInt();
//                     delete(d);
//                     break;
//                 case 3:
//                     System.out.println("Search data enter: ");
//                     int s= in.nextInt();
//                     search(s);
//                     break;
//                 case 4:
//                     System.out.println("Reverse data: ");
//                     reverse();
//                     break;
//                 case 5:
//                     System.out.println("Display data: ");
//                     display(head);
//                     break;
//                 case 6:
//                     System.out.println("Exiting!");
//                     break;
            
//                 default:
//                     System.out.println("Enter valid choice.");
//                     break;
//             }
//         }while(ch != 6);
//     }
//     public static void main(String[] args) {
//         Node head = new Node(1);
//         Node b = new Node(2);
//         Node c = new Node(3);
//         Node d = new Node(4);
//         Node tail = new Node(5);

//         head.next=b;
//         b.next=c;
//         c.next=d;
//         d.next=tail;

//         // tail.pre=d;
//         // d.pre=c;
//         // c.pre=b;
//         // b.pre=head;

//         menu(head);
//     }
// }