class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int currMax = 0;
        int maxPos = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPos = Math.max(i + nums[i], maxPos);
            if (i == currMax) {
                jump++;
                currMax = maxPos;
            }
        }
        return jump;
    }
}