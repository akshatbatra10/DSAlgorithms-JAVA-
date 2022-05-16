/* Question - Search a 2D Matrix */
/* 
  Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

  Integers in each row are sorted from left to right.
  The first integer of each row is greater than the last integer of the previous row. 
*/

/* Solution */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return search(matrix, target);
    }
    public static boolean search(int[][] arr, int k) {
		int i = 0;
		int j = arr[0].length - 1;
		while (i < arr.length && j >= 0) {
			if (arr[i][j] == k) {
				return true;
			} else if (arr[i][j] < k) {
				i++;
			} else {
				j--;
			}
		}
		return false;
	}
}