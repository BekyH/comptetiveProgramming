public class nonDecreasing {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        boolean isPossible = false;
        if(n<=2){
            return true;

        }
        for(int i = 0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                if(isPossible){
                    return true;
                }
                else{
                    isPossible = true;
                }
                if(i>0){
                    if(nums[i-1]>nums[i+1]){
                        nums[i+1] = nums[i];
                    }
                }

            }
        }
        return true;

    }
}
