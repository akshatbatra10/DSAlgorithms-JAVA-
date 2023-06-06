class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int minValue = Arrays.stream(arr).min().getAsInt();
        int maxValue = Arrays.stream(arr).max().getAsInt();
        int n = arr.length;
        if ((maxValue - minValue) % (n - 1) != 0) {
            return false;
        }
        
        int diff = (maxValue - minValue) / (n - 1);
        int i = 0;
        
        while (i < n) {
            if (arr[i] == minValue + i * diff) {
                i += 1;
                
            } else if ((arr[i] - minValue) % diff != 0) {
                return false;
                
            } else {
                int j = (arr[i] - minValue) / diff;
                
                if (arr[i] == arr[j]) {
                    return false;
                }
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        return true;
    }
}