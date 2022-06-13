class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
     HashMap<List<Integer>,Integer> memo = new HashMap<>();
        int min_path_sum = dfs(triangle,0,0,memo);
        return min_path_sum;
    }
    public int dfs(List<List<Integer>> triangle,int row,int col,HashMap<List<Integer>,Integer> memo){
        if(row>=triangle.size()){
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        list.add(row);
        list.add(col);
        if(memo.containsKey(list)){
            return memo.get(list);
        }
        int left = dfs(triangle,row+1,col,memo);
        int right = dfs(triangle,row+1,col+1,memo);
        int current_path = triangle.get(row).get(col) + Math.min(left,right);
        memo.put(list,current_path);
        return memo.get(list);
     }
    
}