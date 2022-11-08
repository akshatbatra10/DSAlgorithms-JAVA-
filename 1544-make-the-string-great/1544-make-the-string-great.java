class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!st.isEmpty() && (st.peek() == (c + 32) || st.peek() == (c - 32))) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        
        return sb.reverse().toString();
    }
}