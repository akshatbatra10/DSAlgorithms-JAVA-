/* Question - Plus One */
/* 
  You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

  Increment the large integer by one and return the resulting array of digits. 
*/

/* Solution */

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 0;
        if (digits[n-1] + 1 > 9) {
            carry = 1;
            digits[n - 1] = 0;
        } else {
            digits[n - 1] = digits[n-1] + 1;
        }
        if(carry != 0) {
            for (int i = n - 2; i >= 0; i--) {
                int sum = digits[i] + carry;
                if (sum < 10) {
                    digits[i] = sum;
                    carry = 0;
                } else {
                    digits[i] = 0;
                }
            }
        }
        if(carry != 0) {
            int[] ans = new int[n+1];
            ans[0] = 1;
            return ans;
        }
        return digits;
    }
}