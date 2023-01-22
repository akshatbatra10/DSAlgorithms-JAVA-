class Solution {
    public List<List<String>> partition(String s) {
        List<String> list = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
        palindromePartitioning(s, list, ans);
        return ans;
    }
    public static void palindromePartitioning(String s, List<String> list, List<List<String>> ans) {
		if (s.length() == 0) {
			ans.add(new ArrayList<>(list));
			return;
		}
		for (int i = 1; i <= s.length(); i++) {
			String str = s.substring(0, i);
			if (palindrome(str)) {
				list.add(str);
				palindromePartitioning(s.substring(i), list, ans);
				list.remove(list.size() - 1);
			}
		}
	}

	public static boolean palindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}