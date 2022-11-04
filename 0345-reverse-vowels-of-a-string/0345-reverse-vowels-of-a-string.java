class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] ch = s.toCharArray();
        while (i < j) {
            char iChar = ch[i];
            char jChar = ch[j];
            boolean left = false;
            boolean right = false;
            if (iChar == 'a' || iChar == 'e' || iChar == 'i' || iChar == 'o' || iChar == 'u' || iChar == 'A' || iChar == 'E' || iChar == 'I' || iChar == 'O' || iChar == 'U') {
                left = true;
            }
            if (jChar == 'a' || jChar == 'e' || jChar == 'i' || jChar == 'o' || jChar == 'u' || jChar == 'A' || jChar == 'E' || jChar == 'I' || jChar == 'O' || jChar == 'U') {
                right = true;
            }
            if (left && right) {
                ch[i] = jChar;
                ch[j] = iChar;
                i++;
                j--;
            } else {
                if (left) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return new String(ch);
    }
}