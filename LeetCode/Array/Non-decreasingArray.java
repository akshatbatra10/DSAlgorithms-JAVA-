/* Question - Non-decreasing Array */
/* 
  Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most one element.

  We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).
*/

/* Solution */

class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (count == 2) {
                    return false;
                }
                if (i == 0 || nums[i + 1] >= nums[i - 1]) {
                    nums[i] = nums[i + 1];
                } else {
                    nums[i + 1] = nums[i];
                }
            }
        }
        return true;
    }
}