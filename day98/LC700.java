/**
🌲 WEEK 14 — Binary Search Tree (BST)
Day 98 – Introduction to BST
Concept: Ordered binary tree, left < root < right property.
Problem: Search in BST – LeetCode 700
Goal: Learn search & insertion rules.
 */

public class LC700 {
    static class TreeNode {
        int v;
        TreeNode left, right;
        TreeNode(int val){ this.v = val; }
    }
    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null){ return null;}

        if(val == root.v){
            System.out.println("found");
            return root;
        }else if(val < root.v){
            return searchBST(root.left, val);
        }else{
            return searchBST(root.right, val);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.println("found? "+searchBST(root,7));
        
    }
}
/**
Example 1:
Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]

Example 2:
Input: root = [4,2,7,1,3], val = 5
Output: []
 */