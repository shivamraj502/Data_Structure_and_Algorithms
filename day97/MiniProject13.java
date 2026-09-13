/**
Day 97 – Mini Project #13
Task: Build a Binary Tree Console Visualizer
Insert nodes, display level order, height, diameter.
Goal: Reinforce traversal and recursion logic.
 */

import java.util.*;
public class MiniProject13 {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val){ this.val = val; }
    }

    TreeNode root;
    int maxDiameter;

    // ---------- INSERT (level-order, Day 91 pattern) ----------
    public void insert(int val){
        TreeNode newNode = new TreeNode(val);
        if(root == null){ root = newNode; return; }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode current = queue.poll();

            if(current.left == null){ current.left = newNode; return; }
            else queue.add(current.left);

            if(current.right == null){ current.right = newNode; return; }
            else queue.add(current.right);
        }
    }

    // ---------- LEVEL ORDER DISPLAY (Day 93 pattern) ----------
    public List<List<Integer>> levelOrder(){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for(int i = 0; i < levelSize; i++){
                TreeNode current = queue.poll();
                currentLevel.add(current.val);
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
            result.add(currentLevel);
        }
        return result;
    }

    // ---------- HEIGHT (Day 94/104 pattern) ----------
    public int height(){
        return heightHelper(root);
    }
    private int heightHelper(TreeNode node){
        if(node == null) return 0;
        return 1 + Math.max(heightHelper(node.left), heightHelper(node.right));
    }

    // ---------- DIAMETER (Day 94/543 pattern) ----------
    public int diameter(){
        maxDiameter = 0;
        diameterHelper(root);
        return maxDiameter;
    }
    private int diameterHelper(TreeNode node){
        if(node == null) return 0;
        int left = diameterHelper(node.left);
        int right = diameterHelper(node.right);
        maxDiameter = Math.max(maxDiameter, left + right);
        return 1 + Math.max(left, right);
    }

    // ---------- BONUS: visual console print (plain ASCII) ----------
    public void printTreeShape(){
        printTreeShape(root, "", true);
    }
    private void printTreeShape(TreeNode node, String prefix, boolean isTail){
        if(node == null) return;
        System.out.println(prefix + (isTail ? "`-- " : "|-- ") + node.val);
        List<TreeNode> children = new ArrayList<>();
        if(node.left != null) children.add(node.left);
        if(node.right != null) children.add(node.right);

        for(int i = 0; i < children.size(); i++){
            boolean last = (i == children.size()-1);
            printTreeShape(children.get(i), prefix + (isTail ? "    " : "|   "), last);
        }
    }

    public static void main(String[] args) {
        MiniProject13 tree = new MiniProject13();

        int[] values = {1, 2, 3, 4, 5, 6, 7};
        for(int v : values) tree.insert(v);

        System.out.println("=== Tree Shape ===");
        tree.printTreeShape();

        System.out.println("\n=== Level Order ===");
        System.out.println(tree.levelOrder());

        System.out.println("\n=== Height ===");
        System.out.println(tree.height());

        System.out.println("\n=== Diameter ===");
        System.out.println(tree.diameter());
    }
}