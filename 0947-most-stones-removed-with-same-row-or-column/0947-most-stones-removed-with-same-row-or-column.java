class Solution {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        if (n <= 1) {
            return 0;
        }
        
        HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    graph.get(i).add(j);
                }
            }
        }
        
        boolean[] visited = new boolean[n];
        int ans = 0;
                
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            dfs(graph, visited, i);
            ans++;
        }
        return n - ans;
    }
    public void dfs(HashMap<Integer, HashSet<Integer>> graph, boolean[] visited, int start) {
        visited[start] = true;
        
        for (int nbrs : graph.get(start)) {
            if (visited[nbrs]) {
                continue;
            }

            dfs(graph, visited, nbrs);
        }
    }
}