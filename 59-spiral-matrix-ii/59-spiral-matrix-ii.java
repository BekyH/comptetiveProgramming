class Solution {
    public int[][] generateMatrix(int n) {
       int left = 0;
       int right = n-1;
       int up = 0;
       int down = n-1;
       int [][] mat = new int[n][n];
        int i = 1;
        while(i<=n*n){
           i =  fillRight(mat,i,left,right,up);
            up++;
            i = fillDown(mat,i,up,down,right);
            right--;
            i = fillLeft(mat,i,left,right,down);
            down--;
            i = fillUp(mat,i,down, up,left);
            left++;
        }
        
        return mat;
    }
    public int fillRight(int [][] mat, int i, int left, int right,int up){
        for(int j=left;j<=right;j++){
            mat[up][j] = i;
            i++;
        }
        
        
        return i;
    }
    
    public int fillDown(int [][] mat, int i,int up, int down,int right){
        for(int j = up;j<=down;j++){
            mat[j][right] = i;
            i = i+1;
        }
        
        return i;
    }
    public int fillLeft(int [][] mat,int i, int left, int right, int down){
        for(int j = right;j>=left;j--){
            mat[down][j] = i;
            i = i+1;
        }
        
        return i;
    }
    public int fillUp(int [][] mat,int i,int down,int up,int left){
        for(int j=down;j>=up;j--){
            mat[j][left] = i;
            i = i + 1;
        }
        
        return i;
    }
}