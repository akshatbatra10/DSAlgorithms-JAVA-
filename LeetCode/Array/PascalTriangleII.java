/* Question - Pascal's Triangle II */
/* 
  Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle. 
*/

/* Solution */

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long ncr = 1;
		int i = 0;
		while (i <= rowIndex) {
			list.add((int)ncr);
			ncr = ((rowIndex - i) * ncr / (i + 1));
			i++;
		}
        return list;
    }
}