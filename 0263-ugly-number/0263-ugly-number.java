class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        n = divide(n, 2);
        n = divide(n, 3);
        n = divide(n, 5);

        return n == 1;
    }

    private int divide(int dividend, int divisor) {
        while (dividend % divisor == 0) {
            dividend /= divisor;
        }
        return dividend;
    }
}