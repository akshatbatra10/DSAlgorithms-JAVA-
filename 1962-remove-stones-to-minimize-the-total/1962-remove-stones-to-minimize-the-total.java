class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : piles) {
            pq.add(ele);
        }
        while (k > 0) {
            int val = pq.remove();
            int floorVal = val / 2;
            pq.add(val - floorVal);
            k--;
        }
        int sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.remove();
        }
        return sum;
    }
}