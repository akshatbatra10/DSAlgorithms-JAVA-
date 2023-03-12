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
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<>() {
            public int compare(ListNode l1, ListNode l2) {
                return l1.val - l2.val;
            }
        });
        for (ListNode nn : lists) {
            if (nn != null)
                pq.add(nn);
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (!pq.isEmpty()) {
            ListNode rn = pq.remove();
            temp.next = rn;
            temp = temp.next;
            if (rn.next != null) {
                pq.add(rn.next);
            }
        }
        return dummy.next;
    }
}