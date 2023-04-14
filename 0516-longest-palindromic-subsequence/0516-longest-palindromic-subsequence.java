class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        // for (int[] a : dp) {
        //     Arrays.fill(a, -1);
        // }
        return subseq(s, 0, s.length() - 1, dp);
    }
    public int subseq(String s, int i, int j, int[][] dp) {
        if (i == j) {
            return 1;
        }
        if (i > j) {
            return 0;
        }
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        int ans = 0;
        if (s.charAt(i) == s.charAt(j)) {
            ans = 2 + subseq(s, i + 1, j - 1, dp);
        } else {
            ans = Math.max(subseq(s, i + 1, j, dp), subseq(s, i, j - 1, dp));
        }
        return dp[i][j] = ans;
    }
}