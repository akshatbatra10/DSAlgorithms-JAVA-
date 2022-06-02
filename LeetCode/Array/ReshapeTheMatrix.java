/* Question - Reshape the Matrix */
/* 
  In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

  You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

  The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

  If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
*/

/* Solution */

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length) {
            return mat;
        }
        int[][] reshape = new int[r][c];
        int a = 0;
        int b = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (a < r && b < c) {
                    reshape[a][b] = mat[i][j];
                    b++;
                }
                if (b == c) {
                    a++;
                    b = 0;
                }
                if (a == r) {
                    break;
                }
            }
            if (a == r) {
                break;
            }
        }
        return reshape;
    }
}