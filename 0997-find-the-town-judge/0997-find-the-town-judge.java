class Solution {
    HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
    public int findJudge(int n, int[][] trust) {
        for (int i = 1; i <= n; i++) {
            map.put(i, new HashSet<>());
        }
        for (int i = 0; i < trust.length; i++) {
            map.get(trust[i][0]).add(trust[i][1]);
        }
        int judge = -1;
        for (int i = 1; i <= n; i++) {
            if (map.get(i).size() == 0) {
                judge = i;
                break;
            }
        }
        if (judge == -1) return -1;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i != judge && map.get(i).contains(judge)) {
                count++;
            }
        }
        return count == n - 1 ? judge : -1;
    }
}