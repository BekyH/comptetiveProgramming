import java.util.Collections;
import java.util.PriorityQueue;

public class StoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        if(stones.length==0){
            return 0;
        }
        if(stones.length==1){
            return stones[0];
        }
        for (int x : stones) {
            heap.add(x);

        }
        while (heap.size() > 1) {
            int a = heap.poll();
            int b = heap.poll();

            if (a == b) {

            } else {
                int c = a - b;
                heap.add(c);

            }

        }



        if (heap.size() == 0) {
            return 0;
        }
        if (heap.size() == 1) {
            return heap.peek();
        }
        return 0;

    }
}
