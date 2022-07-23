class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length-1;
        int n = matrix[0].length;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(matrix[mid][0]>target){
                right = mid-1;
            }
            else if(target>matrix[mid][n-1]){
                left = mid+1;
            }
            else{
                return binarySearch(matrix[mid],target);
            }
        }
        
        return false;
    }
    public boolean binarySearch(int [] row,int target){
        int left = 0;
        int right = row.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(row[mid]==target){
                return true;
            }
            else if(row[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        
        return false;
    }
}