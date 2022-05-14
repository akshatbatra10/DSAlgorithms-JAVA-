/* Question - Find First and Last Position of Element in Sorted Array */
/* 
  Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

  If target is not found in the array, return [-1, -1].

  You must write an algorithm with O(log n) runtime complexity. 
*/

/* Solution */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] idx = new int[2];
		idx[0] = first(nums, target);
		idx[1] = last(nums, target);
		return idx;
    }
    public static int first(int[] arr, int target) {
		int low = 0;
		int idx = -1;
		int high = arr.length - 1;
		int mid;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (arr[mid] == target) {
				idx = mid;
				high = mid - 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return idx;
	}

	public static int last(int[] arr, int target) {
		int low = 0;
		int idx = -1;
		int high = arr.length - 1;
		int mid;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (arr[mid] == target) {
				idx = mid;
				low = mid + 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return idx;
	}
}