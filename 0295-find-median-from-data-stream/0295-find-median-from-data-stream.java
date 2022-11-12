class MedianFinder {
    
    PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> pq2 = new PriorityQueue<>();

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if (pq1.isEmpty() || pq1.peek() >= num) {
            pq1.add(num);
        } else {
            pq2.add(num);
        }
        if (pq1.size() > pq2.size() + 1) {
            pq2.add(pq1.poll());
        } else if (pq1.size() < pq2.size()) {
            pq1.add(pq2.poll());
        }
    }
    
    public double findMedian() {
        if (pq1.size() == pq2.size()) {
            int a = pq1.peek();
            int b = pq2.peek();
            return (1.0 * (a + b)) / 2;
        } else {
            return pq1.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */