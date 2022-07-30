class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;
        while(right<nums.length){
            if(nums[left]==1 && nums[left]==nums[right]){
                right++;
            }
            else{
             max = Math.max(max,right-left);
                left = right+1;
                right = left;
            }
           
        }
        max = Math.max(max,right-left);
        return max;
    }
}
// 0 0 0 1 0 1
   