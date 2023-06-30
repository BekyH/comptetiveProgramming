class Solution {
    public int[] twoSum(int[] nums, int target) {
            int [] res = new int[2];
            HashMap<Integer,Integer> hashmap = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int diff = target-nums[i];
                if(hashmap.containsKey(diff)){
                    res[0] = hashmap.get(diff);
                    res[1] =i;
                    break;
                }
                else{
                    hashmap.put(nums[i],i);
                }
            }
            return res;
    }
}