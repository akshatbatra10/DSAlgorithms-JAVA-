/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        return create(list, 0, list.size() - 1);
    }
    public TreeNode create(ArrayList<ListNode> list, int i, int j) {
        if (i > j) {
            return null;
        }
        int mid = i + (j - i) / 2;
        TreeNode nn = new TreeNode(list.get(mid).val);
        nn.left = create(list, i, mid - 1);
        nn.right = create(list, mid + 1, j);
        return nn;
    }
}