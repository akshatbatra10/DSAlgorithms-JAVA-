class Solution {
    private void merge(int[] arr, int left, int mid, int right, int[] tempArr) {
        int start1 = left;
        int start2 = mid + 1;
        int n1 = mid - left + 1;
        int n2 = right - mid;
        for (int i = 0; i < n1; i++) {
            tempArr[start1 + i] = arr[start1 + i];
        }
        for (int i = 0; i < n2; i++) {
            tempArr[start2 + i] = arr[start2 + i];
        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (tempArr[start1 + i] <= tempArr[start2 + j]) {
                arr[k] = tempArr[start1 + i];
                i += 1;
            } else {
                arr[k] = tempArr[start2 + j];
                j += 1;
            }
            k += 1;
        }
        while (i < n1) {
            arr[k] = tempArr[start1 + i];
            i += 1;
            k += 1;
        }
        while (j < n2) {
            arr[k] = tempArr[start2 + j];
            j += 1;
            k += 1;
        }
    }

    private void mergeSort(int[] arr, int left, int right, int[] tempArr) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid, tempArr);
        mergeSort(arr, mid + 1, right, tempArr);
        merge(arr, left, mid, right, tempArr);
    }
    
    public int[] sortArray(int[] nums) {
        int[] temporaryArray = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1, temporaryArray);
        return nums;
    }
}