/* Question - Array Partition I
 */
/* 
  Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
*/

/* Solution */

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i+=2) {
            int val = Math.min(nums[i], nums[i + 1]);
            ans += val;           
        }  
        return ans;
    }
}