class Solution {
    public int numIslands(char[][] grid) {
        int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    grid[i][j]='0';
                    count++;
                    dfs(grid,i,j,directions);
                }
            }
        }
        
        return count;
    }
    
    public void dfs(char[][] grid,int row,int col,int [][] directions){
        for(int [] direction:directions){
            int new_row = row + direction[0];
            int new_col = col + direction[1];
            if(new_row>=0 && new_row<grid.length && new_col>=0 && new_col<grid[0].length && grid[new_row][new_col]=='1'){
                grid[new_row][new_col] = '0';
                dfs(grid,new_row,new_col,directions);
            }
        }
    
}
}