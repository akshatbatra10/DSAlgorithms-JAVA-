class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            freq[sentence.charAt(i) - 'a']++;
        }
        for (int i : freq) {
            if (i ==  0) {
                return false;
            }
        }
        return true;
    }
}