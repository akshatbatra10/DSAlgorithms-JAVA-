class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        if (n == 2) return true;
        int y = coordinates[1][1] - coordinates[0][1];
        int x = coordinates[1][0] - coordinates[0][0];
        if (x == 0) {
            for (int i = 2; i < n; i++) {
                if (coordinates[i][0] !=  coordinates[i - 1][0]) {
                    return false;
                }
            }
        } else if (y == 0) {
            for (int i = 2; i < n; i++) {
                if (coordinates[i][1] !=  coordinates[i - 1][1]) {
                    return false;
                }
            }
        } else {
            int m = y / x;
            for (int i = 2; i < n; i++) {
                y = coordinates[i][1] - coordinates[i - 1][1];
                x = coordinates[i][0] - coordinates[i - 1][0];
                if (x == 0 || y == 0) {
                    return false;
                }
                if ((y / x) != m) return false;
            }
        }
        return true;
    }
}