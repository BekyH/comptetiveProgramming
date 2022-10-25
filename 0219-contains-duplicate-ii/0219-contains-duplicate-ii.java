class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int left = 0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
               else{
                   set.add(nums[i]);
               }
               
               if(set.size()>k){
                   set.remove(nums[left]);
                   left++;
               }
        }
            
        return false;
    }
}