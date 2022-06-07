/* Question - Sort Array By Parity */
/* 
  Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

  Return any array that satisfies this condition.
*/

/* Solution */

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums;
        }
        int[] ans = new int[n];
        int k = 0;
        for(int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                ans[k] = nums[i];
                k++;
            }
        }
        for(int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) {
                ans[k] = nums[i];
                k++;
            }
        }
        return ans;
    }
}