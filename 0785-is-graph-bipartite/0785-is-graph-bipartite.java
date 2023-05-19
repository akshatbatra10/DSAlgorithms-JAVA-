class BipartitePair {
    int vtx;
    int d;
    public BipartitePair(int vtx, int d) {
        this.vtx = vtx;
        this.d = d;
    }
}
class Solution {
    public boolean isBipartite(int[][] graph) {
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            map.put(i, new HashMap<>());
        }
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                map.get(i).put(graph[i][j], 0);
            }
        }
        return checkBipartite(map);
    }
    public boolean checkBipartite(HashMap<Integer, HashMap<Integer, Integer>> map) {
        LinkedList<BipartitePair> queue = new LinkedList<>();
		HashMap<Integer, Integer> visited = new HashMap<>();
		for (int src : map.keySet()) {
			if (visited.containsKey(src)) {
				continue;
			}
            BipartitePair bp = new BipartitePair(src, 0);
			queue.add(bp);
			while (!queue.isEmpty()) {
				BipartitePair rd = queue.remove();
				if (visited.containsKey(rd.vtx)) {
                    if (rd.d != visited.get(rd.vtx)) {
                        return false;
                    }
					continue;
				}
				visited.put(rd.vtx, rd.d);
				for (int nbhrs : map.get(rd.vtx).keySet()) {
					if (!visited.containsKey(nbhrs)) {
                        BipartitePair nbp = new BipartitePair(nbhrs, rd.d + 1);
                        queue.add(nbp);
					}
				}
			}
		}
        return true;
    }
}