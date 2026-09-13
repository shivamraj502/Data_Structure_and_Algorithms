/**
Day 104 – Mini Project #14
Task: Implement a Student Record System using BST
Insert roll number, search, delete, and list in order.
Goal: Apply BST practically.
 */

public class Miniproject14 {
    static class Node {
        int rollNo;
        Node left, right;
        Node(int rollNo) {
            this.rollNo = rollNo;
        }
    }

    static Node root = null;

    // 1. Insert
    public static Node insert(Node root, int rollNo) {

        if (root == null) {
            return new Node(rollNo);
        }

        if (rollNo < root.rollNo) {
            root.left = insert(root.left, rollNo);
        }
        else if (rollNo > root.rollNo) {
            root.right = insert(root.right, rollNo);
        }

        return root;
    }

    // 2. Search
    public static boolean search(Node root, int rollNo) {
        if (root == null) {
            return false;
        }

        if (root.rollNo == rollNo) {
            return true;
        }

        if (rollNo < root.rollNo) {
            return search(root.left, rollNo);
        }return search(root.right, rollNo);
    }

    // 3. Delete
    public static Node delete(Node root, int rollNo) {
        if (root == null) {
            return null;
        }
        if (rollNo < root.rollNo) {
            root.left = delete(root.left, rollNo);
        }
        else if (rollNo > root.rollNo) {
            root.right = delete(root.right, rollNo);
        }
        else {
            // No left child
            if (root.left == null) {
                return root.right;
            }

            // No right child
            if (root.right == null) {
                return root.left;
            }

            // Two children
            Node successor = root.right;
            while (successor.left != null) {
                successor = successor.left;
            }

            root.rollNo = successor.rollNo;
            root.right = delete(root.right, successor.rollNo);
        }return root;
    }

    // 4. List in sorted order
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.rollNo + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        // Insert students
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
        root = insert(root, 80);

        // List students
        System.out.println("Students in sorted order:");
        inorder(root);

        // Search
        int searchRoll = 40;

        if (search(root, searchRoll)) {
            System.out.println("\nRoll No " + searchRoll + " found.");
        }
        else {
            System.out.println("\nRoll No " + searchRoll + " not found.");
        }

        // Delete
        int deleteRoll = 30;

        root = delete(root, deleteRoll);

        System.out.println("After deleting " + deleteRoll + ":");
        inorder(root);
    }
}
/**

 */