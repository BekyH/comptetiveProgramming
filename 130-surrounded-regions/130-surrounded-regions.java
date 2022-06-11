class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean [][] invalid = new boolean[m][n];
        int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==m-1 || j==n-1){
                    if(board[i][j]=='O'){
                        invalid[i][j] = true;
                        dfs(board,i,j,directions,invalid);
                    }
                    
                    
                }
            }
        }
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(!invalid[i][j]){
                   board[i][j] = 'X';
               }
              // System.out.print(invalid[i][j] + " ");
           }
           //System.out.println(" ");
       }
        
        
        
        
    }
    public void dfs(char[][] board,int row,int col,int [][] directions, boolean[][] invalid)
    {
         for(int [] direction: directions){
             
             int new_row = row+direction[0];
             int new_col = col + direction[1];
             
             if(new_row>=0 && new_row<board.length && new_col>=0 && new_col<board[0].length && board[new_row][new_col]=='O' && !invalid[new_row][new_col]){
                 invalid[new_row][new_col] = true;
                 dfs(board,new_row,new_col,directions,invalid);
             }
         }
    }
}