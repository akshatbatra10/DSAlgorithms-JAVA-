class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int len = 0;
        int maxDub = 0;
        boolean flag = false;
        for (String word : map.keySet()) {
            String rev = "" + word.charAt(1) + word.charAt(0);
            if (rev.equals(word)) {
                if (map.get(word) == 1) {
                    flag = true;
                } else {
                    int q = map.get(word) / 2;
                    maxDub += 4 * q;
                    if (map.get(word) % 2 != 0) {
                        flag = true;
                    }
                }
            } else {
                if (map.containsKey(rev)) {
                    len += 4 * Math.min(map.get(word), map.get(rev));
                    map.put(word, 0);
                    map.put(rev, 0);
                }
            }
        }
        if (flag) maxDub += 2;
        len += maxDub;
        return len;
    }
}