/**
Day 103 – Convert Sorted Array to BST
Problem: Sorted Array to BST – LeetCode 108
Goal: Understand balanced BST construction.
 */

public class LC108{
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val){ this.val = val; }
    }
    public static TreeNode toBst(int [] nums){
        return createTree(nums,0,nums.length-1);
    }
    public static TreeNode createTree(int [] nums,int low,int high){
        if(low > high)return null;

        int mid = low + (high-low)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createTree(nums, low, mid-1);
        root.right = createTree(nums, mid+1, high);
        return root;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,7,8,9};
        
        System.out.println("to BST: "+ toBst(nums));
    }
}