class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if (d > n) {
            return -1;
        }
        Integer[][] dp = new Integer[d + 1][n];
        return minD(jobDifficulty, d, 0, dp);
    }
    public int minD(int[] jobDifficulty, int d, int i, Integer[][] dp) {
        if (d == 0 && i == jobDifficulty.length) {
            return 0;
        }
        if (d < 0 || i == jobDifficulty.length) {
            return 1000000;
        }
        if (dp[d][i] != null) {
            return dp[d][i];
        }
        
        int max = 0;
        int res = Integer.MAX_VALUE;
        for (int k = i; k < jobDifficulty.length; k++) {
            max = Math.max(max, jobDifficulty[k]);
            res = Math.min(res, max + minD(jobDifficulty, d - 1, k + 1, dp));
        }
        return dp[d][i] = res;
    }
}