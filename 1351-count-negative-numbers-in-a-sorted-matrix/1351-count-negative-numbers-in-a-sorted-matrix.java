class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int low = 0;
            int high = grid[0].length - 1;
            int pos = high + 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (grid[i][mid] < 0) {
                    pos = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            count += grid[0].length - pos;
        }
        return count;
    }
}