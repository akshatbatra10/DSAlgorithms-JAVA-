/* Question - Squares of a Sorted Array */
/* 
  Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
*/

/* Solution */

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        int k = n - 1;
        int[] ans = new int[n];
        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                ans[k] = nums[i] * nums[i];
                i++;
            } else {
                ans[k] = nums[j] * nums [j];
                j--;
            }
            k--;
        }
        return ans;
    }
}