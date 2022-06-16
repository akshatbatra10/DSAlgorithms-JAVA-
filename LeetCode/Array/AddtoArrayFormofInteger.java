/* Question - Add to Array-Form of Integer */
/* 
  The array-form of an integer num is an array representing its digits in left to right order.
    For example, for num = 1321, the array form is [1,3,2,1].
  Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
*/

/* Solution */

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int carry = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            if (k > 0) {
                int sum = num[i] + k % 10 + carry;
                if (sum < 10) {
                    list.add(sum);
                    carry = 0;
                } else {
                    list.add(sum % 10);
                    carry = 1;
                }
                k /= 10;
            } else {
                if (carry == 1) {
                    if (carry + num[i] < 10) {
                        list.add(carry + num[i]);
                        carry = 0;
                    } else {
                        list.add(0);
                        carry = 1;
                    }
                } else {
                    list.add(num[i]);
                }
            }
        }
        while (k > 0) {
            int sum = k % 10 + carry;
            if (sum < 10) {
                list.add(sum);
                carry = 0;
            } else {
                list.add(0);
                carry = 1;
            }
            k /= 10;
        }
        if (carry == 1) {
            list.add(1);
        }
        Collections.reverse(list);
        return list;
    }
}