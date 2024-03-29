class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        return Math.max(helper(Arrays.copyOfRange(nums,0,nums.length-1)),helper(Arrays.copyOfRange(nums,1,nums.length)));
    }
    public int helper(int [] nums){
         int n = nums.length;
        if(n==1){
            return nums[0];
        }
        
        for(int i=2;i<n;i++){
              if(i-3<0){
                  nums[i] = nums[i] + nums[i-2];
              }
             else{
                 nums[i] = nums[i] + Math.max(nums[i-3],nums[i-2]);
             }
            
            
        }
        
        return Math.max(nums[n-1],nums[n-2]);
    }
}