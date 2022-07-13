class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        int freshcount = 0;
        int min = 0;
        Deque<int[]> deque = new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                     deque.add(new int[]{i,j,0});
                }
                else if(grid[i][j]==1){
                      freshcount++;
                }
            }
        }
        
        while(!deque.isEmpty()){
            int [] curr = deque.poll();
            int curr_row = curr[0];
            int curr_col = curr[1];
            int curr_min = curr[2];
            min = curr_min;
            for(int [] direction:directions){
                 int row = curr_row + direction[0];
                 int col = curr_col + direction[1];
                if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && grid[row][col]==1){
                    grid[row][col] = 2;
                    freshcount--;
                    deque.add(new int[]{row,col,curr_min+1});
                }
            }
        }
        
        return freshcount==0? min:-1;
    }
}