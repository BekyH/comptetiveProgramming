class Solution {
    public int numIslands(char[][] grid) {
        int counter = 0;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j,directions);
                    counter++;
                }
            }
        }
        
        return counter;
    }
    public void dfs(char[][] grid,int row,int col,int[][] directions){
           grid[row][col]='0';
           for(int [] direction:directions){
               int new_row = row + direction[0];
               int new_col = col + direction[1];
              if(new_row>=0 && new_row<grid.length && new_col>=0 && new_col<grid[0].length && grid[new_row][new_col]=='1'){
                  dfs(grid,new_row,new_col,directions);
              }
           }
    }
}