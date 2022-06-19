/* Question - Magic Squares In Grid */
/* 
  A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row, column, and both diagonals all have the same sum.

  Given a row x col grid of integers, how many 3 x 3 "magic square" subgrids are there?  (Each subgrid is contiguous).
*/

/* Solution */

class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        if (grid.length <= 2 || grid[0].length <= 2) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                if (isMagicMatrix(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isMagicMatrix(int[][] arr, int sr, int sc) {
        int sum = arr[sr][sc] + arr[sr][sc + 1] + arr[sr][sc + 2];
        boolean[] seen = new boolean[10];
        int rowSum = 0;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (arr[i][j] >9 || arr[i][j] < 1 || seen[arr[i][j]]) {
                    return false;
                }
                seen[arr[i][j]] = true;
                rowSum += arr[i][j];
            }
            if (rowSum != sum) {
                return false;
            }
            rowSum = 0;
        }
        for (int i = sc; i < sc + 3; i++) {
            if (arr[sr][sc] + arr[sr + 1][sc] + arr[sr + 2][sc] != sum) {
                return false;
            }
        }
        for (int i = sr; i < sr + 3; i++) {
            if (arr[sr][sc] + arr[sr + 1][sc + 1] + arr[sr + 2][sc + 2] != sum) {
                return false;
            }
            if (arr[sr][sc + 2] + arr[sr + 1][sc + 1] + arr[sr + 2][sc] != sum) {
                return false;
            }
        }
        
        return true;
    }
}