class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[rooms.size()];
        queue.add(0);
        int count = 0;
        while (!queue.isEmpty()) {
            int ri = queue.remove();
            if (visited[ri]) {
                continue;
            }
            visited[ri] = true;
            count++;
            for (int i : rooms.get(ri)) {
                if (!visited[i]) {
                    queue.add(i);
                }
            }
        }
        return count == rooms.size();
    }
}