class Solution {
    public String minWindow(String s, String t) {
        int[] sChar = new int[58];
        int[] tChar = new int[58];
        for (int i = 0; i < t.length(); i++) {
            tChar[t.charAt(i) - 65] += 1;
        }
        int si = 0;
        int ei = 0;
        int siAns = 0;
        int eiAns = 0;
        int minWindow = Integer.MAX_VALUE;
        while (ei < s.length()) {
            sChar[s.charAt(ei) - 65] += 1;
            while(isComplete(tChar, sChar)) {
                if (minWindow > ei - si + 1) {
                    minWindow = ei - si + 1;
                    siAns = si;
                    eiAns = ei + 1;
                }
                sChar[s.charAt(si) - 65] -= 1;
                si++;
            }
            ei++;
        }
        return s.substring(siAns, eiAns);
    }
    public static boolean isComplete(int[] tChar, int[] sChar) {
        for (int i = 0; i < tChar.length; i++) {
            if (tChar[i] > sChar[i]) {
                return false;
            }
        }
        return true;
    }
}