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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return create(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }
    public TreeNode create(int[] in, int ilo, int ihi, int[] post, int plo, int phi, HashMap<Integer, Integer> map) {
        if (plo > phi || ilo > ihi) {
            return null;
        }
        int i = map.get(post[phi]);
        TreeNode nn = new TreeNode(post[phi]);
        int nel = i - ilo;
        nn.left = create(in, ilo, i - 1, post, plo, plo + nel - 1, map);
        nn.right = create(in, i + 1, ihi, post, plo + nel, phi - 1, map);
        return nn;
    }
    public int search(int[] in, int si, int ei, int target) {
        for (int i = si; i <= ei; i++) {
            if (in[i] == target) {
                return i;
            }
        }
        return -1;
    }
}