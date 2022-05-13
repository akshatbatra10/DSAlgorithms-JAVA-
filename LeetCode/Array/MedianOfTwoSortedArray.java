/* Question - Median of Two Sorted Arrays */
/* Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)). */

/* Solution */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double med = 0.0;
		int[] merge = merge(nums1, nums2);
		int mid = merge.length / 2;
		if (merge.length % 2 == 0) {
			med = (merge[mid] + merge[mid - 1]) / 2.0;
		} else {
			med = merge[mid];
		}
		return med;
    }
    public static int[] merge(int[] a, int[] b) {
		int i = 0;
		int j = 0;
		int[] merge = new int[a.length + b.length];
		int k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				merge[k] = a[i];
				i++;
				k++;
			} else {
				merge[k] = b[j];
				j++;
				k++;
			}
		}
		while (i < a.length) {
			merge[k] = a[i];
			i++;
			k++;
		}
		while (j < b.length) {
			merge[k] = b[j];
			j++;
			k++;
		}
		return merge;
	}
}