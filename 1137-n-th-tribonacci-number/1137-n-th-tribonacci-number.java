class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return triAns(n, dp);
    }
    public int triAns(int n, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = triAns(n - 1, dp) + triAns(n - 2, dp) + triAns(n - 3, dp);
    }
}