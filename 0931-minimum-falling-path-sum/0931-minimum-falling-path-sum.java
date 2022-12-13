class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Integer[][] dp = new Integer[m][n];
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, mfp(matrix, 0, i, m, n, dp));
        }
        return ans;
    }
    public int mfp(int[][] matrix, int i, int j, int m, int n, Integer[][] dp) {
        if (i == m || j == -1 || j == n) {
            return 1000000;
        }
        if (i == m - 1) {
            return matrix[i][j];
        }
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        dp[i][j] = matrix[i][j] + Math.min(mfp(matrix, i + 1, j, m, n, dp), Math.min(mfp(matrix, i + 1, j + 1, m, n, dp), mfp(matrix, i + 1, j - 1, m, n, dp)));
        return dp[i][j];
    }
}