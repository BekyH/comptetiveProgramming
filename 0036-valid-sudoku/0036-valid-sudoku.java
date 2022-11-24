class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            Set<Character> rowset = new HashSet<>();
            for(int j=0;j<board[0].length;j++){
                if(rowset.contains(board[i][j])){
                    
                    return false;
                }
                else if(board[i][j]!='.'){
                    rowset.add(board[i][j]);
                }
            }
        }
        for(int i=0;i<board[0].length;i++){
            Set<Character> colset = new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(colset.contains(board[j][i])){
                    
                    return false;
                }
                else if(board[j][i]!='.'){
                    colset.add(board[j][i]);
                }
            }
        }
        int counter=1;
        int row = 0;
        int col=0;
        while(counter<=9){
            Set<Character> set = new HashSet<>();
            
            for(int i=row;i<=row+2;i++){
                for(int j=col;j<=col+2;j++){
                    if(set.contains(board[i][j])){

                        return false;
                    }
                    else if(board[i][j]!='.'){
                        set.add(board[i][j]);
                    }
                }
            }
            if(counter%3==0){
                row=row+3;
                col =0;
            }
            else{
              col = col+3;  
            }
              counter++;  
            }
        return true;
    }
}