class Solution {
    public int minMaxGame(int[] nums) {
        
        return helper(nums);
    }
    
    public int helper(int [] nums){
        if(nums.length==1){
            return nums[0];
        }
        
        int [] newNums = new int[nums.length/2];
        for(int i=0;i<nums.length/2;i++){
            if(i%2==0){
               newNums[i] = Math.min(nums[2*i],nums[2*i+1]); 
            }
            else{
                newNums[i] = Math.max(nums[2*i],nums[2*i+1]);
            }
             
        }
        return helper(newNums);
    }
}