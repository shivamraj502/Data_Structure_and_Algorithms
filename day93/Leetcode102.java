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
    public static void inorder(TreeNode1 node, List<Integer> res){
        if(node == null){ return; }
        inorder(node.left,res);
        res.add(node.val);
        inorder(node.right, res);
    }
    public static List<List<Integer>> levelOrder(TreeNode1 node){
        List<List<Integer>> res = new ArrayList<>();
        if(node == null){ return res;}

        Queue<TreeNode1> q = new LinkedList<>();
        q.add(node);

        while(! q.isEmpty()){
            int levSize = q.size();
            List<Integer> currList = new ArrayList<>();

            for(int i=1;i<=levSize;i++){
                TreeNode1 curr = q.poll();
                currList.add(curr.val);
                
                if(curr.left != null){q.add(curr.left);}
                if(curr.right != null){q.add(curr.right);}
            }res.add(currList);
        }return res;
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

        // List<List<Integer>> levels = new ArrayList<>();
        // levelOrder(root,levels);
        List<List<Integer>> levels = levelOrder(root);
        System.out.println("Level order Trav: "+levels);
    }
}