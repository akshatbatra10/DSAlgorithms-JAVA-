class Solution {
    public int removeStones(int[][] stones) {
        HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
        int n = stones.length;
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
        
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[n];
        int ans = 0;
                
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            st.push(i);
            while (!st.isEmpty()) {
                int re = st.pop();
                if (visited[re]) {
                    continue;
                }
                visited[re] = true;
                for (int nbrs : graph.get(re)) {
                    if (!visited[nbrs]) {
                        st.push(nbrs);
                    }
                }
            }
            ans++;
        }
        return n - ans;
    }
}