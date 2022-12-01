class Solution {
    public boolean halvesAreAlike(String s) {
        int half = s.length() / 2;
        String str = s.substring(0, half);
        s = s.substring(half, s.length());
        
        int a = nov(str);
        int b = nov(s);
        
        return a == b;
    }
    public int nov(String s) {
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        
        return count;
    }
}