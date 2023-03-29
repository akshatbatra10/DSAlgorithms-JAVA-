class Solution {
    int findMaxSatisfaction(int[] satisfaction, int[][] memo, int index, int time) {
        if (index == satisfaction.length) {
            return 0;
        }
        if (memo[index][time] != -1) {
            return memo[index][time];
        }
        return memo[index][time] = Math.max(satisfaction[index] * time + findMaxSatisfaction(satisfaction, memo, index + 1, time + 1),
                findMaxSatisfaction(satisfaction, memo, index + 1, time));
    }
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);

        int[][] memo = new int[satisfaction.length + 1][satisfaction.length + 1];
        for (int i = 0; i < satisfaction.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        return findMaxSatisfaction(satisfaction, memo, 0, 1);
    }
}