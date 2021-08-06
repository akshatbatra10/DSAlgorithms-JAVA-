/* You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself. */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        ListNode extra = null;
        int c = 0;
        while(l1!=null && l2!=null){
            ListNode temp = new ListNode();
            int value = l1.val + l2.val + c;
            if(value <= 9){
                temp.val = value;
                c=0;
            }
            else{
                int n = value % 10;
                temp.val = n;
                c=1;
            }
            temp.next=null;
            if(l3 == null){
                l3=extra=temp;
            }
            else{
                extra.next = temp;
                extra = temp;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            ListNode temp = new ListNode();
            int value = l1.val + c;
            if(value <= 9){
                temp.val = value;
                temp.next=null;
                c=0;
            }
            else{
                int n = value % 10;
                temp.val = n;
                temp.next = null;
                c=1;
            }
            extra.next = temp;
            extra = temp;
            l1 = l1.next;
        }
        while(l2!=null){
            ListNode temp = new ListNode();
            int value = l2.val + c;
            if(value <= 9){
                temp.val = value;
                temp.next=null;
                c=0;
            }
            else{
                int n = value % 10;
                temp.val = n;
                temp.next = null;
                c=1;
            }
            extra.next = temp;
            extra = temp;
            l2 = l2.next;
        }
        if(c==1){
            ListNode temp = new ListNode();
            temp.val = 1;
            temp.next=null;
            c=0;
            extra.next = temp;
            extra = temp;
        }
        return l3;
    }
}