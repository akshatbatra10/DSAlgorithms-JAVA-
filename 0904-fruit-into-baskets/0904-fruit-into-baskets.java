class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> fruit = new HashMap<>();
        int si = 0;
        int ei = 0;
        int max = 0;
        while (ei < fruits.length) {
            fruit.put(fruits[ei], fruit.getOrDefault(fruits[ei], 0) + 1);
            if (fruit.size() > 2) {
                fruit.put(fruits[si], fruit.get(fruits[si]) - 1);
                if (fruit.get(fruits[si]) == 0)
                    fruit.remove(fruits[si]);
                si++;
            }
            ei++;
            //max = Math.max(max, ei - si);
        }
        return ei - si;
    }
}