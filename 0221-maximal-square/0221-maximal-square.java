class Solution {
    public int maximalSquare(char[][] matrix) {
        int max_area = 0;
        int [][] dp = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                dp[i][j] = Integer.parseInt(String.valueOf(matrix[i][j]));
            }
        }
         for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i>0 && j>0 && dp[i][j]==1){
                    dp[i][j] = Collections.min(new ArrayList<>(Arrays.asList(dp[i-1][j],dp[i][j-1],dp[i-1][j-1]))) + 1;
                }
                max_area = Math.max(max_area,dp[i][j]);
            }
        }
        
        return max_area * max_area;
    }
}