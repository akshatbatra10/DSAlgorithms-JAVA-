class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        return Good_subarray(arr, k);
	}
   public static int Good_subarray(int[] arr, int k) {
		int n = arr.length;
		int[] frq = new int[k];
		int sum = 0;
		frq[0] = 1;
		for (int i = 0; i < n; i++) {
			sum += arr[i];// sum = sum+arr[i]
			sum = sum % k;
			if (sum < 0) {
				sum += k;
			}
			frq[sum] = frq[sum] + 1;

		}
		int ans = 0;
		for (int i = 0; i < frq.length; i++) {
			if (frq[i] >= 2) {
				ans = ans + (frq[i] * (frq[i] - 1)) / 2;
			}
		}
		return ans;

	}

}