/* Question - Sqrt(x) */
/* 
  Given a non-negative integer x, compute and return the square root of x.

  Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

  Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
*/

/* Solution */

class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int low = 1;
	  int high = x / 2;
	  int mid;
     	  int ans = 1;
	  while (low <= high) {
		  mid = low + (high - low) / 2;
		  if (mid <= x / mid) {
			ans = mid;
			low = mid + 1;
	     	  } else {
			high = mid - 1;
	     	  }
	  }
	  return ans;
    }
}