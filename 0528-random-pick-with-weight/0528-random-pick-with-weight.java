class Solution {
  int [] pre;
    public Solution(int[] w) {
        pre = new int[w.length];
        pre[0] = w[0];
        for(int i=1;i<w.length;i++){
            pre[i] = pre[i-1] + w[i];
            
        }
        
}
    
    public int pickIndex() {
         int rand = pre[0] + (int)(Math.random() * pre[pre.length-1]+1);
         return nextGreater(rand,pre);
    }
    
    public int nextGreater(int num,int[] arr){
        int left = 0;
        int right = arr.length-1;
        int  best = 0;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(num==arr[mid]){
                return mid;
            }
            else if(arr[mid]>num){
                best = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
                
        }
        
        return best;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */