class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n];
        return climb(n, dp, 0);
    }
    public int climb(int n, int[] dp, int i) {
        if (i == n) {
            return 1;
        }
        if (i > n) {
            return 0;
        }
        if (dp[i] != 0) {
            return dp[i];
        }
        return dp[i] = climb(n, dp, i + 1) + climb(n, dp, i + 2);
    }
}