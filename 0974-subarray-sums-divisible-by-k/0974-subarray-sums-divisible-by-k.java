class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int running_sum = 0;
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            running_sum = running_sum + nums[i];
            int val = running_sum % k;
            if(val<0){
                val = val +k;
            }
            if(map.containsKey(val)){
                count = count + map.get(val);
                int v = map.get(val);
                v = v +1;
                map.put(val,v);
            }
            else{
                map.put(val,1);
            }
        }
        
        
     return count;   
    }
}