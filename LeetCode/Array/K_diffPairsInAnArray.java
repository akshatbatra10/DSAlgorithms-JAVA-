/* Question - K-diff Pairs in an Array */
/* 
  Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

  A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

  0 <= i, j < nums.length
  i != j
  nums[i] - nums[j] == k
  Notice that |val| denotes the absolute value of val.
*/

/* Solution */

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        return pairs(nums, k);
    }
    public static int pairs(int[] nums, int k) {
        int count = 0;
        if (k == 0) {
            int num = 100001;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1] && nums[i] != num) {
                    count++;
                }
                num = nums[i];
            }
            return count;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            if (binarySearch(nums, i + 1, k + nums[i])) {
                count++;
            }
        }
        return count;
    }
    public static boolean binarySearch(int[] arr, int si, int target) {
        int low = si;
        int high = arr.length - 1;
        int mid;
        while(low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}