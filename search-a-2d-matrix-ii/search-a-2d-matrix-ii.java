class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row = 0;
        int col = n-1;
        return search(matrix,target,row,col,m);
       
    }
    public boolean search(int[][] matrix,int target,int row,int col,int m){
        if(row>=m || col<0){
            return false;
        }
        int num = matrix[row][col];
        if(target==num){
            return true;
        }
        else if(target>num){
             return search(matrix,target,row+1,col,m);
        }
        else{
            return search(matrix,target,row,col-1,m);
        }
    }
}