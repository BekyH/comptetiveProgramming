class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(right<nums.length){
             sum = sum + nums[right];
             while(left<=right && sum>=target){
                  min = Math.min(min,right-left+1);
                 sum = sum-nums[left];
                 left++;
             }
            
            right++;
        }
     //   min = Math.min(min,right-left+1);
        
        return min==Integer.MAX_VALUE? 0:min;
    }
}