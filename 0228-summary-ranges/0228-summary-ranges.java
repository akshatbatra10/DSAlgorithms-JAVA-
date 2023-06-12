class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        if (n == 0) {
            return ans;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]);
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (count > 1) {
                    sb.append("->" + nums[i - 1]);
                }
                ans.add(sb.toString());
                sb = new StringBuilder();
                sb.append(nums[i]);
                count = 1;
            } else {
                count++;
            }
        }
        if (count > 1) {
            sb.append("->" + nums[n - 1]);
        }
        ans.add(sb.toString());
        return ans;
    }
}