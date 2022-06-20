/* Question - Search in Rotated Sorted Array II */
/* 
  There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

  Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

  Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

  You must decrease the overall operation steps as much as possible.
*/

/* Solution */

class Solution {
    public boolean search(int[] nums, int target) {
        int i;
        for (i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                break;
            }
        }
        if (target <= nums[i - 1] && target >= nums[0]) {
            return binarySearch(nums, 0, i - 1, target);
        }
        return binarySearch(nums, i, nums.length - 1, target);
    }
    public static boolean binarySearch(int[] nums, int si, int ei, int target) {
        int mid;
        while (si <= ei) {
            mid = (si + ei) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return false;
    }
}