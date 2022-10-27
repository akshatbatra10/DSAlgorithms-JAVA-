class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int[][] temp = new int[2 * n + 1][2 * n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (img1[i][j] == 1) {
                    for (int a = 0; a < n; a++) {
                        for (int b = 0; b < n; b++) {
                            if (img2[a][b] == 1) {
                                temp[i - a + n][j - b + n] += 1;
                            }
                        }
                    }
                }
            }
        }
        int max = 0;
        for (int[] i : temp) {
            for (int j : i) {
                max = Math.max(max, j);
            }
        }
        return max;
    }
}