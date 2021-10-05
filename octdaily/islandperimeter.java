public class islandperimeter {
    //iterative
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    if(i==0 || grid[i-1][j]==0){
                        perimeter++;
                    }
                    if( i==grid.length-1 || grid[i+1][j]==0){
                        perimeter++;
                    }
                    if(j==0 || grid[i][j-1]==0){
         
                        perimeter++;
                    }
                    if(j==grid[0].length-1 || grid[i][j+1]==0){
                        perimeter++;
                    }
            }
                   
                }
            }
        
        return perimeter;
    }

    //dfs
    public int islandPerimeterdfs(int[][] grid) {
        int [] counter = new int[1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j,counter);
                }
            }
        }
        return counter[0];
        
    }
    public void dfs(int[][] grid,int row,int col,int[] counter){
        if(row<0 || col<0 || col>=grid[0].length || row>=grid.length){
            counter[0]++;
            return;
        }
        if(grid[row][col]==0){
            counter[0]++;
            return;
        }
        if(grid[row][col]==-1){
            return;
        }
        grid[row][col]=-1;
        dfs(grid,row-1,col,counter);
        dfs(grid,row+1,col,counter);
        dfs(grid,row,col+1,counter);
        dfs(grid,row,col-1,counter);
        
    }

}
