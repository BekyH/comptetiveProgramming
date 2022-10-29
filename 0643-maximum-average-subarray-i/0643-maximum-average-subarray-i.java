class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max_avg = 0;
        double sum = 0;
         for(int i=0;i<k;i++){
              sum = sum + nums[i];
             
         }
        max_avg = sum/k;
        int left = 0;
        int right = k;
        while(right<nums.length){
              sum = sum-nums[left];
              sum = sum + nums[right];
              double curr_avg = sum/k;
            max_avg = Math.max(curr_avg,max_avg);
            left++;
            right++;
        }
        
        return max_avg;
    }
}