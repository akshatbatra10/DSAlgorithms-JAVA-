class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        ArrayList<String> list = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else {
                list.add(sb.toString());
                sb = new StringBuilder();
                while (s.charAt(i) == ' ') {
                    i++;
                }
                sb.append(s.charAt(i));
            }
        }
        list.add(sb.toString());
        sb = new StringBuilder();
        
        for (int i = list.size() - 1; i > 0; i--) {
            sb.append(list.get(i) + " ");
        }
        sb.append(list.get(0));
        
        return sb.toString();
    }
}