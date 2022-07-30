/* Question - Build an Array With Stack Operations */
/* 
  You are given an array target and an integer n.

  In each iteration, you will read a number from list = [1, 2, 3, ..., n].

  Build the target array using the following operations:

  "Push": Reads a new element from the beginning list, and pushes it in the array.
  "Pop": Deletes the last element of the array.
  If the target array is already built, stop reading more elements.
  Return a list of the operations needed to build target. The test cases are generated so that the answer is unique.
*/

/* Solution */

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int i = 0;
        int j = 0;
        while (i < target.length && j < n) {
            list.add("Push");
            if (target[i] == arr[j]) {
                i++;
                j++;
            } else {
                list.add("Pop");
                j++;
            }
        }
        return list;
    }
}
