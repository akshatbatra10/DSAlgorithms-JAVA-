class Solution {
    public int strStr(String haystack, String needle) {
        int si = 0;
        int ei = needle.length();
        
        while (ei <= haystack.length()) {
            int idx = si;
            while (idx < ei) {
                if (haystack.charAt(idx) == needle.charAt(idx - si)) {
                    idx++;
                } else {
                    break;
                }
            }
            
            if (idx == ei) {
                return si;
            }
            
            si++;
            ei++;
        }
        
        return -1;
    }
}