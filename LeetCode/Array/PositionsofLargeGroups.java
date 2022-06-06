/* Question - Positions of Large Groups */
/* 
  In a string s of lowercase letters, these letters form consecutive groups of the same character.

  For example, a string like s = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z", and "yy".

  A group is identified by an interval [start, end], where start and end denote the start and end indices (inclusive) of the group. In the above example, "xxxx" has the interval [3,6].

  A group is considered large if it has 3 or more characters.

  Return the intervals of every large group sorted in increasing order by start index.
*/

/* Solution */

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int si = 0;
		int ei = 1;
        List<List<Integer>> ans = new ArrayList<>();
		while (ei < s.length()) {
			if (s.charAt(ei) == s.charAt(ei - 1)) {
				ei++;
				continue;
			}
			if (ei - si >= 3) {
				ans.add(Arrays.asList(new Integer[]{si, ei - 1}));
			}
			while (si < ei) {
				si++;
			}
			ei++;
		}
		if (ei - si >= 3) {
			ans.add(Arrays.asList(new Integer[]{si, ei - 1}));
		}
        return ans;
    }
}