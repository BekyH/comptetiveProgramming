class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(path,0,0,candidates,target,result);
        return result;
    }
    public void dfs(List<Integer> path,int index,int sum,int [] candidates, int target,List<List<Integer>> result){
        if(sum>target){
            return;
        }
        if(sum==target){
            result.add(new ArrayList<>(path));
            //path = new ArrayList<>();
            return;
        }
        for(int i=index;i<candidates.length;i++){
            path.add(candidates[i]);
            dfs(path,i,sum +candidates[i],candidates,target,result);
            path.remove(path.size()-1);
        }
        
    }
}