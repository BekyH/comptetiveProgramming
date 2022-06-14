class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int left = 0;
        int right = m-1;
        int row = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(matrix[mid][0]>target){
                right = mid-1;
            }
            else if(matrix[mid][n-1]<target){
                left = mid+1;
            }
            else if(matrix[mid][0]<=target && target<=matrix[mid][n-1]){
                   row = mid;
                   break;
            }
        }
       // System.out.println(row);
        if(row==-1){
            return false;
        }
        int [] arr = matrix[row];
         left = 0;
        right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        
        return false;
    }
}