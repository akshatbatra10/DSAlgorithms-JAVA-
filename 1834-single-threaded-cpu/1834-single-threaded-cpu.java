class Solution {
    public int[] getOrder(int[][] tasks) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[1] == b[1]) {
                    return a[2] - b[2];
                }
                return a[1] - b[1];
            }
        });
        
        int sortedTasks[][] = new int[tasks.length][3];
        for (int i = 0; i < tasks.length; i++) {
            sortedTasks[i][0] = tasks[i][0];
            sortedTasks[i][1] = tasks[i][1];
            sortedTasks[i][2] = i;
        }
        
        Arrays.sort(sortedTasks, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int order[] = new int[tasks.length];
        
        long currTime = 0;
        int taskIndex = 0;
        int ansIndex = 0;
        
        while (taskIndex < tasks.length || !pq.isEmpty()) {
            if (pq.isEmpty() && currTime < sortedTasks[taskIndex][0]) {
                currTime = sortedTasks[taskIndex][0];
            }
            
            while (taskIndex < tasks.length && currTime >= sortedTasks[taskIndex][0]) { 
                pq.add(sortedTasks[taskIndex]);
                taskIndex++;
            }
            
            int processTime = pq.peek()[1];
            int index = pq.peek()[2];
            pq.remove();
            
            currTime += processTime; 
            order[ansIndex++] = index;
        }
        
        return order;
    }
}