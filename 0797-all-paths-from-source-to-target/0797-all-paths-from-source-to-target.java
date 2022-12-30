class Solution {
    HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        for (int i = 0; i < graph.length; i++) {
			map.put(i, new HashMap<>());
		}
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                map.get(i).put(graph[i][j], 0);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findPath(0, graph.length - 1, ans, list, new HashSet<>());
        return ans;
    }
    
    public void findPath(int src, int des, List<List<Integer>> ans, List<Integer> list, HashSet<Integer> set) {
        if (src == des) {
            list.add(des);
            ans.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }
        set.add(src);
        list.add(src);
        for (int nbhrs : map.get(src).keySet()) {
            if (!set.contains(nbhrs)) {
                findPath(nbhrs, des, ans, list, set);
            }
        }
        set.remove(src);
        list.remove(list.size() - 1);
    }
}