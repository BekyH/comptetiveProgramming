class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0;
        for(int i:nums){
            total = total + i;
        }
        int tempSum = total - x;
        int runningSum = 0;
        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;
        while(right<nums.length){
            runningSum = runningSum + nums[right];
            while(left<=right && runningSum>tempSum){
                runningSum = runningSum - nums[left];
                left++;
            }
            if(runningSum==tempSum){
                max = Math.max(max,right-left+1);
            }
            right++;
        }
        
        if(max==Integer.MIN_VALUE){
            return -1;
        }
        
        return nums.length-max;
    }
}