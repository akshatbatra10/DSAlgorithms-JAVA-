/* Question - Majority Element */
/* 
  Given an array nums of size n, return the majority element.

  The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/

/* Solution */

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int maxCount = 0;
        int maxVal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                count++;
                if(count > maxCount) {
                    maxCount = count;
                    maxVal = nums[i];
                }
            } else {
                count = 0;
            }
        }
        return maxVal;
    }
}