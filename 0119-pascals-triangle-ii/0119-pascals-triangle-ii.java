class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        HashMap<List<Integer>,Integer> memo = new HashMap<>();
        for(int i=0;i<=rowIndex;i++){
            int val = pascal(rowIndex,i,memo);
            result.add(val);
        }
        System.out.println(memo);
        
        return result;
        
    }
    
    public int pascal(int row, int col,HashMap<List<Integer>,Integer> memo){
        if(row==0 || col==0 || row==col){
            return 1;
        }
        List<Integer> lst = Arrays.asList(row,col);
        if(memo.containsKey(lst)){
            return memo.get(lst);
        }
        memo.put(lst,pascal(row-1,col,memo) + pascal(row-1,col-1,memo));
        
        return memo.get(lst);
    }
}