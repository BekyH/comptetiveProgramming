public class partitionArray {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int []leftmax = new int[n];
        int []rightmin = new int[n];
        leftmax[0]=nums[0];
        rightmin[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(nums[i],leftmax[i-1]);
            rightmin[n-i-1]=Math.min(nums[n-i-1],rightmin[n-i]);
            
        }
        for(int i=0;i<n;i++){
            if(leftmax[i]<=rightmin[i+1]){
                return i+1;
            }
        }
        return -1;
        
    }
}    
    

