/**leetcode 124 */

public class LC124 {
    public static int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] maxSum = new int[]{Integer.MIN_VALUE};
        maxPathDown(root, maxSum);
        return maxSum[0];
    }
}
