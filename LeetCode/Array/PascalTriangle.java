/* Question - Pascal's Triangle */
/* 
  Given an integer numRows, return the first numRows of Pascal's triangle.
*/

/* Solution */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
		int r = 0;
		int val = 0;
		while(r < numRows) {
			List<Integer> list = new ArrayList<>();
			int i = 0;
			int ncr = 1;
			while(i <= val) {
				list.add(ncr);
				ncr = ((r - i) *ncr)/(i + 1);
				i++;
			}
			ans.add(list);
			r++;
			val++;
		}
        return ans;
    }
}