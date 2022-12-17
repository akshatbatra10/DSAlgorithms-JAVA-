class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!Character.isDigit(tokens[i].charAt(0))) {
                if (tokens[i].length() != 1) {
                    st.push(Integer.parseInt(tokens[i]));
                    continue;
                }
                int b = st.pop();
                int a = st.pop();
                char ch = tokens[i].charAt(0);
                if (ch == '+') {
                    st.push(a + b);
                } else if (ch == '-') {
                    st.push(a - b);
                } else if (ch == '/') {
                    st.push(a / b);
                } else {
                    st.push(a * b);
                }
            } else {
                st.add(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}