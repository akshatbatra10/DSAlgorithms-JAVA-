/* Question - Monotonic Array */
/* 
  An array is monotonic if it is either monotone increasing or monotone decreasing.

  An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

  Given an integer array nums, return true if the given array is monotonic, or false otherwise.
*/

/* Solution */

class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }
        boolean isInc = true;
        boolean isDec = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                if (!isInc) {
                    return false;
                }
                isDec = false;
                continue;
            } 
            if (nums[i] < nums[i - 1]) {
                if(!isDec) {
                    return false;
                }
                isInc = false;
            } 
        }
        return true;
    }
}