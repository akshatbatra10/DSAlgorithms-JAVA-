/* Question - Valid Mountain Array */
/* 
  Given an array of integers arr, return true if and only if it is a valid mountain array.

  Recall that arr is a mountain array if and only if:

    arr.length >= 3
    There exists some i with 0 < i < arr.length - 1 such that:
      arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
	arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
*/

/* Solution */

class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n <= 2) {
            return false;
        }
        int i = 0;
        for (;i < n - 1 && arr[i] < arr[i + 1]; i++);
        if (i == 0 || i == n - 1) {
            return false;
        }
        for (;i < n - 1 && arr[i] > arr[i + 1]; i++);
        if (i == n - 1) {
            return true;
        }
        return false;
    }
}