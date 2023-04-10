class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty()) {
                if (ch == ')' || ch == ']' || ch == '}') {
                    char x = st.pop();
                    if (ch == ')' && x == '(' || ch == ']' && x == '[' || ch == '}' && x == '{') {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
            st.push(ch);
        }
        return st.isEmpty();
    }
}