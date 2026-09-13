/**
Day 99 – Insertion & Deletion in BST
Concept: Handle all three deletion cases.
Problem: Delete Node in BST – LeetCode 450
Goal: Understand recursive deletion logic.
 */

public class LC450{
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val){ this.val = val; }
    }
    public static TreeNode deleteNode(TreeNode root, int key) {

        if(root == null){return null;}

        // Search in left subtree
        if(key < root.val){
            root.left = deleteNode(root.left, key);
        }

        // Search in right subtree
        else if(key > root.val){
            root.right = deleteNode(root.right, key);
        }

        // Node found
        else {

            // Case 1: No left child
            if(root.left == null){
                return root.right;
            }

            // Case 2: No right child
            if(root.right == null){
                return root.left;
            }

            // Case 3: Two children
            TreeNode successor = root.right;

            while(successor.left != null){
                successor = successor.left;
            }

            root.val = successor.val;

            root.right = deleteNode(root.right, successor.val);
        }return root;
    }
    public static void inorder(TreeNode root){
        if(root == null) return ;

        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(8);
        
        System.out.print("before deletion: ");
        inorder(root);
        System.out.println();

        int d =3;
        root = deleteNode(root,d);

        System.out.print("after deletion: ");
        inorder(root);
    }
}

/**
Example 1:
Input: root = [5,3,6,2,4,null,7], key = 3
Output: [5,4,6,2,null,null,7]
Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.
One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.

Example 2:
Input: root = [5,3,6,2,4,null,7], key = 0
Output: [5,3,6,2,4,null,7]
Explanation: The tree does not contain a node with value = 0.

Example 3:
Input: root = [], key = 0
Output: []
 
 */