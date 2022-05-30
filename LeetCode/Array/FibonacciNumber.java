/* Question - Fibonacci Number */
/* 
  The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

  F(0) = 0, F(1) = 1
  F(n) = F(n - 1) + F(n - 2), for n > 1.
  Given n, calculate F(n).
*/

/* Solution */

class Solution {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int c = a + b;
        int i = 2;
        while (i < n) {
            a = b;
            b = c;
            c = a + b;
            i++;
        }
        return c;
    }
}