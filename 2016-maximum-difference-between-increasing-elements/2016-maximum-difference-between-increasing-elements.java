class Solution {
    public int maximumDifference(int[] nums) {
        int max_diff = -1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    max_diff = Math.max(max_diff,nums[j]-nums[i]);
                }
            }
        }
        
        return max_diff;
    }
}