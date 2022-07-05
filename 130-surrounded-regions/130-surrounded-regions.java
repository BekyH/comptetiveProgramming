class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int [][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==m-1 || j==n-1){
                    if(board[i][j]=='O'){
                        dfs(board,directions,i,j);
                    }
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'){
                    board[i][j] = 'X';
                }
            }
        }
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='A'){
                    board[i][j] = 'O';
                }
            }
        }
        
    }
    
    public void dfs(char[][] board, int[][] directions,int i,int j){
        board[i][j] = 'A';
        for(int [] direction:directions){
            int new_row = i + direction[0];
            int new_col = j + direction[1];
            if(new_row>=0 && new_col>=0 && new_row<board.length && new_col<board[0].length && board[new_row][new_col]=='O'){
               dfs(board,directions,new_row,new_col); 
            }
        }
    }
}