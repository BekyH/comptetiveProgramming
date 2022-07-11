class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        helper(new ArrayList<>(),nums,0,result);
        return result;
        
    }
    
    public void helper(List<Integer> path, int[] nums,int index,List<List<Integer>> result){
     
        result.add(new ArrayList<>(path));
        for(int i=index;i<nums.length;i++){
            
            path.add(nums[i]);
            helper(path,nums,i+1,result);
            
            path.remove(path.size()-1);
            
        }
    }
}