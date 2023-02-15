class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int carry = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            int sum = num[i] + carry + k % 10;
            if (sum > 9) {
                carry = 1;
                sum %= 10;
            } else {
                carry = 0;
            }
            num[i] = sum;
            k /= 10;
        }
        while (k != 0) {
            int sum = carry + k % 10;
            if (sum > 9) {
                sum %= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            ans.add(sum);
            k /= 10;
        }
        if (carry == 1) {
            ans.add(1);
        }
        Collections.reverse(ans);
        for (int i : num) {
            ans.add(i);
        }
        return ans;
    }
}