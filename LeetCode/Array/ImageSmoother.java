/* Question - Image Smoother */
/* 
  An image smoother is a filter of the size 3 x 3 that can be applied to each cell of an image by rounding down the average of the cell and the eight surrounding cells (i.e., the average of the nine cells in the blue smoother). If one or more of the surrounding cells of a cell is not present, we do not consider it in the average (i.e., the average of the four cells in the red smoother).
*/

/* Solution */

class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] ans = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                ans[i][j] = cal(img, i, j);
            }
        }
        return ans;
    }
    public static int cal(int[][] img, int cr, int cc) {
        int[] posR = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] posC = {0, 1, 1, 1, 0, -1, -1, -1};
        int count = 1;
        int sum = img[cr][cc];
        for (int i = 0; i < 8; i++) {
            if (cr + posR[i] >= 0 && cr + posR[i] < img.length && cc + posC[i] >= 0 && cc + posC[i] < img[0].length) {
                sum += img[cr + posR[i]][cc + posC[i]];
                count++;
            }
        }
        return sum / count;
    }
}