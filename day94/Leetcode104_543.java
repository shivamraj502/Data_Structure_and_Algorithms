/**
Day 94 – Height and Diameter of Binary Tree
Concept: Use recursion to find height and longest path.
Problems:
Maximum Depth – LeetCode 104
Diameter – LeetCode 543
Goal: Learn nested recursion.
 */

import java.util.*;
public class Leetcode104_543{
    static class Tree{
        int data;
        Tree left,right;
        Tree(int data){
            this.data=data;
        }
    }
    public static int height(Tree node){
        List<List<Integer>> levels = new ArrayList<>();
        if(node == null){return levels.size();}

        Queue<Tree> q = new LinkedList<>();
        q.add(node);

        while(!q.isEmpty()){
            int qSize = q.size();
            List<Integer> currList = new ArrayList<>();

            for(int i=0;i<qSize;i++){
                Tree curr = q.poll();
                currList.add(curr.data);

                if(curr.left != null){q.add(curr.left);}
                if(curr.right != null){q.add(curr.right);}
            }levels.add(currList);
        }return levels.size();
    }
    
    static int maxDiameter =0;
    public static int diameter(Tree node){
        maxDiameter = 0;
        height2(node);
        return maxDiameter;
    }
    public static int height2(Tree node){
        if(node == null){ return 0;}

        int leftHeight = height2(node.left);
        int rightHeight = height2(node.right);

        maxDiameter = Math.max(maxDiameter, rightHeight+leftHeight);
        return 1+Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        
        // Tree root = new Tree(1);
        // root.left = new Tree(2);
        // root.right = new Tree(3);
        // root.left.left = new Tree(4);
        // root.left.right = new Tree(5);

        System.out.println("height: "+height(root));
        System.out.println("diameter: "+diameter(root));
    }
}

/**
 * 104
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3

Example 2:
Input: root = [1,null,2]
Output: 2

 *543
Example 1:
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

Example 2:
Input: root = [1,2]
Output: 1
 */