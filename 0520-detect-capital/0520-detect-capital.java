class Solution {
    public boolean detectCapitalUse(String word) {
        if (Character.isLowerCase(word.charAt(0))) {
            int i = 1;
            while (i < word.length() && Character.isLowerCase(word.charAt(i))) {
                i++;
            }
            return i == word.length();
        }
        int i = 1;
        if (i < word.length() && Character.isUpperCase(word.charAt(i))) {
            while (i < word.length() && Character.isUpperCase(word.charAt(i))) {
                i++;
            }
            return i == word.length();
        }
        while (i < word.length() && Character.isLowerCase(word.charAt(i))) {
            i++;
        }
        return i == word.length();
    }
}