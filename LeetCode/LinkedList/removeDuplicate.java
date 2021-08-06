/*
 Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 Return the linked list sorted as well.
 */

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode prev = head;
        ListNode temp = head.next;;
        while(temp != null){
            if(prev.val == temp.val) {
                prev.next = temp.next;
                temp = temp.next;
            }
            else {
                temp = temp.next;
                prev = prev.next;
            }
        }
        return head;
    }
}