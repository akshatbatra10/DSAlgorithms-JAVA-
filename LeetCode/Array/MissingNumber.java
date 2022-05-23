/* Question - Missing Number */
/* 
  Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*/

/* Solution */

class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return ((n * (n + 1)) / 2) - sum;
    }
}