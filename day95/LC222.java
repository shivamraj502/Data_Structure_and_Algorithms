/**
Day 95 – Count Nodes and Sum of Nodes
Problem: Count Complete Tree Nodes – LeetCode 222
Goal: Practice recursive aggregation.
 */

import java.util.*;
public class LC222{
    static class Tree{
        int val;
        Tree left,right;
        Tree(int val){
            this.val=val;
        }
    }
    public static int nodes(Tree node){
        if(node == null){ return 0;}
        Queue<Tree> q = new LinkedList<>();
        q.add(node);
        int max = 0;

        while(!q.isEmpty()){
            int qSize = q.size();
            List<Integer> currList = new ArrayList<>();
            for(int i=1;i<=q.size();i++){
                Tree curr = q.poll();
                currList.add(curr.val);
                
                if(curr.left != null){q.add(curr.left);}
                if(curr.right != null){q.add(curr.right);}
            }max += currList.size();
        }return max;
    }
    
    static int count =0;
    public static int inorder(Tree node){
        count =0;
        helper(node);
        return count;
    }      
    public static void helper(Tree node){
        if(node == null){ return;}
        count+=1;
        helper(node.left);
        helper(node.right);
    }
    
    public static int countNodes(Tree node){
        if(node == null){return 0;}
        return 1+countNodes(node.left)+countNodes(node.right);
    }

    public static int countNodes2(Tree root) {

        if(root == null){
            return 0;
        }

        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);

        // Perfect binary tree
        if(leftHeight == rightHeight){
            return (1 << leftHeight) - 1;
        }return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public static int getLeftHeight(Tree root){
        int height = 0;
        while(root != null){
            height++;
            root = root.left;
        }return height;
    }
    public static int getRightHeight(Tree root){
        int height = 0;
        while(root != null){
            height++;
            root = root.right;
        }return height;
    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);

        System.out.println("Level order Trav: "+nodes(root));
        System.out.println("Inorder Trav: "+inorder(root));
        System.out.println("simple Trav: "+countNodes(root));
        System.out.println("simple Trav2: "+countNodes2(root));
    }
}

/**
That's the optimization.
Easy way to remember
Second code:
"Count every node."
First code:
"If I can calculate the whole subtree at once, don't visit every node."
 */