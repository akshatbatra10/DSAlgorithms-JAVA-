class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> list = new ArrayList<>();
        int[] reachable = new int[n];
        for (int i = 0; i < edges.size(); i++) {
            reachable[edges.get(i).get(1)] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (reachable[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }
}