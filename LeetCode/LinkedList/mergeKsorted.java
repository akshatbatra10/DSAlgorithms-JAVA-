/*
 You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

 Merge all the linked-lists into one sorted linked-list and return it.
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp!=null){
                list.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(list);
        ListNode temp = head;
        for(int i=0;i<list.size();i++){
            ListNode n = new ListNode(list.get(i));
            temp.next = n;
            temp = n;
        }
        return head.next;
    }
}