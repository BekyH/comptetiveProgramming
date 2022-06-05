class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int [] count = new int[1];
        findSum(nums,target,0,0,count);
        return count[0];
        
    }
    public void findSum(int [] nums,int target,int curr_sum,int i, int [] count){
         if(i>nums.length){
             return;
         }
        
        if(i==nums.length){
            if(curr_sum==target){
                count[0]++;
            }
            
            return;
        }
        else{
            findSum(nums,target,curr_sum + nums[i],i+1,count);
            findSum(nums,target,curr_sum-nums[i],i+1,count);
        }
    }
    
}