/* Question - Diagonal Traverse */
/* 
  Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order. 
*/

/* Solution */

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        return traverseDiagonal(mat);
    }
    private static int[] traverseDiagonal(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		int[] temp = new int[n * m];
		int k = 0;
		int d = 0;
		while (d < n + m - 1) {
			int row;
			int col;
			if (d < m) {
				row = 0;
				col = d;
			} else {
				col = m - 1;
				row = d - m + 1;
			}
			ArrayList<Integer> list = new ArrayList<>();
			while (row < n && col >= 0) {
				list.add(arr[row][col]);
				row++;
				col--;
			}
			if(d%2==0) {
				Collections.reverse(list);
			}
			for (int i = 0; i < list.size(); i++) {
				temp[k] = list.get(i);
				k++;
			}
			d++;
		}
		return temp;
	}
}