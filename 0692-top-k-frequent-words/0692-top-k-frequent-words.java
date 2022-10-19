class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>(k);
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<>() {
            public int compare(String s1, String s2) {
                if (map.get(s1) == map.get(s2)) {
                    return s2.compareTo(s1);
                }
                return map.get(s1) - map.get(s2);
            }
        });
        for (String word : map.keySet()) {
            pq.add(word);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            ans.add(pq.remove());
        }
        Collections.reverse(ans);
        return ans;
    }
}