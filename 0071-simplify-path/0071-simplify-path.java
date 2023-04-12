class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        Stack<String> st = new Stack<>();
        
        String[] sp = path.split("/");
        
        for (String s : sp) {
            if (s.equals("..")) {
                if (!st.isEmpty())
                    st.pop();
            } else if (s.equals(".") || s.equals("")) {
                continue;
            } else {
                st.push(s);
            }
        }
                
        for (String s : st) {
            sb.append("/");
            sb.append(s);
        }
        
        if (sb.isEmpty()) {
            sb.append("/");
        }
        
        return sb.toString();
    }
}