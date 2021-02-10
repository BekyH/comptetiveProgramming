import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargest {
    PriorityQueue<Integer> min_heap;
    int k;
    public kthLargest(int k, int[] nums) {
        min_heap = new PriorityQueue<>();
        this.k = k;
        for(int x:nums){
            addToHeapHelper(min_heap,x,k);
        }


    }

    public int add(int val) {
        addToHeapHelper(min_heap,val,k);
        return min_heap.peek();



    }

    public void addToHeapHelper(PriorityQueue<Integer> heap,int num,int k){
        if(heap.size()<k){
            heap.add(num);
        }
        else{
            if(num>heap.peek()){
                heap.poll();
                heap.add(num);
            }
        }

    }
}
