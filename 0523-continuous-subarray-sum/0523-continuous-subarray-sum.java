class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int [] prefixSum = new int[nums.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        prefixSum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i] = nums[i] + prefixSum[i-1];
            
        }
        for(int i=0;i<prefixSum.length;i++){
             prefixSum[i] = prefixSum[i]%k;
             if(map.containsKey(prefixSum[i])){
                  int diff = i - map.get(prefixSum[i]);
                 if(diff>1){
                     return true;
                 }
                
             }
            else{
               map.put(prefixSum[i],i); 
            }
           //  
        }
        
        return false;
        
    }
}