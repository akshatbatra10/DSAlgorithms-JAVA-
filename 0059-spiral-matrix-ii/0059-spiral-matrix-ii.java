class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int val = 1;
        int minR = 0;
        int minC = 0;
        int maxR = n - 1;
        int maxC = n - 1;
        while (val <= n * n) {
            for (int i = minC; i <= maxC; i++) {
                mat[minR][i] = val;
                val++;
            }
            minR++;
            for (int i = minR; i <= maxR; i++) {
                mat[i][maxC] = val;
                val++;
            }
            maxC--;;
            for (int i = maxC; i >= minC; i--) {
                mat[maxR][i] = val;
                val++;
            }
            maxR--;
            for (int i = maxR; i >= minR; i--) {
                mat[i][minC] = val;
                val++;
            }
            minC++;
        }
        return mat;
    }
}