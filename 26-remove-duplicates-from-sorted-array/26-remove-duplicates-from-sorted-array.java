class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 0;
        for(int i = 0;i<nums.length;i++){
            if(i==0){
                nums[right++] = nums[i];
            }
            else{
                 if(nums[left]!=nums[i]){
                     nums[right] = nums[i];
                     left = right;
                     right++;
                 }
            }
        }
        
        return right;
    }
}
