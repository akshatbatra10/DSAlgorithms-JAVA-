class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if (d > n) {
            return -1;
        }
        Integer[][][] dp = new Integer[d + 1][n + 1][n];
        return minD(jobDifficulty, d, 1, 0, dp);
    }
    public int minD(int[] jobDifficulty, int d, int i, int j, Integer[][][] dp) {
        if (d == 0 && i == jobDifficulty.length + 1) {
            return 0;
        }
        if (d == 0 && i != jobDifficulty.length + 1) {
            return 1000000;
        }
        if (i == jobDifficulty.length + 1) {
            return 1000000;
        }
        if (dp[d][i][j] != null) {
            return dp[d][i][j];
        }
        
        int inc = max(jobDifficulty, j, i) + minD(jobDifficulty, d - 1, i + 1, i, dp);
        int exc = minD(jobDifficulty, d, i + 1, j, dp);
        return dp[d][i][j] = Math.min(inc, exc);
    }
    public int max(int[] jobDifficulty, int i, int j) {
        int max = 0;
        for (; i < j; i++) {
            if (max < jobDifficulty[i]) {
                max = jobDifficulty[i];
            }
        }
        return max;
    }
}