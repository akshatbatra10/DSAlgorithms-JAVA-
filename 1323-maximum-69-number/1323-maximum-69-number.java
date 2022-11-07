class Solution {
    public int maximum69Number (int num) {
        int n = num;
        int ans = 0;
        int rev = 0;
        int pos = -1;
        int count = 0;
        while (n > 0) {
            count++;
            int r = n % 10;
            if (r == 6) {
                pos = count;
            }
            rev = rev * 10 + r;
            n /= 10;
        }
        pos = count - pos;
        count = 0;
        while (rev > 0) {
            if (count == pos) {
                ans = ans * 10 + 9;
            } else {
                ans = ans * 10 + rev % 10;
            }
            count++;
            rev /= 10;
        }
        return ans;
    }
}