class Solution {
    int[][] dp;
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int mod = 1_000_000_007;
    
    int dfs(int[][] grid, int i, int j) {
        if (dp[i][j] != 0)
            return dp[i][j];

        int answer = 1;

        for (int[] d : directions) {
            int prevI = i + d[0], prevJ = j + d[1];
            if (0 <= prevI && prevI < grid.length && 0 <= prevJ && 
                prevJ < grid[0].length && grid[prevI][prevJ] < grid[i][j]) {
                answer += dfs(grid, prevI, prevJ);
                answer %= mod;
            }
        }

        dp[i][j] = answer;
        return answer;
    }
    
    public int countPaths(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        dp = new int[m][n];

        int answer = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                answer = (answer + dfs(grid, i, j)) % mod;
            }
        }

        return answer;
    }
}