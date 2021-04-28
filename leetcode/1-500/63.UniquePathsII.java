class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return getPaths(obstacleGrid, dp, obstacleGrid.length,obstacleGrid[0].length, 0,0);
    }
    
    public int getPaths(int[][] g, int[][] dp, int m, int n, int i, int j){
        if(i > m-1 || j > n-1){
            return 0;
        }
        if(g[i][j]==1){
            return 0;
        }
        if(i==m-1 && j == n-1){
            return 1;
        }
        if (dp[i][j] != -1){
            return dp[i][j];
        }

        dp[i][j] = getPaths(g, dp, m, n, i+1, j)+getPaths(g, dp, m, n, i, j+1);
        
        return dp[i][j];
    }
}
//https://leetcode.com/problems/unique-paths-ii/
