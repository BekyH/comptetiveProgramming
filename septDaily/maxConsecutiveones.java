public class maxConsecutiveones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLength = Integer.MIN_VALUE;
         if(nums.length== 1 && nums[0]==1){
            return 1;
        }
        if(nums.length==1 && nums[0]==0){
            return 0;
        }
        int left = 0;
        int right = 1;
        int n = nums.length;
        while(right<n){
            if(nums[left]==1 && nums[right]==1){
                right++;
            }
            else{
                
               if(nums[left]==1 || nums[right]==1){
                  maxLength = Math.max(maxLength,right-left);
                   
               }
                left = right+1;
                right++;
            }
            
            
        }
       
        maxLength = Math.max(maxLength,right-left);
        return maxLength;
        
        
    }
}
