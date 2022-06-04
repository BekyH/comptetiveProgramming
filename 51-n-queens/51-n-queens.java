class Solution {
    public List<List<String>> solveNQueens(int n) {
     Set<Integer> cols = new HashSet<>();
     Set<Integer> pd = new HashSet<>();
     Set<Integer> nd = new HashSet<>();
     List<List<String>>result = new ArrayList<>();
     String [][] board = new String[n][n];
     for(String[] row:board){
         Arrays.fill(row,".");
         }
        backtrack(board,n,0,result,pd,nd,cols);
                return result;
        
    }
    
    public void backtrack(String[][] board,int n,int row,List<List<String>> result,Set<Integer> pd,Set<Integer> nd,Set<Integer> cols){
        //System.out.println(row);

        if(row==n){
            addPath(board,n,result);
            return;
        }
        
        for(int col=0;col<n;col++){
            int x = row+col;
            int y = row-col;
            if(cols.contains(col) || pd.contains(x) || nd.contains(y)){
                continue;
            }
            
            
            cols.add(col);
            pd.add(row+col);
            nd.add(row-col);
            board[row][col]="Q";
            backtrack(board,n,row+1,result,pd,nd,cols);
            cols.remove(col);
            pd.remove(row+col);
            nd.remove(row-col);
            board[row][col]=".";
        }
        
    }
    public void addPath(String[][] board,int n,List<List<String>> result){
         List<String> lst = new ArrayList<>();

        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
                       for(int j=0;j<n;j++){
                   sb.append(board[i][j]);
               }
            
                lst.add(sb.toString());
            
            }
        result.add(lst);
    }
}