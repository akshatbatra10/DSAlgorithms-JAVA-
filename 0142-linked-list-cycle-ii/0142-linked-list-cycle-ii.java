/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode meet = meetup(head);
        if (meet == null) {
            return null;
        }
        if (meet == head) {
            return head;
        }
        ListNode slow = head;
        while (slow.next != meet.next) {
            slow = slow.next;
            meet = meet.next;
        }
        return slow.next;
    }
    public ListNode meetup(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }
}