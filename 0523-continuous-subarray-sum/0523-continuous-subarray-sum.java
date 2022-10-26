class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int prefixSum = 0;
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        
        for(int i=0;i<n;i++){
            prefixSum = prefixSum + nums[i];
            int mod =prefixSum%k ;
            if(mod==0 && i>=1){
                return true;
            }
            if(hashmap.containsKey(mod) && i-hashmap.get(mod)>1){
                
                return true;
            }
            if(!hashmap.containsKey(mod)){
                hashmap.put(mod,i);
            } 
            
        }
        
        return false;
    }
}