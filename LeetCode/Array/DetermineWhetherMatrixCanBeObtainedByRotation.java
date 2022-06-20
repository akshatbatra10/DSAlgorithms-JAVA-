/* Question - Determine Whether Matrix Can Be Obtained By Rotation */
/* 
  Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
*/

/* Solution */

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }
    public static int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = mat[n - 1 - j][i];
            }
        }
        return temp;
    }
}