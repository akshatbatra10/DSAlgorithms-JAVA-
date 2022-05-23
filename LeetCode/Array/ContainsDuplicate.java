/* Question - Contains Duplicate */
/* 
  Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

/* Solution */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]){
                return true;
            }
        }
        return false;
    }
}