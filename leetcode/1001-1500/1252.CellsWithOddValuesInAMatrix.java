class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] mat = new int[n][m];
        int odd = 0;
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<m;j++){
                mat[indices[i][0]][j]+=1;
            }
            for(int j=0;j<n;j++){
                mat[j][indices[i][1]]+=1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]!=0 && mat[i][j]%2!=0){
                    odd++;
                }
            }
        }
        return odd;
    }
}
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/