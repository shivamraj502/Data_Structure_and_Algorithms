/*
🧭 Days 91–120 Roadmap: Trees, BST, Heaps & Graphs
🌳 WEEK 13 — Binary Trees (Foundation)

Day 91 – Introduction to Binary Tree
Concept: Node structure, parent-child relationship, levels.
Implement: TreeNode class and basic insertion.
Problem: Binary Tree Introduction – GFG
Goal: Understand structure representation.
 */

// First Attempt
// public class BinaryTree{
//     int data;
//     BinaryTree left;
//     BinaryTree right;
    
//     BinaryTree(int data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
//     public static void main(String[] args) {
//         BinaryTree root = new BinaryTree(5);
//         System.out.println(root.data);
//         BinaryTree root2 = new BinaryTree(15);
//         System.out.println(root2.data);
//         BinaryTree root3 = new BinaryTree(51);
//         System.out.println(root3.data);
//     }
// }

// Second Attempt
import java.util.*;
public class BinaryTree{
    int data;
    BinaryTree left;
    BinaryTree right;
    
    BinaryTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }static BinaryTree root;

    public static void insert(int data) {
        BinaryTree newNode = new BinaryTree(data);
        if (root == null) {
            root = newNode;
            return;
        }
        Queue<BinaryTree> q = new LinkedList<>();
        q.add(root);

        while(!(q.isEmpty())){
            BinaryTree curr = q.poll();

            if(curr.left == null){
                curr.left = newNode;
                return;
            }else{
                q.add(curr.left);
            }

            if(curr.right == null){
                curr.right = newNode;
                return;
            }else{
                q.add(curr.right);
            }
        }
    }
    public static void printLevelOrder(){
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }

        Queue<BinaryTree> q = new LinkedList<>();
        q.add(root);

        while(! q.isEmpty()){
            int levSize = q.size();
            for(int i =0; i<levSize;i++){
                BinaryTree curr = q.poll();
                System.out.print(curr.data+" ");
                
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }System.out.println();
            3.
        }
    }

    public static void main(String[] args) {
        int [] val = {1,2,3,4,5,6,7,8};
        for(int i : val){
            insert(i);
        }

        System.out.println("Level Order Traversal of binary tree is :");
        printLevelOrder();
    }
}