class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();
        //lcs
        int[][] dp = new int[m+1][n+1];
        
        for(int i=0; i<=m; i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
                else if(a[i-1] == b[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        return m+n-(2*dp[m][n]);
    }
}
//https://leetcode.com/problems/delete-operation-for-two-strings/
