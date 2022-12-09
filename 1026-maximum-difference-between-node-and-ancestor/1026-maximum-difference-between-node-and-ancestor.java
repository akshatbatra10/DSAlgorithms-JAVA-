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
    int v = 0;
    public int maxAncestorDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }
        v = 0;
        findDiff(root, root.val, root.val);
        return v;
    }
    public void findDiff(TreeNode root, int min, int max) {
        if (root == null) {
            return;
        }
        int ans = Math.max(Math.abs(root.val - min), Math.abs(root.val - max));
        v = Math.max(v, ans);
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        findDiff(root.left, min, max);
        findDiff(root.right, min, max);
    }
}