class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int i = 0;
        for (; i < intervals.length; i++) {
            if (intervals[i][1] < newInterval[0]) {
                ans.add(intervals[i]);
            } else {
                break;
            }
        }
        int si = newInterval[0];
        int ei = newInterval[1];
        for (; i < intervals.length; i++) {
            if (intervals[i][0] > ei) {
                break;
            }
            si = Math.min(si, intervals[i][0]);
            ei = Math.max(ei, intervals[i][1]);
        }
        ans.add(new int[]{si, ei});
        for (; i < intervals.length; i++) {
            ans.add(intervals[i]);
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}