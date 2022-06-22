class Solution {
    public List<List<Integer>> subsets(int[] nums) {
              List<List<Integer>> subsets = new ArrayList<>();
               subset_generator(subsets, new ArrayList<>(),0,nums); 
                return subsets;
    }
    public void subset_generator(List<List<Integer>> list,List<Integer> result,int i,int[] nums){
        
            list.add(new ArrayList<>(result));
        
         
        for(int j=i;j<nums.length;j++){
            result.add(nums[j]);
            subset_generator(list,result,j+1,nums);
            result.remove(result.size()-1);
            
        }
    }

}