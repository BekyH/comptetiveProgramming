class Solution {
    public boolean increasingTriplet(int[] nums) {
       if(nums.length<2){
           return false;
       }
       double first = Double.POSITIVE_INFINITY;
       double second = Double.POSITIVE_INFINITY;
        double third = Double.POSITIVE_INFINITY;
        for(int num:nums){
            if(num<=first){
                first = (double)num;
            }
            else if(num<=second){
                second = (double)num;
            }
            else if(num<=third){
                third = (double)num;
            }
        }
        if(first==Double.POSITIVE_INFINITY || second ==Double.POSITIVE_INFINITY || third == Double.POSITIVE_INFINITY){
              return false;
        }
        
        return true;
    }
}