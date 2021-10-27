public class maxConsecutive {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        while(right<nums.length){
            if(nums[right]==0){
                k = k-1;
            }
            if(k<0){
                if(nums[left]==0){
                    k = k+1;
                
                }
                left++;
            }
            right++;
        }
        return right-left;
    }
}
