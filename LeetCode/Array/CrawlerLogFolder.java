/* Question - Crawler Log Folder */
/* 
  The Leetcode file system keeps a log each time some user performs a change folder operation.

  The operations are described below:

  "../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
  "./" : Remain in the same folder.
  "x/" : Move to the child folder named x (This folder is guaranteed to always exist).
  You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.

  The file system starts in the main folder, then the operations in logs are performed.

  Return the minimum number of operations needed to go back to the main folder after the change folder operations.
*/

/* Solution */

class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("./")) {
                continue;
            } else if (logs[i].equals("../")) {
                if (count > 0) {
                    count--;
                }
            } else {
                count++;
            }
        }
        return count;
    }
}
