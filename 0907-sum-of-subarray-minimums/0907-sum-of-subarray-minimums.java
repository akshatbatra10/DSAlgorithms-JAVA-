class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod = 1000000007;
        Stack<Integer> st = new Stack<>();
        
        long sum = 0;
        
        for (int i = 0; i <= arr.length; i++) {
            while (!st.isEmpty() && (i == arr.length || arr[st.peek()] >= arr[i])) {
                int idx = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;
                
                long count = (idx - left) * (right - idx) % mod;
                
                sum = (sum + (count * arr[idx]) % mod) % mod;
            }
            st.push(i);
        }
        
        return (int) sum;
    }
}