import java.util.Collections;
import java.util.PriorityQueue;

public class findingThenmedian {
    PriorityQueue<Integer> minheap;
    PriorityQueue<Integer> maxheap;
    public findingThenmedian() {
        minheap = new PriorityQueue<>();
        maxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
    }

    public void addNum(int num) {

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

