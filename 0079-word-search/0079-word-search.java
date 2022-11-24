class Solution {
    public boolean exist(char[][] board, String word) {
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        int index = 0;
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(index)){
                   boolean result=dfs(board,directions,index+1,i,j,word);
                    if(result==true){
                        return true;
                    }
                }
            }
        }
            return false;
        }
    public boolean dfs(char[][] board,int[][] directions,int index,int row,int col,String word){
        if(index>=word.length()){
            return true;
        }
        boolean is_found = false;
        boolean ans = false;
        char curr_char = board[row][col];
        board[row][col]='*';
        for(int [] direction:directions){
            int new_row = row + direction[0];
            int new_col = col + direction[1];
            if(new_row>=0 && new_row<board.length && new_col>=0 && new_col<board[0].length && board[new_row][new_col]==word.charAt(index)){
                is_found = true;
                ans = ans || dfs(board,directions,index+1,new_row,new_col,word);
            }
        }
    board[row][col] = curr_char;
    
    return ans && is_found;
    
}
}