class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        
        if (s.length() < p.length()) {
            return list;
        }
        
        int[] sChar = new int[26];
        int[] pChar = new int[26];
        
        for (int i = 0; i < p.length(); i++) {
            pChar[p.charAt(i) - 'a'] += 1;
        }
        
        int si = 0;
        
        for (int i = 0; i < s.length(); i++) {
            sChar[s.charAt(i) - 'a'] += 1;
            if (i - si + 1 == p.length()) {
                if (checkAnagram(sChar, pChar)) {
                    list.add(si);
                }
                sChar[s.charAt(si) - 'a'] -= 1;
                si++;
            }
        }
        return list;
    }
    public boolean checkAnagram(int[] sChar, int[] pChar) {
        for (int i = 0; i < 26; i++) {
            if (sChar[i] != pChar[i]) {
                return false;
            }
        }
        return true;
    }
}