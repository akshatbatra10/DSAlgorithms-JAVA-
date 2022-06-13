/* Question - Sum of Even Numbers After Queries */
/* 
  You are given an integer array nums and an array queries where queries[i] = [vali, indexi].

  For each query i, first, apply nums[indexi] = nums[indexi] + vali, then print the sum of the even values of nums.

  Return an integer array answer where answer[i] is the answer to the ith query.
*/

/* Solution */

class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sum += nums[i];
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int val = nums[queries[i][1]];
            if (val % 2 == 0) {
                sum -= val;
            }
            nums[queries[i][1]] = nums[queries[i][1]] + queries[i][0];
            if (nums[queries[i][1]] % 2 == 0) {
                sum += nums[queries[i][1]];
            }
            ans[i] = sum;
        }
        return ans;
    }
}