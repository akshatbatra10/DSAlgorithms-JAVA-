/*
 Merge two sorted linked lists and return it as a sorted list. 
 The list should be made by splicing together the nodes of the first two lists.
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode temp = l3;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                ListNode n = new ListNode(l1.val);
                temp.next = n;
                temp = n;
                l1 = l1.next;
            }
            else{
                ListNode n = new ListNode(l2.val);
                temp.next = n;
                temp = n;
                l2 = l2.next;
            }
        }
        while(l1!=null){
            ListNode n = new ListNode(l1.val);
            temp.next = n;
            temp = n;
            l1 = l1.next;
        }
        while(l2!=null){
            ListNode n = new ListNode(l2.val);
            temp.next = n;
            temp = n;
            l2 = l2.next;
        }
        return l3.next;
    }
}