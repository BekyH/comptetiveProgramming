public class LongestIncreasingPath{
    public int longestIncreasingPath(int[][] matrix) {
        int move = Integer.MIN_VALUE;
        int [][]directions = {{1,0},{-1,0},{0,1},{0,-1}};
        HashMap<List<Integer>,Integer> memo = new HashMap<>();
        int m = matrix.length;
        int n= matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               int currentmove=dfs(matrix,memo,directions,matrix[i][j],i,j,m,n);
                move = Math.max(move,currentmove);
                
            }
        }
        return move;
    }
        public int dfs(int[][] matrix,HashMap<List<Integer>,Integer> memo,int[][] directions,int currentval,int row,int col,int m,int n){
            int counter = 1;
            List<Integer> list = Arrays.asList(row,col);
            if(memo.containsKey(list)){
                return memo.get(list);
                
            }
            for(int [] direction:directions){
                int new_row = row + direction[0];
                int new_col = col + direction[1];
                if(isValid(matrix,new_row,new_col,currentval,m,n)){
                    int temp = 1 + dfs(matrix,memo,directions,matrix[new_row][new_col],new_row,new_col,m,n);
                counter = Math.max(counter,temp);
                    
                }
                
            }
            
            memo.put(list,counter);
            return memo.get(list);                       
        }
    public boolean isValid(int[][] matrix,int row,int col,int val,int m,int n){
        if(0<=row  &&row<m && 0<=col && col<n && val<matrix[row][col]){
            return true;
        } 
        return false;
    }
    
}
}