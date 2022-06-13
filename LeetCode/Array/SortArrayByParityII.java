/* Question - Sort Array By Parity II */
/* 
  Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

  Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

  Return any answer array that satisfies this condition.
*/

/* Solution */

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        while (i < nums.length && j < nums.length) {
            if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i += 2;
                j += 2;
                continue;
            }
            if (nums[i] % 2 == 0) {
                i += 2;
            }
            if (nums[j] % 2 != 0) {
                j += 2;
            }
        }
        return nums;
    }
}