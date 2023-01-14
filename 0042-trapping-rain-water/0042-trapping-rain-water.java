class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int [] res = new int[n];
        int [] left = new int[n];
        int [] right = new int[n];
        int leftmax = 0;
        int rightmax = 0;
        for(int i=0;i<n;i++){
           left[i] = leftmax;
           leftmax = Math.max(leftmax,height[i]);
            //System.out.println()
        }
        for(int i=n-1;i>=0;i--){
           right[i] = rightmax;
           rightmax = Math.max(rightmax,height[i]);
            
            
        }
        for(int i=0;i<n;i++){
            res[i] = Math.min(left[i],right[i]) - height[i];
            if(res[i]<0){
                res[i] = 0;
            }
        }
        
        int total = 0;
        for(int i:res){
            total = total + i;
        }
        
        return total;
    }
}