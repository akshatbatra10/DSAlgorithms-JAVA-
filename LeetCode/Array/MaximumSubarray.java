/* Question - Maximum Subarray */
/* 
  Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

  A subarray is a contiguous part of an array.

*/

/* Solution */

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            sum = Math.max(currSum, sum);
            if(currSum < 0) {
                currSum = 0;
            }
        }
        return sum;
    }
}