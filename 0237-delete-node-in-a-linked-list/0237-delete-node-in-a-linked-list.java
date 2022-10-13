/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr = node;
        ArrayList<Integer> list = new ArrayList<>();
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        int i = 1;
        curr = node;
        while (curr.next.next != null) {
            curr.val = list.get(i);
            i++;
            curr = curr.next;
        }
        curr.val = list.get(i);
        curr.next = null;
    }
}