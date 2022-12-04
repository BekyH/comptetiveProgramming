class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long [] prefix = new long[n];
        long [] prefixavg = new long[n];
        long [] suffix = new long[n];
        long [] suffixavg = new long[n];
        long [] res = new long[n];
        suffix[n-1] = nums[n-1];
        suffixavg[n-1] = nums[n-1];
        prefix[0] = nums[0];
        prefixavg[0] = nums[0];
        for(int i=1;i<n;i++){
            prefix[i]= prefix[i-1] + nums[i];
              
            prefixavg[i] = prefix[i] / (i+1);
            
        }
        for(int i = n-2;i>=0;i--){
            suffix[i] = suffix[i+1] + nums[i];
            suffixavg[i] = suffix[i]/(n-i);
        }
       for(int i=0;i<n-1;i++){
           res[i] = Math.abs(prefixavg[i]-suffixavg[i+1]);
       }
        res[n-1] = suffixavg[0];
       
        long min = Long.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if((long)res[i]<min){
                min = res[i];
                minIndex = i;
            }
        }
        
        return minIndex;
    }
}