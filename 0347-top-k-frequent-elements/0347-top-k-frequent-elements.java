class pair {
    int ele;
    int freq;
    pair(int ele, int freq) {
        this.ele = ele;
        this.freq = freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<pair> pq = new PriorityQueue<>(new Comparator<pair>() {
            public int compare(pair p1, pair p2) {
                return p1.freq - p2.freq;
            }
        });
        int i = 0;
        for (int key : map.keySet()) {
            if (i < k) {
                pq.add(new pair(key, map.get(key)));
                i++;
            } else {
                if (pq.peek().freq < map.get(key)) {
                    pq.poll();
                    pq.add(new pair(key, map.get(key)));
                }
            }
        }
        int[] ans = new int[k];
        i = 0;
        while (!pq.isEmpty()) {
            ans[i] = pq.poll().ele;
            i++;
        }
        return ans;
    }
}