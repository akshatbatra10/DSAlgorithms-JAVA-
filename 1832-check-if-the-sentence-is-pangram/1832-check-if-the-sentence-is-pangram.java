class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (freq[sentence.charAt(i) - 'a'] == 0) {
                count++;
            }
            freq[sentence.charAt(i) - 'a']++;
        }
        return count == 26 ? true : false;
    }
}