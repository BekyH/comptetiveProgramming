class Solution {
    public boolean containsCycle(char[][] grid) {
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        int m = grid.length;
        int n = grid[0].length;
        
       boolean [][] visited = new boolean[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]){
                    
                     if(dfs(grid,directions,i,j,visited,i,j)){
                         return true;
                     }
                       
                }
                
                
            }
        }
        
        return false;
        
    }
    
    public boolean dfs(char[][] grid, int [][] directions,int row,int col,boolean [][] visited,int r,int c){
              visited[row][col] = true;
              for(int [] direction:directions){
                  int new_row = row + direction[0];
                  int new_col = col + direction[1];
                 if(new_row<0 || new_col<0 || new_row>=grid.length || new_col>=grid[0].length || grid[new_row][new_col]!=grid[row][col] || (new_row==r && new_col==c)){
                     continue;
                 }
                  else{
                      if(visited[new_row][new_col]){
                          return true;
                      }
                      else{
                          if(dfs(grid,directions,new_row,new_col,visited,row,col)){
                              return true;
                          }
                      }
                      
                  }
                  
              }
        return false;
                             
    }
}