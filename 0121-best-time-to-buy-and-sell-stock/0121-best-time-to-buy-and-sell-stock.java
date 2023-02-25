class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int currBuy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < currBuy) {
                currBuy = prices[i];
            } else {
                max = Math.max(max, prices[i] - currBuy);
            }
        }
        return max;
    }
}