class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int si = 0;
        int ei = 0;
        for (int i = 0; i < s.length(); i++) {
            int len = Math.max(palindrome(s, i, i), palindrome(s, i, i + 1));
            if (len > ei - si) {
                si = i - (len - 1) / 2;
                ei = i + len / 2;
            }
        }
        return s.substring(si, ei + 1);
    }
    public int palindrome(String s, int i, int j) {
        while (j < s.length() && i >= 0 && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
    }
}