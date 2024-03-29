class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int [] res = new int[2];
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff) && i!=map.get(diff)){
                res[0] = map.get(diff);
                res[1] = i;
                break;
            }
        }
        
        return res;
    
    }
}