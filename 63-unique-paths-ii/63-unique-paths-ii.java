class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1){
             return 0;
        }
        int [][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j] = 0;
                }
                else if(i==0 && j==0){
                    dp[i][j]=1;
                }
                else{
                    int prev = 0;
                    int prev1 = 0;
                    if(i-1>=0){
                        prev = dp[i-1][j];
                        
                    }
                    if(j-1>=0){
                        prev1 = dp[i][j-1];
                    }
                    dp[i][j] = prev1 + prev;
                }
            }
        }
        return dp[m-1][n-1];
    }
}