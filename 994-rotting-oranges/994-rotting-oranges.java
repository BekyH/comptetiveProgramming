class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int totalmin =0;
        Deque<int[]> deque = new ArrayDeque<>();
        int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    deque.add(new int[]{i,j,0});
                }
            }
        }
        
        while(!deque.isEmpty()){
            int[] cell = deque.poll();
            int row =cell[0];
            int col = cell[1];
            int min = cell[2];
            totalmin = min;
            for(int[] direction:directions){
                int new_row = row + direction[0];
                int new_col = col + direction[1];
                if(new_row>=0 && new_row<m && new_col>=0 && new_col<n && grid[new_row][new_col]==1){
                    grid[new_row][new_col] = 2;
                    deque.add(new int[]{new_row,new_col,min+1});
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                  return -1; 
                }
            }
        }
        
        return totalmin;
    }
}