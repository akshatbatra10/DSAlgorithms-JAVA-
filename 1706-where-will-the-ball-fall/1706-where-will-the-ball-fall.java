class Solution {
    int k = 0;
    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[n];
        Integer[][] dp = new Integer[m][n];
        for (int j = 0; j < n; j++) {
            ans[j] = find(grid, 0, j, m, n, dp);
        }
        return ans;
    }
    public int find(int[][] grid, int i, int j, int m, int n, Integer[][] dp) {
        if (i == m) {
            return j;
        }
        int next = j + grid[i][j];
        if (next == -1 || next > n - 1 || grid[i][j] != grid[i][next]) {
            return -1;
        }
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        return dp[i][j] = find(grid, i + 1, next, m, n, dp);
    }
}