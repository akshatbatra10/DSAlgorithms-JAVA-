/*
 Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

 Implement the MinStack class:

 1) MinStack() initializes the stack object.
 2) void push(val) pushes the element val onto the stack.
 3) void pop() removes the element on the top of the stack.
 4) int top() gets the top element of the stack.
 5) int getMin() retrieves the minimum element in the stack.
*/

class MinStack {

    /** initialize your data structure here. */
    ListNode top;
    class ListNode {
        ListNode next;
        int val; 
        int min;
        
        ListNode(int val) {
            this.val = val;
            min = 0;
        }
    }
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        ListNode temp = new ListNode(val);
        if(top == null) {
            temp.min = val;
            top = temp;
        }
        else {
            temp.min = Math.min(top.min, val);
            ListNode n = top;
            top = temp;
            temp.next = n;
        }
    }
    
    public void pop() {
        if(top == null) {
            return;
        }
        top = top.next;
    }
    
    public int top() {
        return top.val;
    }
    
    public int getMin() {
        return top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */