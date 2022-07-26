class Solution {
    public int shortestPath(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
         boolean [][][] visited = new boolean[m][n][k+1];
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        Deque<Node> deque = new ArrayDeque<>();
        Node start = new Node(0,0,k,0);
        deque.add(start);
        while(!deque.isEmpty()){
            Node node = deque.poll();
            int row = node.row;
            int col = node.col;
            int k_ = node.k;
            int step = node.step;
            
            if(row==m-1 && col==n-1 ){
                return step;
            }
            for(int [] dir:directions){
                int new_row = row + dir[0];
                int new_col = col + dir[1];
                if(new_row>=0 && new_row<m && new_col>=0 && new_col<n){
                     if(grid[new_row][new_col]==0 && !visited[new_row][new_col][k_]){
                         Node child = new Node(new_row,new_col,k_,step+1);
                         deque.add(child);
                         visited[new_row][new_col][k_] = true;
                     }
                    else if(grid[new_row][new_col]==1 && k_-1>=0 && !visited[new_row][new_col][k_-1]){
                         Node newchild = new Node(new_row,new_col,k_-1,step+1);
                         deque.add(newchild);
                         visited[new_row][new_col][k_-1] = true;
                         
                    }
                }
            }
            
        }
        
        return -1;
    }
}

class Node{
    int row;
    int col;
    int k;
    int step;
    Node(int row,int col,int k,int step){
        this.row = row;
        this.col = col;
        this.k = k;
        this.step = step;
    }
}