class Solution {
    public int combinationSum4(int[] nums, int target) {
        int counter = 0;
        HashMap<List<Integer>,Integer> memo = new HashMap<>();
        
        
     for(int i=0;i<nums.length;i++){
         counter = counter + dfs(nums,i,target,nums[i],memo);
     }  
        return counter;
       
    }
    public int dfs(int[] nums,int index,int target,int running_sum,HashMap<List<Integer>,Integer> memo){
        List<Integer> list = Arrays.asList(index,running_sum);
        if(memo.containsKey(list)){
            return memo.get(list);
        }
        if (running_sum==target){
            return 1;
        }
        if(running_sum>target){
            return 0;
        }
        int count = 0;
        for(int j=0;j<nums.length;j++){
            count = count + dfs(nums,index,target,running_sum + nums[j],memo);
        }
        memo.put(list,count);
        return memo.get(list);
    }
}