public class maxAreaofIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        int maxarea = 0;
        int[][] directions = {{1,0},{0,-1},{-1,0},{0,1}};
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    area=dfs(grid,i,j,directions,m,n);
                    maxarea = Math.max(area,maxarea);
                }
            }
        }
        return maxarea;
    }
    public int dfs(int[][] grid,int row,int col,int[][]directions,int m,int n){
        int counter = 1;
        grid[row][col]=0;
        for(int[] direction:directions){
            int newrow = row + direction[0];
            int newcol = col + direction[1];
            if(newrow>=0 && newrow<m && newcol>=0 && newcol<n && grid[newrow][newcol]==1){
                counter+=dfs(grid,newrow,newcol,directions,m,n);
            }
        }
        return counter;
    }
}



