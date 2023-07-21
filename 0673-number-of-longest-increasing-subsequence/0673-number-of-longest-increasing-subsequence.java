class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] count = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j] < nums[i] && dp[j]+1 > dp[i]){
                    dp[i] = dp[j]+1;
                    count[i]=count[j];
                } else if(nums[j] < nums[i] && dp[j]+1 == dp[i]){
                    count[i]+=count[j];
                }
            }
        }
        int max = Arrays.stream(dp).max().getAsInt();
        int maxCount = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] == max) {
                maxCount += count[i];
            }
        }
        return maxCount;
    }
}