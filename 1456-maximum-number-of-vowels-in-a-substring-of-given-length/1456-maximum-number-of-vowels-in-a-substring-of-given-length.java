class Solution {
    public int maxVowels(String s, int k) {
        int maxCount = 0;
        int currCount = 0;
        int i = 0;
        
        for (; i < k; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                maxCount++;
            }
        }
        
        int si = 0;
        currCount = maxCount;
        
        for (; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                currCount++;
            }
            if (s.charAt(si) == 'a' || s.charAt(si) == 'e' || s.charAt(si) == 'i' || s.charAt(si) == 'o' || s.charAt(si) == 'u') {
                currCount--;
            }
            si++;
            maxCount = Math.max(maxCount, currCount);
        }
        
        return maxCount;
    }
}