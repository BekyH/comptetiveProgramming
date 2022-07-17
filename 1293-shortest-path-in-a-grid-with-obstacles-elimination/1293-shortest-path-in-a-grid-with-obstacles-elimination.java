class Solution {
    public int shortestPath(int[][] grid, int k) {
        int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        Deque<int[]> deque = new ArrayDeque<>();
        int m = grid.length;
        int n = grid[0].length;
        boolean[][][]visited = new boolean[m][n][k+1];
        int [] start = {0,0,k,0};
        
        deque.add(start);
        visited[0][0][k] = true;
        while(!deque.isEmpty()){
            int [] res = deque.poll();
            int r = res[0];
            int c = res[1];
            int k_amount = res[2];
            int step = res[3];
            if(r==m-1 && c==n-1){
                return step;
            }
            for(int [] direction:directions){
                int new_row = r + direction[0];
                int new_col = c + direction[1];
                if(new_row>=0 && new_row<m && new_col>=0 && new_col<n){
                    
                    if(!visited[new_row][new_col][k_amount] && grid[new_row][new_col]==0){
                        int [] curr = {new_row,new_col,k_amount,step+1};
                        deque.add(curr);
                        visited[new_row][new_col][k_amount] = true;
                        
                    }
                    else if(grid[new_row][new_col]==1 && k_amount>0 && !visited[new_row][new_col][k_amount-1]){
                         int [] curr = {new_row,new_col,k_amount-1,step+1};
                          deque.add(curr);
                          visited[new_row][new_col][k_amount-1] = true;
                        
                    }
                }
            }
        }
        
        return -1;
    }
}