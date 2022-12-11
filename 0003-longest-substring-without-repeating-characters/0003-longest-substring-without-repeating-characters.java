class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] sChar = new int[128];
        int si = 0;
        int ei = 0;
        int ans = 0;
        while (ei < s.length()) {
            sChar[s.charAt(ei)] += 1;
            while (sChar[s.charAt(ei)] > 1) {
                sChar[s.charAt(si)] -= 1;
                si++;
            }
            ans = Math.max(ei - si + 1, ans);
            ei++;
        }
        return ans;
    }
}