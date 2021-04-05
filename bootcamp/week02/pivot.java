class pivot {
    

public int pivotIndex(int[] nums) {
    int n = nums.length;
    int[] prefixSum = new int[n+1];
     for(int i=1;i<=n;i++){
        prefixSum[i] = prefixSum[i-1] + nums[i-1];
        
    }
    
    for(int i = 0;i<n;i++){
        int left = prefixSum[i];
        int right = prefixSum[n]-prefixSum[i]-nums[i];
        if(left==right){
            return i;
            
        }
    }
    
    return -1;
}
}