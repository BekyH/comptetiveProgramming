class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
         int n = matrix[0].length;
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        int curr = matrix[i][j];
        if(i+1>=m || j+1>=n){
          continue;
        }
        int diagnoal = matrix[i+1][j+1];
        if(curr!=diagnoal){
          return false;
        }
      }
      
    }
    return true;
    }
}