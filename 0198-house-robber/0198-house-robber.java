class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return houseRob(nums, 0, dp);
    }
    public int houseRob(int[] nums, int i, int[] dp) {
        if (i >= nums.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int inc = 0;
        int exc = 0;
        inc = nums[i] + houseRob(nums, i + 2, dp);
        exc = houseRob(nums, i + 1, dp);
        return dp[i] = Math.max(inc, exc);
    }
}