class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int sum = (int) (a.charAt(i) - 48) + (int) (b.charAt(j) - 48) + carry;
            carry = sum / 2;
            sum %= 2;
            sb.append(sum);
            i--;
            j--;
        }
        while (i >= 0) {
            int sum = (int) (a.charAt(i) - 48) + carry;
            carry = sum / 2;
            sum %= 2;
            sb.append(sum);
            i--;
        }
        while (j >= 0) {
            int sum = (int) (b.charAt(j) - 48) + carry;
            carry = sum / 2;
            sum %= 2;
            sb.append(sum);
            j--;
        }
        if (carry == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}