class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int si = 0;
        int ei = 0;
        int sum = 0;
        while (ei < nums.length) {
            sum += nums[ei];
            while (sum >= target) {
                ans = Math.min(ei - si + 1, ans);
                sum -= nums[si];
                si++;
            }
            ei++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}