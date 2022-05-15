/* Question - Spiral Matrix */
/* 
  Given an m x n matrix, return all elements of the matrix in spiral order.
*/

/* Solution */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        return spiral(matrix, list);
    }
    public static List<Integer> spiral(int[][] arr, List<Integer> list) {
		int minr = 0;
		int minc = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;
		while (minr <= maxr && minc <= maxc) {
			for (int i = minc; i <= maxc && minr <= maxr && minc <= maxc; i++) {
				list.add(arr[minr][i]);
			}
			minr++;
			for (int i = minr; i <= maxr && minr <= maxr && minc <= maxc; i++) {
				list.add(arr[i][maxc]);
			}
			maxc--;
			for (int i = maxc; i >= minc && minr <= maxr && minc <= maxc; i--) {
				list.add(arr[maxr][i]);
			}
			maxr--;
			for (int i = maxr; i >= minr && minr <= maxr && minc <= maxc; i--) {
				list.add(arr[i][minc]);
			}
			minc++;
		}
		return list;
	}
}