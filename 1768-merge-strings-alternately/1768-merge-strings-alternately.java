class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        
        StringBuilder result = new StringBuilder();
        
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
            i++;
            j++;
        }
        while (i < word1.length()) {
            result.append(word1.charAt(i));
            i++;
        }
        while (j < word2.length()) {
            result.append(word2.charAt(j));
            j++;
        }
        
        return result.toString();
    }
}