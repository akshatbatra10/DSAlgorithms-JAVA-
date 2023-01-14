class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        HashMap<Character, ArrayList<Character>> graph = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char s1C = s1.charAt(i);
            char s2C = s2.charAt(i);
            if (!graph.containsKey(s1C))
                graph.put(s1C, new ArrayList<>());
            if (!graph.containsKey(s2C))
                graph.put(s2C, new ArrayList<>());
            graph.get(s1C).add(s2C);
            graph.get(s2C).add(s1C);
        }
        Queue<Character> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < baseStr.length(); i++) {
            HashSet<Character> visited = new HashSet<>();
            char ch = baseStr.charAt(i);
            if (!graph.containsKey(ch)) {
                sb.append(ch);
                continue;
            }
            queue.add(ch);
            char min = ch;
            while (!queue.isEmpty()) {
                char c = queue.remove();
                if (visited.contains(c)) {
                    continue;
                }
                visited.add(c);
                if (c < min) {
                    min = c;
                }
                for (char nbrs : graph.get(c)) {
                    if (!visited.contains(nbrs)) {
                        queue.add(nbrs);
                    }
                }
            }
            sb.append(min);
        }
        return sb.toString();
    }
}