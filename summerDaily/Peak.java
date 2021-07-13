public class Peak {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        if(n==1){
            return 0;
        }
        
        while(left<=right){
             int mid = left + (right-left)/2;
             int elmt = nums[mid];
             if(mid!=0 && mid<right){
             if(elmt>nums[mid-1] && elmt>nums[mid+1]){
                 return mid;
             }
                 else if(elmt<nums[mid+1]){
                     left = mid+1;
                 }
                 else{
                     right = mid-1;
                 }
                 
             }
            
            else if(mid==left && mid<n-1){
                    if(nums[mid]>nums[mid+1]){
                        return mid;
                    }
                    else{
                        left = mid+1;
                    }
            }
            
            else if(mid==right && mid>0){
                if(nums[mid]>nums[mid-1]){
                    return mid;
                }
                else{
                    right=mid-1;
                }
            }
            
        }
        
        return 0;
    }
}
