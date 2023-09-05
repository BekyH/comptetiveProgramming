class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int [][] mat = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int r = j;
                int c = n-1-i;
                mat[r][c] = matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = mat[i][j];
            }
        }
    }
}