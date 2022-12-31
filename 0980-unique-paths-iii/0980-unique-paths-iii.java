class Solution {
    int ans = 0;
    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int si = 0;
        int sj = 0;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1) {
                    count++;
                }
                if (grid[i][j] == 1) {
                    si = i;
                    sj = j;
                }
            }
        }
        ans = 0;
        totalUniquePaths(grid, si, sj, m, n, 0, (m * n) - count - 1);
        return ans;
    }
    public void totalUniquePaths(int[][] grid, int i, int j, int m, int n, int steps, int total) {
        if (i == m || j == n || i == -1 || j == -1 || grid[i][j] == -1) {
            return;
        }
        if (grid[i][j] == 2) {
            if (steps != total) {
                return;
            }
            ans++;
            return;
        }
        grid[i][j] = -1;
        totalUniquePaths(grid, i, j + 1, m, n, steps + 1, total);
        totalUniquePaths(grid, i, j - 1, m, n, steps + 1, total);
        totalUniquePaths(grid, i - 1, j, m, n, steps + 1, total);
        totalUniquePaths(grid, i + 1, j, m, n, steps + 1, total);
        grid[i][j] = 0;
    }
}