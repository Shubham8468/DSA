class MedianFinder {

    PriorityQueue<Integer> pq1;
    PriorityQueue<Integer> pq2;
    public MedianFinder() {
        pq1 = new PriorityQueue<>(Collections.reverseOrder());
        pq2 = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(pq1.size() == pq2.size()){
            pq2.offer(num);
            pq1.offer(pq2.poll());
        } else{
            if(num >= pq1.peek()){
                pq2.offer(num);
            } else{
                pq1.offer(num);
                pq2.offer(pq1.poll());
            }
        }
    }
    
    public double findMedian() {
        if(pq1.size() > pq2.size()){
            return (double)pq1.peek();
        } else{
            return ((double)pq1.peek() + pq2.peek())/2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */