class Solution {
    int maxL = 0;
    public int maxLength(List<String> arr) {
        if (arr.size() == 1) {
            return find(arr.get(0));
        }
        maximumL(arr, "", 0);
        return maxL;
    }
    public void maximumL(List<String> arr, String ans, int idx) {
        maxL = Math.max(maxL, find(ans));
        for (int i = idx; i < arr.size(); i++) {
            maximumL(arr, ans + arr.get(i), i + 1);
        }
    }
    public int find(String ans) {
        int[] freq = new int[26];
        int count = 0;
        for (int i = 0; i < ans.length(); i++) {
            int c = ans.charAt(i) - 'a';
            count++;
            freq[c]++;
            if (freq[c] == 2) {
                return 0;
            }
        }
        return count;
    }
}