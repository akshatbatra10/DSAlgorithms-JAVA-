class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int len = flowerbed.length;
        if (len == 1) {
            if (flowerbed[0] == 1) {
                return false;
            }
            return n == 1;
        }
        for (int i = 0; i < len && n > 0; i++) {
            if (flowerbed[i] == 0) {
                if (i == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                } else if (i == len - 1 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
                else if (i != 0 && i != len - 1) {
                    if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
            }
            if (n == 0) {
                return true;
            }
        }
        return false;
    }
}