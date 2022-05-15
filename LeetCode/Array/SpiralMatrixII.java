/* Question - Spiral Matrix II */
/* 
  Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
*/

/* Solution */

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
		int minr = 0;
		int minc = 0;
		int maxr = n - 1;
		int maxc = n - 1;
		int val = 1;
		while (minr <= maxr && minc <= maxc) {
			for (int i = minc; i <= maxc && minr <= maxr && minc <= maxc; i++) {
				arr[minr][i] = val;
				val++;
			}
			minr++;
			for (int i = minr; i <= maxr && minr <= maxr && minc <= maxc; i++) {
				arr[i][maxc] = val;
				val++;
			}
			maxc--;
			for (int i = maxc; i >= minc && minr <= maxr && minc <= maxc; i--) {
				arr[maxr][i] = val;
				val++;
			}
			maxr--;
			for (int i = maxr; i >= minr && minr <= maxr && minc <= maxc; i--) {
				arr[i][minc] = val;
				val++;
			}
			minc++;
		}
		return arr;
    }
}