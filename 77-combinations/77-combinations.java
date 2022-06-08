class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        
        helper(1,result,n,k,new ArrayList<>());
        return result;
    }
    
    public void helper(int index,List<List<Integer>> result,int n,int k,List<Integer> lst){
        
        if(lst.size()==k){
            result.add(new ArrayList<>(lst));
            return;
        }
        
        for(int i=index;i<=n;i++){
            lst.add(i);
            helper(i+1,result,n,k,lst);
            lst.remove(lst.size()-1);
        }
    }
}