/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maximum = 0;
    public int maxPathSum(TreeNode root) {
        maximum = Integer.MIN_VALUE;
        findMax(root);
        return maximum;
    }
    public int findMax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int left = findMax(root.left);
        int right = findMax(root.right);
        int max = Math.max(left, right);
        if (max < 0) {
            maximum = Math.max(maximum, root.val);
            return root.val;
        } else {
            int val = root.val;
            if (left > 0) {
                val += left;
            }
            if (right > 0) {
                val += right;
            }
            maximum = Math.max(maximum, val);
            return root.val + max;
        }
    }
}