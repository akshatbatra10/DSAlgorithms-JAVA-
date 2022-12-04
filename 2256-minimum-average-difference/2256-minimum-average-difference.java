class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long[] cs = new long[n];
        cs[0] = nums[0];
        for (int i = 1; i < n; i++) {
            cs[i] = cs[i - 1] + nums[i];
        }
        
        long minDiff = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            long left = cs[i] / (i + 1);
            long right = 0;
            if (i == n - 1) {
                right = 0;
            } else {
                right = (cs[n - 1] - cs[i]) / (n - i - 1);
            }
            long diff = Math.abs(left - right);
            if (minDiff > diff) {
                minDiff = diff;
                ans = i;
            }
        }
        
        return ans;
    }
}