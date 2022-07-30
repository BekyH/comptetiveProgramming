class Solution {
    public int longestOnes(int[] nums, int k) {
         int left = 0;
        int right = 0;
        int max_len = Integer.MIN_VALUE;
        int kused = 0;
        while(right<nums.length){
            if(nums[right]==0){
                kused++;
            }
            while(kused>k){
                if(nums[left]==0){
                    kused--;
                }
                left++;
            }

            max_len = Math.max(max_len,right-left+1);
            right++;
        }

        return max_len;
    }
}