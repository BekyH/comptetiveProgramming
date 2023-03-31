class Solution {
    private int MOD = 1000000007;
    
    public int ways(String[] pizza, int k) {
        int rows = pizza.length;
        int cols = pizza[0].length();
        
        int[][] appleCounts = new int[rows][cols];
        for (int i = rows-1; i >= 0; i--) {
            for (int j = cols-1; j >= 0; j--) {
                if (pizza[i].charAt(j) == 'A') {
                    appleCounts[i][j] = 1;
                }
                if (i+1 < rows) {
                    appleCounts[i][j] += appleCounts[i+1][j];
                }
                if (j+1 < cols) {
                    appleCounts[i][j] += appleCounts[i][j+1];
                }
                if (i+1 < rows && j+1 < cols) {
                    appleCounts[i][j] -= appleCounts[i+1][j+1];
                }
            }
        }
        
        int[][][] dp = new int[rows][cols][k];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (appleCounts[i][j] > 0) {
                    dp[i][j][0] = 1;
                }
            }
        }
        
        for (int s = 1; s < k; s++) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    for (int t = i+1; t < rows; t++) {
                        if (appleCounts[i][j] - appleCounts[t][j] > 0) {
                            dp[i][j][s] = (dp[i][j][s] + dp[t][j][s-1]) % MOD;
                        }
                    }
                    for (int t = j+1; t < cols; t++) {
                        if (appleCounts[i][j] - appleCounts[i][t] > 0) {
                            dp[i][j][s] = (dp[i][j][s] + dp[i][t][s-1]) % MOD;
                        }
                    }
                }
            }
        }
        
        return dp[0][0][k-1];
    }
}
