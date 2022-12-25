class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] ans = new int[queries.length];
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        for (int i = 0; i < queries.length; i++) {
            ans[i] = binarySearch(nums, queries[i]);
        }
        return ans;
    }
    public int binarySearch(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] <= target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return nums[lo] > target ? lo : lo + 1;
    }
}