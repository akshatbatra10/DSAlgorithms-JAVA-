class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = min;
        int sum = max;
        
        for (int i = 1; i < salary.length; i++) {
            sum += salary[i];
            if (max < salary[i]) {
                max = salary[i];
            }
            if (min > salary[i]) {
                min = salary[i];
            }
        }
        
        return (double) (sum - (min + max)) / (salary.length - 2);
    }
}