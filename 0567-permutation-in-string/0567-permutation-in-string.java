class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1Char = new int[26];
        int[] s2Char = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Char[s1.charAt(i) - 'a'] += 1;
            s2Char[s2.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < s2.length() - s1.length() ; i++) {
            if (contains(s1Char, s2Char)) {
                return true;
            }
            s2Char[s2.charAt(i + s1.length()) - 'a'] += 1;
            s2Char[s2.charAt(i) - 'a'] -= 1;
        }
        return contains(s1Char, s2Char);
    }
    public boolean contains(int[] s1Char, int[] s2Char) {
        for (int i = 0; i < 26; i++) {
            if (s1Char[i] != s2Char[i]) {
                return false;
            }
        }
        return true;
    }
}