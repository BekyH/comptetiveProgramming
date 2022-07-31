class Solution {
    public boolean isHappy(int n) {
        // if(n==1 || n==7){
        //     return true;
        // }
        // else if(n<=9){
        //     return false;
        // }
        String str = String.valueOf(n);
        
        return isHappy_helper(str);
    }
    public boolean isHappy_helper(String num){
        int number = Integer.parseInt(num);
        if(num.length()==1 && ((number==1) || (number==7))){
            return true;
        }
        if(num.length()==1 && (Integer.parseInt(num))!=1){
            return false;
        }
        int res =0;
        String[] nums = num.split("");
        for(int i=0;i<nums.length;i++){
            res = res + Integer.parseInt(nums[i]) * Integer.parseInt(nums[i]);
        }
        String s = String.valueOf(res);
        return isHappy_helper(s);
        
    }
}