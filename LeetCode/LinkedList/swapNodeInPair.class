/*
 Given a linked list, swap every two adjacent nodes and return its head.
 You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
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