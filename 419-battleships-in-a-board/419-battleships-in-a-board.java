class Solution {
    public int countBattleships(char[][] board) {
       int [][] directions = {{1,0},{0,1}};
        int counter = 0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    board[i][j] = '.';
                    dfs(directions,board,i,j);
                    counter++;
                }
            }
        }
        
        
        return counter;
        
    }
    public void dfs(int[][] directions,char[][] board,int row,int col){
        for(int [] direction:directions){
            int new_row = row+direction[0];
            int new_col = col + direction[1];
            if(new_row>=0 && new_row<board.length && new_col>=0 && new_col<board[0].length && board[new_row][new_col]=='X'){
                board[new_row][new_col]='.';
                dfs(directions,board,new_row,new_col);
            }
        }
    }
}