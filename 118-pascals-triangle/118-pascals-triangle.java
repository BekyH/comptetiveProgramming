class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<List<Integer>,Integer> memo = new HashMap<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> lst = new ArrayList<>();
            for(int col = 1;col<=i;col++){
                int x = pascal(i,col,memo);
                lst.add(x);
            }
            result.add(lst);
        }
        return result;
    }
    public int pascal(int row,int col,HashMap<List<Integer>,Integer> memo){
        if(row<0 || col<0){
            return 0;
        }
        if(col==1 || col==row){
            return 1;
        }
        List<Integer> lt = Arrays.asList(row,col);
        if(memo.containsKey(lt)){
            return memo.get(lt);
        }
         int ans = pascal(row-1,col-1,memo) + pascal(row-1,col,memo);
        memo.put(lt,ans);
        return memo.get(lt);
    }
}