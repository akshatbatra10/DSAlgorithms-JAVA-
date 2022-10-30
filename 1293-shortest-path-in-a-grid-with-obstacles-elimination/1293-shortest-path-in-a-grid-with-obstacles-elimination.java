class Solution {
    public int shortestPath(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, k});
        boolean[][][] visited = new boolean[m][n][k + 1];
        int ans = 0;
        while (queue.size() > 0) {
            int size = queue.size();
            while (size-- > 0) {
                int[] ra = queue.remove();
                int i = ra[0];
                int j = ra[1];
                int ob = ra[2];
                if (i == m - 1 && j == n - 1 && ob >= 0) {
                    return ans;
                }
                if (ob < 0 || visited[i][j][ob]) {
                    continue;
                }
                visited[i][j][ob] = true;
                if (j - 1 >= 0) {
                    queue.add(new int[]{i, j - 1, ob - grid[i][j - 1]});
                }
                if (j + 1 < n) {
                    queue.add(new int[]{i, j + 1, ob - grid[i][j + 1]});
                }
                if (i - 1 >= 0) {
                    queue.add(new int[]{i - 1, j, ob - grid[i - 1][j]});
                }
                if (i + 1 < m) {
                    queue.add(new int[]{i + 1, j, ob - grid[i + 1][j]});
                }
            }
            ans++;
        }
        return -1;
    }
}