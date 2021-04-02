class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int maxCount=0;
        int len = strs.length;
        
        Arrays.sort(strs, (p,q) -> ((Integer)p.length()).compareTo(q.length()));
        //System.out.println(Arrays.toString(strs));
        
        int[][] a = new int[len][2];
        for(int i=0;i<len;i++){
            for(char c : strs[i].toCharArray()){
                if(c == '0'){
                    a[i][0]++;
                }
                else{
                    a[i][1]++;
                }
            }
        }
        
        int[][][] dp = new int[m+1][n+1][len+1];
        
        for(int i=0; i<=m;i++){
            for(int j=0;j<=n;j++){
                for(int k=1;k<=len;k++){
                    if(a[k-1][0]>i || a[k-1][1] >j){
                        dp[i][j][k] = dp[i][j][k-1];
                    }
                    else{
                        dp[i][j][k] = Math.max(dp[i][j][k-1], 1+dp[i-a[k-1][0]][j-a[k-1][1]][k-1]);
                    }
                }
            }
        }
        
        return dp[m][n][len];
    }
}
//https://leetcode.com/problems/ones-and-zeroes/
