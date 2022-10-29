class Solution {
    public int maxSubArray(int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        while(right<nums.length){
            sum = sum + nums[right];
            max_sum = Math.max(sum,max_sum);
            if(sum<0){
                sum = 0;
            }
            right++;
            
        }
        
        return max_sum;
    }
}