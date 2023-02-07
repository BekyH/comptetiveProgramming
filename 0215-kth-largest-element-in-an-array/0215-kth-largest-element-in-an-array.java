class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        for(int num:nums){
            if(min_heap.size()<k){
                min_heap.add(num);
            }
            else{
                if(num>min_heap.peek()){
                    min_heap.poll();
                    min_heap.add(num);
                }
            }
        }
        
        return min_heap.peek();
    }
}