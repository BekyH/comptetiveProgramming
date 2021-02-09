import java.util.PriorityQueue;

public class FurthestBulding {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        int n = heights.length;
        int jump = 0;
        for(int i = 0;i<n-1;i++){
            int diff = heights[i+1]-heights[i];
            if(diff<=0){
                jump++;
            }
            else {
                if(ladders>0){
                    min_heap.add(diff);
                    jump++;
                    ladders--;
                }
                else{

                    if(!min_heap.isEmpty() && diff>min_heap.peek()
                            && bricks-min_heap.peek()>=0 ){
                        int min = min_heap.peek();
                        min_heap.poll();
                        bricks = bricks - min;
                        jump++;
                        min_heap.add(diff);
                    }
                    else if(bricks>=diff){
                        bricks = bricks-diff;
                        jump++;

                    }
                    else{
                        break;
                    }
                }

            }
        }

        return jump;


    }


}
