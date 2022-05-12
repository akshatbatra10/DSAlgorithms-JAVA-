/* Question - Two Sum */
/* 
  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. 
*/

/* Solution */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[j] == (target-nums[i])) {
                    temp[0] = i;
                    temp[1] = j;
                    break;
                }
            }
        }
        return temp;
    }
}