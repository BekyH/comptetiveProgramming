class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans = new int[2];
        
        ans[0] = first_position(nums,target);
        ans[1] = last_position(nums,target);
        
        return ans;
        
        
    }
    public int first_position(int [] nums,int target){
        int left = 0;
        int right = nums.length-1;
        int best = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                best = mid;
                right = mid-1;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        
        return best;
    }
    
    public int last_position(int [] nums,int target){
        int left = 0;
        int right = nums.length-1;
        int best = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                best = mid;
                left = mid+1;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        
        return best;
    }
    
}