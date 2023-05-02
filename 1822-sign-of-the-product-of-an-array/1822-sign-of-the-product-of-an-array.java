class Solution {
    public int arraySign(int[] nums) {
        int neg = 0;
        
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                neg++;
            }
        }
        
        return neg % 2 == 0 ? 1 : -1;
    }
}