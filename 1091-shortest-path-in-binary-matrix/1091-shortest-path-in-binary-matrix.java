class pair {
    int i;
    int j;
    public pair(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (n == 1 && grid[0][0] == 0) {
            return 1;
        }
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }
        LinkedList<pair> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        int[] r = {0, 1, 1, 1, 0, -1, -1, -1};
        int[] c = {1, 1, 0, -1, -1, -1, 0, 1};
        queue.add(new pair(0, 0));
        int len = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            len++;
            while (size-- > 0) {
                pair rp = queue.remove();
                if (visited[rp.i][rp.j]) {
                    continue;
                }
                visited[rp.i][rp.j] = true;
                for (int i = 0; i < 8; i++) {
                    int a = rp.i + r[i];
                    int b = rp.j + c[i];
                    if (a < 0 || a == n || b < 0 || b == n || grid[a][b] == 1) {
                        continue;
                    }
                    if (a == n - 1 && b == n - 1) {
                        return len;
                    }
                    queue.add(new pair(a, b));
                }
            }
        }
        return -1;
    }
}