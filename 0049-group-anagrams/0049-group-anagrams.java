class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String key = generateKey(str);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        for (String str : map.keySet()) {
            ans.add(map.get(str));
        }
        return ans;
    }
    public String generateKey(String s) {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i : freq) {
            sb.append(i + " ");
        }
        return sb.toString();
    }
}