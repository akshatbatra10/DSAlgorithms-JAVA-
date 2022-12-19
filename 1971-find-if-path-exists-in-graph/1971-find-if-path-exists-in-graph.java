class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }
        return findPath(graph, source, destination, new boolean[n]);
    }
    public boolean findPath(HashMap<Integer, HashSet<Integer>> graph, int src, int dest, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        while (!queue.isEmpty()) {
            int rv = queue.remove();
            if (visited[rv]) {
                continue;
            }
            visited[rv] = true;
            if (rv == dest) {
                return true;
            }
            for (int nbrs : graph.get(rv)) {
                if (!visited[nbrs]) {
                    queue.add(nbrs);
                }
            }
        }
        return false;
    }
}