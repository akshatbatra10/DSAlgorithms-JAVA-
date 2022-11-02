class Solution {
    public int minMutation(String start, String end, String[] bank) {
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        boolean[] visited = new boolean[bank.length];
        int len = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                String rs = queue.remove();
                if (rs.equals(end)) {
                    return len;
                }
                for (int i = 0; i < bank.length; i++) {
                    if (visited[i]) {
                        continue;
                    }
                    if (isValid(rs, bank[i])) {
                        visited[i] = true;
                        queue.add(bank[i]);
                    }
                }
            }
            len++;
        }
        return -1;
    }
    public boolean isValid(String a, String b) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }
}