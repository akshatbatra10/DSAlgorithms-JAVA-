class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int charInSection = 2 * (numRows - 1);
        
        for (int i = 0; i < numRows; i++) {
            int j = i;
            
            while (j < len) {
                sb.append(s.charAt(j));
                if (i != 0 && i != numRows - 1) {
                    int remaining = charInSection - (2 * i);
                    int idx = j + remaining;
                    if (idx < len) {
                        sb.append(s.charAt(idx));
                    }
                }
                j += charInSection;
            }
        }
        return sb.toString();
    }
}