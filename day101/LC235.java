/**
Day 101 – Lowest Common Ancestor (LCA)
Problem: LCA in BST – LeetCode 235
Goal: Learn BST traversal decision-making.
 */

public class LC235{
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val){ this.val = val; }
    }
    public static int lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }

        if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }return root.val;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(8);
        
        System.out.println("lowest node: "+ lowestCommonAncestor(root,root.left,root.right));
    }
}
/**
Example 1:
Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.

Example 2:
Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2
Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.

Example 3:
Input: root = [2,1], p = 2, q = 1
Output: 2
 */