/* Question - 3Sum */
/* 
  Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

  Notice that the solution set must not contain duplicate triplets.
*/

/* Solution */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		sum(nums, ans);
        return ans;
    }
    public static void sum(int[] arr, List<List<Integer>> ans) {
		int n = arr.length;
		for (int k = 0; k < n - 2; k++) {
            if (k == 0 || arr[k] != arr[k - 1]) {
                int i = k + 1;
                int j = n - 1;
                while (i < j) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[k]);
                        list.add(arr[i]);
                        list.add(arr[j]);
                        ans.add(list);
                        while (i < j && arr[i] == arr[i + 1]) {
                            i++;
                        }
                        while (i < j && arr[j] == arr[j - 1]) {
                            j--;
                        } 
                        i++;
                        j--;
                    }
                    else if (sum < 0) {
                        i++;
                    } else {
                        j--;
                    }
                }
            }
		}
	}
}