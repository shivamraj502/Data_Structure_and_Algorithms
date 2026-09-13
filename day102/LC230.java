import java.util.ArrayList;

/**
Day 102 – Kth Smallest / Largest in BST
Problem: Kth Smallest Element – LeetCode 230
Goal: Use inorder traversal properties.
 */

public class LC230{
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val){ this.val = val; }
    }
    public static int kthSmallest(TreeNode root,int k){
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root,list);
        return list.get(k-1);
    }
    public static void inOrder(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(8);
        
        System.out.println("lowest node: "+ kthSmallest(root,5));
    }
}
/**
Example 1:
Input: root = [3,1,4,null,2], k = 1
Output: 1

Example 2:
Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3
 */