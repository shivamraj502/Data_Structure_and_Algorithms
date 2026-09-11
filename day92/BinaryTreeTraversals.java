/**
Day 92 – Tree Traversals (Recursive)
Concept: Preorder, Inorder, Postorder traversals.
Problem: BinaryTreeTraversals – GFG
Goal: Understand depth-first traversal order.
*/

import java.util.*;
public class BinaryTreeTraversals {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val){
             this.val = val; 
        }
    }

    // Inorder: Left -> Root -> Right
    public static void inorder(TreeNode node, List<Integer> result){
        if(node == null) return;
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }

    // Preorder: Root -> Left -> Right
    public static void preorder(TreeNode node, List<Integer> result){
        if(node == null) return;
        result.add(node.val);
        preorder(node.left, result);
        preorder(node.right, result);
    }

    // Postorder: Left -> Right -> Root
    public static void postorder(TreeNode node, List<Integer> result){
        if(node == null) return;
        postorder(node.left, result);
        postorder(node.right, result);
        result.add(node.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> in = new ArrayList<>();
        inorder(root, in);
        System.out.println("Inorder:   " + in);
        
        List<Integer> pre = new ArrayList<>();
        preorder(root, pre);
        System.out.println("Preorder:  " + pre);

        List<Integer> post = new ArrayList<>();
        postorder(root, post);
        System.out.println("Postorder: " + post);
    }
}