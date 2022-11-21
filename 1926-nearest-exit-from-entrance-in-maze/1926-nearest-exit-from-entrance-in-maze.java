class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        
        queue.add(new int[]{entrance[0], entrance[1], 0});
        
        while (!queue.isEmpty()) {
            int[] rc = queue.remove();
            int x = rc[0];
            int y = rc[1];
            int dist = rc[2];
            
            if (visited[x][y]) {
                continue;
            }
            
            visited[x][y] = true;
            if ((x == 0 || x == m - 1 || y == 0 || y == n - 1) && (x != entrance[0] || y != entrance[1])) {
                return dist;
            }
            if (y + 1 < n && maze[x][y + 1] != '+') {
                queue.add(new int[]{x, y + 1, dist + 1});
            }
            if (y - 1 >= 0 && maze[x][y - 1] != '+') {
                queue.add(new int[]{x, y - 1, dist + 1});
            }
            if (x + 1 < m && maze[x + 1][y] != '+') {
                queue.add(new int[]{x + 1, y, dist + 1});
            }
            if (x - 1 >= 0 && maze[x - 1][y] != '+') {
                queue.add(new int[]{x - 1, y, dist + 1});
            }

        }
        
        return -1;
    }
}