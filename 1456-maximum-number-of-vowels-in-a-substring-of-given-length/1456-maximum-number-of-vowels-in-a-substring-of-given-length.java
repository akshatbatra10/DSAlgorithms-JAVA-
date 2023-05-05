class Solution {
    public int maxVowels(String s, int k) {
        int maxCount = 0;
        int currCount = 0;
        int i = 0;
        
        for (; i < k; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                maxCount++;
            }
        }
        
        int si = 0;
        currCount = maxCount;
        
        for (; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                currCount++;
            }
            char c = s.charAt(si);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                currCount--;
            }
            si++;
            maxCount = Math.max(maxCount, currCount);
        }
        
        return maxCount;
    }
}