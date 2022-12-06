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
    public ListNode oddEvenList(ListNode head) {
      if (head == null || head.next == null) {
        return head;
      }
      ListNode odd = head;
      ListNode even = head.next.next;
      ListNode prev = head.next;
      int count = 3;
      while (even != null) {
        prev.next = even.next;
        even.next = odd.next;
        odd.next = even;
        odd = odd.next;
        int c = 0;
        while (even != null && c < count) {
          even = even.next;
          c++;
        }
        while (prev.next != even) {
          prev = prev.next;
        }
        count++;
      }
      return head;
    }
}