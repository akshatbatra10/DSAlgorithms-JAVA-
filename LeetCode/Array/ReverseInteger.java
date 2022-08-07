/* Question - Reverse Integer */
/* 
  Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

  Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
*/

/* Solution */

class Solution {
    public int reverse(int x) {
        if (x >= 0 && x <= 9) {
            return x;
        }
        boolean isNegative = false;
        if (x < 0) {
            x = -x;
            isNegative = true;
        }
        if (isNegative) {
            return -1 * reverseNum(x);
        } else {
            return reverseNum(x);
        }
        
    }
    public int reverseNum(int n) {
        long rev = 0;
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        if (Integer.MAX_VALUE < rev || Integer.MIN_VALUE > rev) {
            return 0;
        }
        return (int)rev;
    }
}