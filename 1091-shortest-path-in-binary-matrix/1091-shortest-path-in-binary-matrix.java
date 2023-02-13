class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][] directions = {{-1,0},{1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        Deque<Path> deque = new ArrayDeque<>();
        
        
        int n =grid[0].length;
        boolean [][] visited = new boolean[n][n];
            if(grid[0][0]!=0 || grid[n-1][n-1]!=0){
                return -1;  
            }
            Path node = new Path(1,0,0);
            
            deque.add(node);
        
        
        while(!deque.isEmpty()){
            Path parent = deque.poll();
            int path = parent.len;
            int r = parent.row;
            int c = parent.col;
            if(r==n-1 && c==n-1){
                return path;
            }
            if(visited[r][c]){
                continue;
            }
            visited[r][c] = true;
            for(int [] direction:directions){
                int new_row = r + direction[0];
                int new_col = c + direction[1];
                
                if(new_row>=0 && new_row<n && new_col>=0 && new_col<n && grid[new_row][new_col]==0 && !visited[new_row][new_col]){
                    Path child = new Path(path+1,new_row,new_col);
                    deque.add(child);
                }
                
            }
            
        }
        return -1;
    
    }  
        
    }
    class Path{
        int len;
        int row;
        int col;
        Path(int len, int row,int col){
            this.len = len;
            this.row = row;
            this.col = col;
            }
    }
