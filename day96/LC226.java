/**
Day 96 – Mirror / Invert Tree
Concept: Swap left and right recursively.
Problem: Invert Binary Tree – LeetCode 226
Goal: Recursive tree transformation.
 */

public class LC226{
    static class Tree{
        int val;
        Tree left,right;
        Tree(int val){
            this.val=val;
        }
    }
    public static Tree invert(Tree root){
        if(root == null) return null;

        Tree temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invert(root.right);
        invert(root.left);
        return root;
    }
    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);

        System.out.println("tree: "+invert(root));
    }
}

/**
Example 1:
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
Example 2:
Input: root = [2,1,3]
Output: [2,3,1]
Example 3:
Input: root = []
Output: []
 */