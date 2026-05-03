class MedianFinder {
     PriorityQueue<Integer> maxhp=new PriorityQueue<>(Collections.reverseOrder());
     PriorityQueue<Integer> minhp= new PriorityQueue<>();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        maxhp.offer(num);
        minhp.offer(maxhp.poll());
        if(minhp.size()>maxhp.size()){
            maxhp.offer(minhp.poll());
        }
    }
    public double findMedian() {
        if(maxhp.size() > minhp.size()){ // this odd case 
        return maxhp.peek();
        }
        return (maxhp.peek()+minhp.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */