/* Question - Product of Array Except Self */
/* 
  Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

  The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

  You must write an algorithm that runs in O(n) time and without using the division operation.
*/

/* Solution */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        return product(nums, nums.length);
    }
    public static int[] product(int[] arr, int n) {
		int[] temp = new int[n];
		temp[0] = 1;
		for (int i = 1; i < n; i++) {
			temp[i] = temp[i - 1] * arr[i - 1];
		}
		int mul=arr[n-1];
		for (int i = n - 2; i >= 0; i--) {
			temp[i] = temp[i] * mul;
			mul=mul*arr[i];
		}
		return temp;
	}
}