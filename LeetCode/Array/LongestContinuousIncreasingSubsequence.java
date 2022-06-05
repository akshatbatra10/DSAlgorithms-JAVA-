/* Question - Longest Continuous Increasing Subsequence */
/* 
  Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence (i.e. subarray). The subsequence must be strictly increasing.

  A continuous increasing subsequence is defined by two indices l and r (l < r) such that it is [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] and for each l <= i < r, nums[i] < nums[i + 1].
*/

/* Solution */

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}