class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for (int[] a : dp) {
            a[0] = -1;
            a[1] = -1;
        }
        return profit(prices, 0, 1, dp);
    }
    public int profit(int[] prices, int i, int buy, int[][] dp) {
        if (i >= prices.length) {
            return 0;
        }
        if (dp[i][buy] != -1) {
            return dp[i][buy];
        }
        int profit = 0;
        if (buy == 1) {
            int yesBuy = profit(prices, i + 1, 0, dp) - prices[i];
            int noBuy = profit(prices, i + 1, 1, dp);
            profit = Math.max(yesBuy, noBuy);
        } else {
            int yesSell = prices[i] + profit(prices, i + 2, 1, dp);
            int noSell = profit(prices, i + 1, 0, dp);
            profit = Math.max(yesSell, noSell);
        }
        return dp[i][buy] = profit;
    }
}