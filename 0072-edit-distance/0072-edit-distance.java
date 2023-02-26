class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for (int[] a: dp) {
            Arrays.fill(a, -1);
        }
        return minOperations(word1, word2, 0, 0, dp);
    }
    public int minOperations(String s, String t, int i, int j, int[][] dp) {
        if (i == s.length()) {
            return t.length() - j;
        }
        if (j == t.length()) {
            return s.length() - i;
        }
        if (dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = 0;
        if (s.charAt(i) == t.charAt(j)) {
            ans = minOperations(s, t, i + 1, j + 1, dp);
        } else {
            int insert = minOperations(s, t, i, j + 1, dp);
            int delete = minOperations(s, t, i + 1, j, dp);
            int replace = minOperations(s, t, i + 1, j + 1, dp);
            ans = 1 + Math.min(insert, Math.min(delete, replace));
        }
        return dp[i][j] = ans;
    }
}