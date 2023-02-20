class Solution {
    public int maximumDifference(int[] nums) {
        int max_diff = Integer.MIN_VALUE;
        int curr = 0;
        for(int i=nums.length-1;i>=0;i--){
            curr = Math.max(curr,nums[i]);
            max_diff = Math.max(max_diff,curr-nums[i]);
        }
        
        if(max_diff==0){
            return -1;
        }
        
        return max_diff;
    }
}