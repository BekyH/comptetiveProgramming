class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i=1;i<m;i++){
           for(int j=0;j<n;j++){
               if(j-1 >=0 && j+1<n){
                   matrix[i][j] =matrix[i][j] + Collections.min(Arrays.asList(matrix[i-1][j-1],matrix[i-1][j],matrix[i-1][j+1]));
                   
               }
               else if(j-1<0){
                   matrix[i][j] = matrix[i][j] + Math.min(matrix[i-1][j],matrix[i-1][j+1]);
               }
               else if(j+1>=n){
                    matrix[i][j] = matrix[i][j] + Math.min(matrix[i-1][j],matrix[i-1][j-1]);
               }
           } 
        }
        int min = Integer.MAX_VALUE;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(matrix[i][j]+":");
        //     }
        //     System.out.println();
        // }
        for(int  x:matrix[n-1]){
            min = Math.min(min,x);
        }
        
        return min;
    }
}