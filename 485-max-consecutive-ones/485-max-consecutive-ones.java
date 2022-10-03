class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int n = nums.length;
        int right = 0;
        int max = Integer.MIN_VALUE;
        while(right<n){
            if(nums[left]==0){
                left++;
                right = left;
                continue;
            }
            if(nums[right]==1){
                right++;
            }
           else if(nums[right]==0){
                max = Math.max(right-left,max);
                left = right+1;
                right = left;
            }
        }
                max = Math.max(right-left,max);
        
        return max;
    }
}