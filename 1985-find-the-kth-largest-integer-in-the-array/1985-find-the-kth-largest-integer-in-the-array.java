import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> min_heap = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            BigInteger n = new BigInteger(nums[i]);
            if(min_heap.size()<k){
                min_heap.add(n);
            }
            else{
                if(n.compareTo(min_heap.peek())==1){
                    min_heap.poll();
                    min_heap.add(n);
                }
            }
        }
        
        return String.valueOf(min_heap.peek());
    }
}