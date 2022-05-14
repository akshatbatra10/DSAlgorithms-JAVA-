/* Question - Search Insert Position */
/* 
  Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

  You must write an algorithm with O(log n) runtime complexity.
*/

/* Solution */

class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = 0;
		int low = 0;
		int high = nums.length - 1;
		int mid;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				ans = mid;
				return ans;
			} else if (nums[mid] < target) {
				ans = mid + 1;
				low = mid + 1;
			} else {
				ans = mid;
				high = mid - 1;
			}
		}
		return ans;
    }
}