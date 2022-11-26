class Solution {
    class Job {
        int start;
        int end;
        int profit;
        
        Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }
    
    public int jobScheduling(int[] start, int[] end, int[] profit) {
        int n = start.length;
        Job[] jobs = new Job[n];
        int[] dp = new int[n];
        
        for(int i = 0 ; i < n ; i++) {
            jobs[i] = new Job(start[i], end[i], profit[i]);
            dp[i] = -1;
        }
            
        Arrays.sort(jobs, (a, b) -> a.start == b.start ? a.end - b.end : a.start - b.start);
        
        return helper(jobs, dp, 0);
    }
    
    public int helper(Job[] jobs, int[] dp, int i) {
        if(i >= jobs.length)
            return 0;
        
        if(dp[i] != -1)
            return dp[i];
        
        int j = i + 1;
        
        while(j < jobs.length && jobs[j].start < jobs[i].end)
			j++;
        
        return dp[i] = Math.max(helper(jobs, dp, j) + jobs[i].profit, helper(jobs, dp, i + 1));
    }
}