/**
Day 93 – Level Order Traversal (BFS)
Concept: Queue-based traversal.
Problem: Binary Tree Level Order Traversal – LeetCode 102
Goal: Understand breadth-first logic.
 */

import java.util.*;
public class Leetcode102{
    public static class TreeNode1{
        int val;
        TreeNode1 left,right;
        TreeNode1(int val){
            this.val=val;
        }
    }
    public static void inorder(TreeNode1 root, List<Integer> res){
        if(root == null){ return; }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right, res);
    }

    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.right = new TreeNode1(3);
        root.left.left = new TreeNode1(4);
        root.left.right = new TreeNode1(5);

        List<Integer> in = new ArrayList<>();
        inorder(root,in);
        System.out.println("inorder trav: "+in);
    }
}