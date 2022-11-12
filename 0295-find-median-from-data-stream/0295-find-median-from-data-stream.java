class MedianFinder {

    /** initialize your data structure here. */
      PriorityQueue<Integer> minheap;
    PriorityQueue<Integer> maxheap;
    public MedianFinder() {
         minheap = new PriorityQueue<>();
        maxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
         //  }
        if(maxheap.size()==minheap.size()){
            maxheap.add(num);
            minheap.add(maxheap.poll());
            
        }
        else{
            minheap.add(num);
            maxheap.add(minheap.poll());
        }
    }
    
    public double findMedian() {
    double median=0;
        if(maxheap.size()==minheap.size()){
            median = (minheap.peek() + maxheap.peek())/2.0;
            
        }
        else{
            median = minheap.peek();
           
            //System.out.println(minheap.size());
        }
        return median;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */