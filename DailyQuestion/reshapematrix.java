public class reshape{
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if((m*n)!=(r*c)){
            return mat;
        }
        int [][] res = new int[r][c];
        int row = 0;
        int col = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row<r && col<c){
                    res[row][col]=mat[i][j];
                    col =col+1;
                }
                if(col==c){
                    
                    col=0;
                    row++;
                }
            }
        }
        return res;
    }

}