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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode current = head;
        ListNode nextAdd = current.next;
        head = head.next;
        while(nextAdd != null){
            current.next = nextAdd.next;
            nextAdd.next = current;
            if(prev != null)
                prev.next = nextAdd;
            prev = current;
            current = current.next;
            if(current != null)
                nextAdd = current.next;
            else
                nextAdd = current;
        }
        return head;
    }
}