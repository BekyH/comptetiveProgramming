class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestsum = 0;
        int minDistance = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                
                int sum = nums[i] + nums[left] + nums[right];
                
                if(sum>target){
                    right--;
                }
                else{
                    left++;
                }
                int diff = Math.abs(sum-target);
                if(diff<minDistance){
                    closestsum = sum;
                    minDistance = diff;
                }
            }
            
        }
        return closestsum;
    }
}