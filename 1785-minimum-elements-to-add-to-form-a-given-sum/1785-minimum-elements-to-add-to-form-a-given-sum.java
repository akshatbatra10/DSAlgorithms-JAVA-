class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int ele : nums) {
            sum += ele;
        }
        if (sum == goal) {
            return 0;
        }
        long diff = Math.abs(sum - goal);
        return (int) (diff / limit) + (diff % limit > 0 ? 1 : 0);
    }
}