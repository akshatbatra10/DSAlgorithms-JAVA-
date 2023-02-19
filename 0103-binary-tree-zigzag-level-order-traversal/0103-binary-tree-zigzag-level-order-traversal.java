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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        int level = 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            List<Integer> ll = new ArrayList<>();
            int size = queue.size();
            
            while (size-- > 0) {
                TreeNode rn = queue.remove();
                ll.add(rn.val);
                if (rn.left != null) {
                    queue.add(rn.left);
                }
                if (rn.right != null) {
                    queue.add(rn.right);
                }
            }
            
            if (level % 2 != 0) {
                Collections.reverse(ll);
            }
            ans.add(ll);
            level++;
        }
        
        return ans;
    }
}