class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
           List<List<Integer>> result = new ArrayList<>();
           int m = heights.length;
           int n = heights[0].length;
           
           int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    boolean[][] visited = new boolean[m][n];
                    visited[i][j] = true;
                    boolean [] pflag = new boolean[1];
                    boolean [] aflag = new boolean[1];
                    dfs(heights,directions,visited,i,j,pflag,aflag);
                    if(pflag[0] && aflag[0]){
                          result.add(Arrays.asList(i,j));
                    }
                }
            }
           
           return result;
    }
    
    public void dfs(int [][] heights,int[][] directions,boolean [][] visited,int row,int col, boolean [] pflag,boolean[] aflag){
            if(row==0 || col==0){
                pflag[0] = true;
            }
           if(row==heights.length-1 || col==heights[0].length-1){
               aflag[0] = true;
           }
        
        for(int [] direction:directions){
            int new_row = row + direction[0];
            int new_col = col + direction[1];
            if(new_row>=0 && new_row<heights.length && new_col>=0 && new_col<heights[0].length && !visited[new_row][new_col] && heights[row][col]>=heights[new_row][new_col]){
                
                visited[new_row][new_col] = true;
                dfs(heights,directions,visited,new_row,new_col,pflag,aflag);
            }
        }
    }
}

