/*
 Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
*/

class Solution {
    public int longestValidParentheses(String s) {
        int res = 0;
        Stack<Integer> bracket = new Stack<>();
        bracket.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                bracket.push(i);
            } else {
                bracket.pop();
                if (bracket.empty()) {
                    bracket.push(i);
                } else {
                    res = Math.max(res, i - bracket.peek());
                }
            }
        }
        return res;
    }
}