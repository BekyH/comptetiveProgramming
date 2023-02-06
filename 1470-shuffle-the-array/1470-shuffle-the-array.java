class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] res = new int[nums.length];
        int left = 0;
        int right = n;
        int index = 0;
        while(right<nums.length){
            res[index++] = nums[left++];
            res[index++] = nums[right++];
            
        }
        
        return res;
    }
}