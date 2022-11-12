class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];
        int even = 0;
        int odd = 1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                result[even] = nums[i];
                even = even+2;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                result[odd] = nums[i];
                odd = odd+2;
            }
        }
        
        return result;
    }
}