// package HRDRoadmap.HRDvtp7.day6;
import java.util.*;
public class TreeNode {
    static class TreeNodes{
        int val;
        TreeNodes left;
        TreeNodes right;
    TreeNodes(){}
    TreeNodes(int val){ this.val = val;}
    TreeNodes(int val,TreeNodes left, TreeNodes right){
        this.val = val;
        this.left = left;
        this.right = right;
        }
    }
    public static void preorder(TreeNodes root){
        if(root == null){return;}
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(TreeNodes root){
        if(root == null){return;}
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void postorder(TreeNodes root){
        if(root == null){return;}
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    
    public static void main(String[] args) {
        TreeNodes root = new TreeNodes(1);
        new TreeNodes(2,new TreeNodes(4),new TreeNodes(5));
        new TreeNodes(3, null,new TreeNodes(7));

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
        
        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();
    }
}
