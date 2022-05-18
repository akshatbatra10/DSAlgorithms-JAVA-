/* Question - Rotate Array */
/* 
  Given an array, rotate the array to the right by k steps, where k is non-negative.
*/

/* Solution */

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
		reverse(nums, n - k, n - 1);
		reverse(nums, 0, n - k - 1);
		reverse(nums, 0, n - 1);
    }
    public void reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}