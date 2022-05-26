/* Question - Third Maximum Number */
/* 
  Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

*/

/* Solution */

class Solution {
    public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secMax = max;
        int thirdMax = max;
        for (int i = 0; i <nums.length; i++) {
            if(nums[i] > max) {
                secMax = max;
                max = nums[i];
            } else if (nums[i] > secMax && nums[i] < max) {
                secMax = nums[i];
            }
        }
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < secMax && nums[i] >= thirdMax) {
                thirdMax = nums[i];
                flag = true;
            }
        }
        if(!flag) {
            thirdMax = max;
        }
        return thirdMax;
    }
}