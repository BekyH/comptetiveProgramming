class Solution {
    public int minFallingPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int curr_min = Integer.MAX_VALUE;
                for(int k=0;k<n;k++){
                    if(k!=j){
                        curr_min = Math.min(curr_min,grid[i-1][k]);
                    }
                }
                grid[i][j] =grid[i][j]+ curr_min;
            }
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int  x:grid[n-1]){
            min = Math.min(min,x);
        }
        
        return min;
    }
}