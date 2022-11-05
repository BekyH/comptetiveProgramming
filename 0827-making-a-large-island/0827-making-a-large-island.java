class Solution {
    public int largestIsland(int[][] grid) {
        int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        int m = grid.length;
        int n = grid[0].length;
        int max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
           int id = 2;
        boolean [][] seen = new boolean[m][n];
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    int size = bfs(grid,i,j,id,directions);
                     max = Math.max(max,size);
                    
                    map.put(id,size);
                    id++;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
        Set<Integer> set = new HashSet<>();
                
                int sum = 0;
              if(grid[i][j]==0){
                  for(int [] dir:directions){
                      int row = i + dir[0];
                      int col = j + dir[1];
                      if(row>=0 && row<m && col>=0 && col<n && !set.contains(grid[row][col]) && grid[row][col]!=0){
                        sum = sum + map.get(grid[row][col]);
                        set.add(grid[row][col]);
                                
                      }
                  }
                  
              }
                max = Math.max(max,sum+1);
            }
        }
       // System.out.println(map);
        return max;
        
    
        
         }
    public int bfs(int [][] grid,int i,int j,int id,int [][] directions){
         Deque<Node> deque = new ArrayDeque<>();
        boolean [][] seen = new boolean[grid.length][grid[0].length];
        Node node = new Node(i,j);
        grid[i][j] = id;
        int size = 0;
        deque.add(node);
        grid[i][j] = id;
        while(!deque.isEmpty()){
                    size++;
            
            Node nde = deque.poll();
            int r = nde.row;
            int c = nde.col;
            for(int [] dir:directions){
                int row = r + dir[0];
                int col = c + dir[1];
                if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && !seen[row][col] && grid[row][col]==1){
                    Node newnode = new Node(row,col);
                    deque.add(newnode);
                    seen[row][col] = true;
                    grid[row][col] = id;
                    
                }
            }
        }
        
        return size;
        
        
    }
}

class  Node{
    int row;
    int col;
    Node(int row,int col){
        this.row = row;
        this.col = col;
    }
}