public class LC104 {        //excalidraw.com/leetcode/104/maximum-depth-of-binary-tree
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
    public int maxDepth(TreeNode root) {
        if(root == null){return 0;}
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public static void main(String[] args) {
        TreeNodes root = new TreeNodes(1);
        new TreeNodes(2,new TreeNodes(4),new TreeNodes(5));
        new TreeNodes(3, null,new TreeNodes(7));

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();
    }
}
