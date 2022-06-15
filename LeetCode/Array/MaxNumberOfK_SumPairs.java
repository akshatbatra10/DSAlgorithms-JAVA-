/* Question - Max Number of K-Sum Pairs */
/* 
  You are given an integer array nums and an integer k.

  In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

  Return the maximum number of operations you can perform on the array.
*/

/* Solution */

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                count++;
                i++;
                j--;
            } else if (nums[i] + nums[j] < k) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}