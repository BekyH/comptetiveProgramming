class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int counter = 0;
        int max = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                counter++;
            }
            else{
                max = Math.max(counter,max);
                counter=0;
            }
        }
                max = Math.max(counter,max);
        
        return max+1;
    }
}