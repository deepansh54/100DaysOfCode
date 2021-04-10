class Solution {
    int m = 0;
    int n = 0;
    public int longestIncreasingPath(int[][] matrix) {
        
        m = matrix.length;
        n = matrix[0].length;
        
        int maxLip = 1;
        int[][] mlip = new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mlip[i][j] = lip(matrix,mlip,new boolean[m][n], i,j);
                maxLip = Math.max(maxLip,mlip[i][j]);
            }
        }
        
        return maxLip;
    }
    
    public int lip(int[][] matrix, int[][] mlip, boolean[][] visited, int i, int j){
        visited[i][j] = true;
        int currLip = 1;
        if(j+1 < n && !visited[i][j+1] && matrix[i][j+1]>matrix[i][j]){
            if(mlip[i][j+1]==0){
                mlip[i][j+1] = lip(matrix, mlip, visited, i, j+1);
            }
            currLip = Math.max(currLip, mlip[i][j+1]+1);
        }
        if(i+1 < m && !visited[i+1][j] && matrix[i+1][j]>matrix[i][j]){
            if(mlip[i+1][j]==0){
                mlip[i+1][j] = lip(matrix, mlip, visited, i+1, j);
            }
            currLip = Math.max(currLip, mlip[i+1][j]+1);
        }
        if(j-1 >= 0 && !visited[i][j-1] && matrix[i][j-1]>matrix[i][j]){
            if(mlip[i][j-1]==0){
                mlip[i][j-1] = lip(matrix, mlip, visited, i, j-1);
            }
            currLip = Math.max(currLip, mlip[i][j-1]+1);
        }
        if(i-1 >= 0 && !visited[i-1][j] && matrix[i-1][j]>matrix[i][j]){
            if(mlip[i-1][j]==0){
                mlip[i-1][j] = lip(matrix, mlip, visited, i-1, j);
            }
            currLip = Math.max(currLip, mlip[i-1][j]+1);
        }
        visited[i][j] = false;
        return currLip;
    }
}
//https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
