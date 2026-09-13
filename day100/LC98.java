/**
Day 100 – Validation & Min/Max in BST
Problem: Validate BST – LeetCode 98
Goal: Learn range-based recursion.
 */

import java.util.*;
public class LC98{
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val){ this.val = val; }
    }
    public static boolean isValid2(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        inorder2(root, list);

        for(int i = 1; i < list.size(); i++){
            if(list.get(i) <= list.get(i - 1)){
                return false;
            }
        }return true;
    }
    public static void inorder2(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }

        inorder2(root.left, list);
        list.add(root.val);
        inorder2(root.right, list);
    }

    public static boolean isValid(TreeNode root){
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean check(TreeNode root, long min, long max){
        if(root == null) return true;

        if(root.val <= min || root.val >= max){return false;}

        return check(root.left,min,root.val) && check(root.right, root.val, max);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(8);
        
        System.out.println("isValid? "+isValid(root));
        System.out.println("isValid? "+isValid2(root));
    }
}