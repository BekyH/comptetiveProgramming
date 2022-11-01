class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<List<Integer>> heap = new PriorityQueue<>((a,b)->b.get(1)-a.get(1));
        int [] res = new int[n-k+1];
        for(int i=0;i<k;i++){
            heap.add(Arrays.asList(i,nums[i]));
        }
        int index = 0;
        res[index++] = heap.peek().get(1);
        int right = k;
        while(right<n){
            heap.add(Arrays.asList(right,nums[right]));
            List<Integer> lst = heap.peek();
            while(right-lst.get(0)>=k){
                heap.poll();
                lst = heap.peek();
            }
            
            res[index++] = heap.peek().get(1);
            right++;
        }
        
        return res;
    }
}