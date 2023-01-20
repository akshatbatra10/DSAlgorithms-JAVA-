class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        backtracking(nums, ans, list, 0);
        return new ArrayList<>(ans);
    }
    public void backtracking(int[] nums, Set<List<Integer>> ans, List<Integer> list, int idx) {
        if (idx == nums.length) {
            if (list.size() >= 2) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if (list.size() == 0 || list.get(list.size() - 1) <= nums[idx]) {
            list.add(nums[idx]);
            backtracking(nums, ans, list, idx + 1);
            list.remove(list.size() - 1);
        }
        backtracking(nums, ans, list, idx + 1);
    }
}