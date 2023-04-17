class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>(candies.length);
        int max = candies[0];
        
        for (int i = 1; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        
        for (int i : candies) {
            if ((i + extraCandies) >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        
        return list;
    }
}