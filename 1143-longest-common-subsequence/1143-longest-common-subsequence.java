class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        return lgs(text1, text2, 0, 0, dp);
    }
    public int lgs(String s, String p, int i, int j, int[][] dp) {
        if (i == s.length() || j == p.length()) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = 0;
        if (s.charAt(i) == p.charAt(j)) {
            ans = 1 + lgs(s, p, i + 1, j + 1, dp);
        } else {
            int sf = lgs(s, p, i + 1, j, dp);
            int pf = lgs(s, p, i, j + 1, dp);
            ans = Math.max(sf, pf);
        }
        return dp[i][j] = ans;
    }
}