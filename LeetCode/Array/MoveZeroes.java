/* Question - Move Zeroes */
/* 
  Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

  Note that you must do this in-place without making a copy of the array.
*/

/* Solution */

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] == 0) {
                if (nums[j] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            } else {
                i++;
            }
            j++;
        }
    }
}