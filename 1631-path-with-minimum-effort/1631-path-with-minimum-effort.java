class Solution {
    public int minimumEffortPath(int[][] heights) {
        int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        int m = heights.length;
        int n = heights[0].length;
        boolean [][] visited = new boolean[m][n];
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        Node node = new Node(0,0,0);
        
        pq.add(node);
        while(!pq.isEmpty()){
            Node current = pq.poll();
            int r = current.row;
            int c = current.col;
            int e = current.effort;
            visited[r][c]=true;
            if(r==m-1 && c==n-1){
                return e;
            }
            for(int [] direction :directions){
                 int row = r + direction[0];
                 int col = c + direction[1];
                if(row>=0 && row<m && col>=0 && col<n && !visited[row][col]){
                    Node child = new Node(row,col,Math.max(e,Math.abs(heights[r][c]-heights[row][col])));
                    pq.add(child);
                }
                
            }
        }
        return 0;
    }
    
}

class Node implements Comparable<Node>{
    int row;
    int col;
    int effort;
    Node(int row,int col,int effort){
        this.row = row;
        this.col = col;
        this.effort = effort;
    }
    @Override
    public int compareTo(Node node){
        return effort - node.effort;
    }
}

