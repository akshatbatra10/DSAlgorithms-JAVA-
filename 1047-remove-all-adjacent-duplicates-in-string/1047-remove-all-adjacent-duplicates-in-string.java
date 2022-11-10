class Solution {
    public String removeDuplicates(String s) {
        char[] ch = new char[s.length()];
        int k = -1;
        for(char c: s.toCharArray()) {
            if(k >= 0 && ch[k] == c)
                k--;
            else
                ch[++k] = c;
        }
        return String.valueOf(ch, 0, k+1);
    }
}