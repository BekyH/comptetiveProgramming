class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights[0].length;j++){
                boolean [][] visited = new boolean[heights.length][heights[0].length];
                boolean [] pacific = new boolean[1];
                boolean [] atlantic = new boolean[1];
                dfs(heights,directions,i,j,pacific,atlantic,visited);
                if(pacific[0] && atlantic[0]){
                    List<Integer> list = Arrays.asList(i,j);
                    result.add(list);
            }
        }
        }
        return result;
        
    }
    public void dfs(int[][] heights,int[][] directions,int row,int col,boolean [] pacific,boolean [] atlantic,boolean [][] visited){
        
        
        visited[row][col] = true;
        if(row==heights.length-1  || col==heights[0].length-1){
            atlantic[0] = true;
        }
        if(row==0 || col==0){
            pacific[0] = true;
        }
        for(int [] direction:directions){
            int r = row + direction[0];
            int c = col + direction[1];
            if(r>=0 && r<heights.length && c>=0 && c<heights[0].length && !visited[r][c] && heights[row][col]>=heights[r][c]){
                if(r==heights.length-1 || c == heights[0].length-1){
                     atlantic[0] = true;
                }
                if(r==0 || c==0){
                    pacific[0] = true;
                }
                if(pacific[0] && atlantic[0]){
                    return;
                }
                dfs(heights,directions,r,c,pacific,atlantic,visited);
                
            }
        }
    }
}