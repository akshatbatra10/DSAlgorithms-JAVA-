/*
 Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(size == 1)
            return null;
        size = size - n;
        if(size == 0)
            return head.next;
        temp = head;
        for(int i = 0;i < size - 1;i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}