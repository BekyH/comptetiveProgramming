package com.company;

public class HouseRobber {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        for(int i = 2;i<n;i++){
            if((i-3)>=0 && (i-2)>=0){
                nums[i] = nums[i] + Math.max(nums[i-2],nums[i-3]);
            }
            else if(((i-2)>=0)){
                nums[i] =nums[i] + nums[i-2];
            }
        }
        return Math.max(nums[n-2],nums[n-1]);
    }
}
