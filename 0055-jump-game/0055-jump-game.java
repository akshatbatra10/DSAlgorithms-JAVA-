class Solution {
    public boolean canJump(int[] nums) {
        int maxLen = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i > maxLen) {
                return false;
            }
            maxLen = Math.max(maxLen, i + nums[i]);
            if (maxLen >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}