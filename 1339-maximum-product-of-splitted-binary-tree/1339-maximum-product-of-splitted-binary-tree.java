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
    long sum = 0;
    long max = 0;
    int mod = 1000000007;
    public int maxProduct(TreeNode root) {
        sum = 0;
        calSum(root);
        max = 0;
        findMaxProd(root);
        return (int) (max % mod);
    }
    public long findMaxProd(TreeNode root) {
        if (root == null) {
            return 0;
        }
        long left = findMaxProd(root.left);
        long right = findMaxProd(root.right);
        long leftProd = (left * (sum - left));
        long rightProd = (right * (sum - right));
        max = Math.max(max, Math.max(leftProd, rightProd));
        return left + right + root.val;
    }
    public void calSum(TreeNode root) {
        if (root == null) {
            return;
        }
        sum += root.val;
        calSum(root.left);
        calSum(root.right);
    }
}