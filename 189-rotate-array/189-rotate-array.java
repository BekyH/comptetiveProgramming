class Solution {
    public void rotate(int[] nums, int k) {
        int len  = nums.length;
        
        while(k>len){
            k = k % len;
        }
        reverse(nums,0,len-k-1);
        reverse(nums,len-k,nums.length-1);
        reverse(nums,0,nums.length-1);
        
        
    }
    public void reverse(int [] nums,int start,int end){
        while(start<end){
             int temp = nums[start];
             nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}