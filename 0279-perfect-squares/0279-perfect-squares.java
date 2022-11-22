class Solution {
    public int numSquares(int n) {
        int range = (int) Math.sqrt(n);
        int[] squ = new int[range];
        
        for (int i = 1; i <= range; i++) {
            squ[i - 1] = i * i;
        }
        
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 100000);
        dp[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < range; j++) {
                if (squ[j] > i) {
                    break;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i - squ[j]]);
            }
        }
        
        return dp[n];
    }
}