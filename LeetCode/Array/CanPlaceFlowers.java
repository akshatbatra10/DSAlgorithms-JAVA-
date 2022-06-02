/* Question - Can Place Flowers */
/* 
  You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

  Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
*/

/* Solution */

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int len = flowerbed.length;
        if (len == 1) {
            if(flowerbed[0] == 0 && n == 1) {
                return true;
            }
            return false;
        }
        for (int i = 0; i < len && n > 0; i++) {
            if (flowerbed[i] == 0) {
                if (i != 0 && i != len - 1) {
                    if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
                if (i == 0) {
                    if (flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
                if (i == len - 1) {
                    if (flowerbed[i - 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
                if (n == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}