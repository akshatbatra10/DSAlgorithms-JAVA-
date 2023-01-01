class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (pattern.length() != str.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<Character, String>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!map.containsKey(c) && map.containsValue(str[i])) {
                return false;
            }
            map.put(c, str[i]);
        }
        for (int i = 0; i < str.length; i++) {
            if (!map.get(pattern.charAt(i)).equals(str[i])) {
                return false;
            }
        }
        return true;
    }
}