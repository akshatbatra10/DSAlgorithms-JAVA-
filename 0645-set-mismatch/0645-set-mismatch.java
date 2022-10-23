class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                ans[1] = i;
            }
            if (map.containsKey(i) && map.get(i) == 2) {
                ans[0] = i;
            }
        }
        return ans;
    }
}